package halterman.command;

import static org.junit.Assert.*;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import org.junit.Before;
import org.junit.Test;

public class CommandPatternTest {

	@Mock
	Light light;
	
	@Mock
	Command lightsOn;
	
	private Switch control;
	
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        control = new Switch();
    }
	
	@Test
	public void shouldTurnOnLight() {
		Command lightsOn = new LightOnCommand(light);

		// switch on
		control.setCommand(lightsOn);
		control.pressButton();

		//verify
		
		// Need Mockito here, will work on this from home.
	}
	
	
}
