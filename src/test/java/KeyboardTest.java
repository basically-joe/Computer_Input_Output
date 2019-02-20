import device_management.Keyboard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class KeyboardTest {

	Keyboard keyboard;

	@Before
	public void before(){
		keyboard = new Keyboard("QWERTY", 100);
	}

	@Test
	public void canGetType(){
		assertEquals("QWERTY", keyboard.getType());
	}

	@Test
	public void canGetNumberOfButtons(){
		assertEquals(100, keyboard.getNumberOfButtons());
	}

	@Test
	public void canSendData(){
		assertEquals("Buttons pressed ABC", keyboard.sendData(" ABC"));
	}
}
