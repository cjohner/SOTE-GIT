package fuhrpark;

public class Fahrer {
	private String name;
	private int fahrerId;
	
	/**
	 * 
	 * @param name: Vor- und Nachname 
	 * @param fahrerId: kann nicht mehr geaendert werden
	 */
	public Fahrer(String name, int fahrerId) {
		this.name = name;
		this.fahrerId = fahrerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFahrerId() {
		return fahrerId;
	}
}
