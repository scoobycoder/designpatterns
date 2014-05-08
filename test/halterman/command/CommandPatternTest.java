package halterman.command;

import static org.junit.Assert.*;

import org.junit.Test;

public class CommandPatternTest {

	@Test
	public void shouldTurnOnLight() {
		Light l = new Light();
		Command loc = new LightOnCommand(l);
		
		RemoteControl rc = new RemoteControl();
		rc.setCommand(loc);
		
		// Need Mockito here, will work on this from home.
	}
	
	
}
