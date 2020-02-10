package calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalcTest {

	private CalculateOperation calctest;
	
	@Before
	public void setUp() throws Exception {
        calctest = new CalculateOperation();
    }
	
	@Test
	public void checkAdd() {
		assertEquals(6,calctest.add(3, 3));
	}
	
	@Test
	public void checkDivision() {
		assertEquals(2,calctest.division(8, 4));
	}
	
	@Test
	public void checkmultiple() {
		assertEquals(32,calctest.multiplication(8, 4));
	}
	
	
}
