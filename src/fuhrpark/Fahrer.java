package fuhrpark;

public class Fahrer {
	private String name;
	private int fahrerId;
	
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
