import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;


public class TestCar {
	@Test
	public void makeCar() {
		Car car = new Car("Test","Test","Test","Test","Test");
		assertEquals(car.getDescription(),"Test Test Test Test Test");
	}
	@Test
	public void testStrategy()
	{
		CarStrategy csTest = mock(CarStrategy.class);
		Car car = new Car("Test","Test","Test","Test","Test");
		car.setCarStrategy(csTest);
		when(csTest.getExtendedDescription()).thenReturn("Extended Test");
		assertEquals(car.getDescription(),"Extended Test");
	}
	@Test
	public void testRemoveStrategy()
	{
		CarStrategy csTest = mock(CarStrategy.class);
		Car car = new Car("Test","Test","Test","Test","Test");
		car.setCarStrategy(csTest);
		car.removeCarStrategy();
		assertEquals(car.getDescription(),"Test Test Test Test Test");
	}
}
