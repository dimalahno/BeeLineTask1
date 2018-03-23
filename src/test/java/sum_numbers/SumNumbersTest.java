package sum_numbers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumNumbersTest {

	SumNumbers numbers;

	@Before
	public void initTest(){
		numbers = new SumNumbers();
	}

	@After
	public void afterTest(){
		numbers = null;
	}

	@Test
	public void testSumNumber() {
		assertEquals("13456", numbers.sumLargeNumber("1111", "12345"));
		assertEquals("234", numbers.sumLargeNumber("111", "123"));
		assertEquals("1034", numbers.sumLargeNumber("111", "923"));
		assertEquals("246913578", numbers.sumLargeNumber("123456789", "123456789"));
		assertEquals("123458023", numbers.sumLargeNumber("1234", "123456789"));
	}
}