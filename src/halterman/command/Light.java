package halterman.command;

//Receiver
public class Light {
	private boolean on;

	public void switchOn() {
		on = true;
		System.out.println("Turned Light On.");
	}

	public void switchOff() {
		on = false;
		System.out.println("Turned Light Off.");
	}

}
