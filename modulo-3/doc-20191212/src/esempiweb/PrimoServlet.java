package esempiweb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrimoServlet
 */
@WebServlet("/Primo")
public class PrimoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrimoServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("IP: " + request.getRemoteAddr()
		+ " => " + request.getHeader("User-Agent"));
		response.getWriter().append("<html><body>");
		for(int i = 0; i < 1000; i++) {
			response.getWriter().append("<h1>Ciao " + request.getRemoteAddr() + "; questo"
					+ " è il saluto n." + i + "!</h1>");
		}
		response.getWriter().append("</body></html>");
	}

}
