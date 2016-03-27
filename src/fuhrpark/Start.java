package fuhrpark;

public class Start {
	public static void main(String[] args) {
		Fahrer fritz = new Fahrer("Fritz", 1);
		Auto auto = new Auto();
		auto.fahren(15);
		System.out.println("Das Auto hat den Tachostand " + auto.getTachostand());
	}
}
