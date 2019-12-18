package controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.fasterxml.jackson.databind.ObjectMapper;

import business.PersonaManager;
import model.Persona;
import model.CollezionePersone;

/**
 * Servlet implementation class PersoneController
 */
@WebServlet(description = "Elenco di persone", urlPatterns = { "/persone" })
public class PersoneController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PersoneController() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println(request.getRemoteAddr() + ": passo per il controller");
		String xml = request.getParameter("xml");
		String json = request.getParameter("json");

		// implemento la logica di un controller
		// recupero il model
		PersonaManager pm = new PersonaManager();
		CollezionePersone persone = pm.elenco();

		if (xml == null && json == null) {
			// aggiungo il "payload" alla request che poi passerò alla JSP
			request.setAttribute("elencoPersone", persone.getPersone());

			// passare il controllo al view engine (nel nostro caso JSP)
			request.getRequestDispatcher("WEB-INF/view/elencoPersone.jsp").forward(request, response);
		} else if (json != null) {
			ObjectMapper om = new ObjectMapper();
			response.getWriter().append(om.writeValueAsString(persone));
		} else {
			try {
				JAXBContext jc = JAXBContext.newInstance(CollezionePersone.class);
				Marshaller m = jc.createMarshaller();
				m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				m.marshal(persone, baos);

				response.getWriter().append(new String(baos.toByteArray()));
			} catch (JAXBException e) {
				e.printStackTrace();
			}
		}
	}

}
