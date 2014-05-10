package halterman.command;

import static org.junit.Assert.*;
import halterman.command.Command;
import halterman.command.Light;
import halterman.command.LightOnCommand;
import halterman.command.Switch;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;

public class CommandPatternTest {

	@InjectMocks 
	private Switch lightSwitch;

	@Mock
	Light light;
	
	@Mock
	Command lightsOn;
	
	@Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        lightSwitch = new Switch();
    }
	
	@Test
	public void shouldTurnOnLight() {
		lightSwitch.pressButton();
		
		
		verify(light).switchOn();
	}
	
	
}
