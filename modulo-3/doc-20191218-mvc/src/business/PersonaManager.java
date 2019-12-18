package business;

import java.util.ArrayList;
import java.util.List;

import model.Persona;
import model.CollezionePersone;

public class PersonaManager {
	
	
	public CollezionePersone elenco() {
		CollezionePersone _return = new CollezionePersone();
		List<Persona> list = new ArrayList<>();
		
		list.add(new Persona("Mario", "Rossi", 180, 80));
		list.add(new Persona("Anna", "Verdi", 170, 60));
		list.add(new Persona("Mario", "Neri", 185, 120));
		list.add(new Persona("Luigi", "Gialli", 155, 70));
		
		_return.setPersone(list);
		return _return;
	}

}
