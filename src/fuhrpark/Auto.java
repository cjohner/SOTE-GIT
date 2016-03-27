/** Ein erster Kommentar */
package fuhrpark;

public class Auto {
	private String id;
	private int tachostand = 0;
	private Fahrer fahrer;
	
	public void fahren(int km){
		tachostand += km;
	}

	public int getTachostand() {
		return tachostand;
	}

	public void setTachostand(int tachostand) {
		this.tachostand = tachostand;
	}

	public Fahrer getFahrer() {
		return fahrer;
	}

	public void setFahrer(Fahrer fahrer) {
		this.fahrer = fahrer;
	}

	public String getId() {
		return id;
	}
	
	
	
}
