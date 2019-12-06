package esercizio.cli;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;
import java.util.List;

import esercizio.dao.ContattoDao;
import esercizio.model.Contatto;

public class NetCli {

	private static final String CMD_HELP = "help";
	private static final String CMD_EXIT = "exit";
	private static final String CMD_LIST = "list";
	private static final String CMD_NEW = "new";
	private static final int CLI_PORT = 5000;

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(CLI_PORT);
		System.out.println("dao cli server avviato sulla porta " + CLI_PORT);
		while (true) {
			Socket s = ss.accept();
			new Thread(() -> {
				try {
					startCli(s);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}).start();
		}
	}

	private static void startCli(Socket s) throws IOException, ClassNotFoundException, SQLException {
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintWriter pw = new PrintWriter(s.getOutputStream());
		ContattoDao cDao = new ContattoDao();
		messaggio(pw, "\n\rBenvenuto!");
		messaggio(pw, "\n\rComandi disponibili: new, list, help, exit\n\n\r");
		// new, list
		String comando = leggi(br);
		while (!CMD_EXIT.contentEquals(comando)) {
			switch (comando) {
			case CMD_NEW:
				cDao.create(chiediContatto(br, pw));
				messaggio(pw, "\n\rContatto aggiunto!\n\n\r");
				break;
			case CMD_LIST:
				stampaListaContatti(pw, cDao.list());
				messaggio(pw, "\n\r******************************\n\n\r");
				break;
			case CMD_HELP:
				break;
			case CMD_EXIT:
				messaggio(pw, "\n\rgrazie per aver usato questo programma\n\n\r");
				break;
			default:
				messaggio(pw, "\n\rcomando non disponibile o errato\n\n\r");
			}
			comando = leggi(br);
		}
	}

	private static void stampaListaContatti(PrintWriter pw, List<Contatto> list) {
		for (Contatto c : list) {
			messaggio(pw, "\n\r" + c.toString());
		}
	}

	private static Contatto chiediContatto(BufferedReader br, PrintWriter pw) throws IOException {
		Contatto _return = new Contatto();
		messaggio(pw, "\n\r------  NUOVO CONTATTO -------");
		messaggio(pw, "\n\rinserire nome: ");
		_return.setNome(leggi(br));
		messaggio(pw, "\n\rinserire cognome: ");
		_return.setCognome(leggi(br));
		messaggio(pw, "\n\rinserire e-mail: ");
		_return.setEmail(leggi(br));
		messaggio(pw, "\n\rinserire telefono: ");
		_return.setTelefono(leggi(br));
		return _return;
	}

	private static void messaggio(PrintWriter pw, String string) {
		pw.print(string);
		pw.flush();
	}

	private static String leggi(BufferedReader br) throws IOException {
		return br.readLine().toLowerCase();
	}

}
