package esempi.ereditarieta;

public class Rettile extends Animale {

	@Override
	public void mangia() {
		System.out.println("Il rettile dice: UHMM...");
	}

	@Override
	public void muoviti() {
//		super.muoviti();
		System.out.println("Il rettile dice: SSSHSHSHS...");
	}

}
