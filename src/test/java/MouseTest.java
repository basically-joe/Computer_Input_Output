import device_management.Mouse;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MouseTest {

	Mouse mouse;

	@Before
	public void before(){
		mouse = new Mouse("Wireless", 2);
	}

	@Test
	public void canGetType() {
		assertEquals("Wireless", mouse.getType());
	}

	@Test
	public void canGetButtonNumber() {
		assertEquals(2, mouse.getNumberOfButtons());
	}
}