package halterman.command;

import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

public class CommandPatternTest {

	@InjectMocks 
	private Switch lightSwitch;

	@Mock
	Light light;
	
	@Spy
	Command lightsOn = new LightOnCommand(light);
	
	@Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        lightSwitch = new Switch();
        lightSwitch.setCommand(lightsOn);
    }
	
	@Test
	public void shouldTurnOnLight() {
		lightSwitch.pressButton();
		
		verify(light).switchOn();
	}
	
	
}
