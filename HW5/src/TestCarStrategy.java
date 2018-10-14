import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
public class TestCarStrategy {
	@Test
	public void testConstructor()
	{
		CarStrategy cs = new CarStrategy("Test");
		assertEquals(cs.getExtendedDescription(),"Test");
	}
}
