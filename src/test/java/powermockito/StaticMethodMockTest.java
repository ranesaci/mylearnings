package powermockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
* @author sachin
* @date 04-Sep-2021
*/
@RunWith(PowerMockRunner.class)
@PrepareForTest(StaticMethodMockTest.class)
public class StaticMethodMockTest {
	
	@Test
	public void testGetData() {
		PowerMockito.mockStatic(StaticMethodMockTest.class);
		
		when(StaticMethodMock.getData("Sachin")).
		thenReturn("It is my name Sachin Rane");
		
		assertEquals("It is my name Sachin Rane", StaticMethodMock.getData("Sachin"));
	}
	
}

class StaticMethodMock {
	
	public static String getData(String str) {
		return "Data:" + str;
	}

}

