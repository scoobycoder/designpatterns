package halterman.command;

//Client
public class Client {
	public static void main(String[] args) {
		
		//Invoker
		Switch lightSwitch = new Switch();

		//Light
		Light light = new Light();

		//Concrete Commands from Command Interface
		Command lightsOn = new LightOnCommand(light);
		Command lightsOff = new LightOffCommand(light);

		// switch on
		lightSwitch.setCommand(lightsOn);
		lightSwitch.pressButton();

		// switch off
		lightSwitch.setCommand(lightsOff);
		lightSwitch.pressButton();

	}

}
