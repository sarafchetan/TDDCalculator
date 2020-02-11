package calculator;

import static org.hamcrest.CoreMatchers.is;
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
	public void notAccpetingInputforAddition() {
		Integer sum=calctest.stringadd("");
		assertThat(sum,is(0));
	}
	
	@Test
	public void accpetingInputforAddition() {
		Integer sum=calctest.stringaddvalid("2","3");
		assertThat(sum,is(5));
	}
	
	@Test(expected = InvalidInputException.class)
	public void invalidInputAddition() throws Exception {
		calctest.stringaddvalid("2,,1");
		
	}
	
	@Test
	public void acceptDelimitedValueWithPipeAddition() throws Exception {
		
		Integer sum=calctest.stringaddusingdelimiter("9|3");
		assertThat(sum,is(12));
	}
	
	@Test
	public void sumofMultipleNumberForInput() throws Exception {
		
		Integer sum=calctest.stringaddusingdelimiter("1,4)3$3$2");
		assertThat(sum,is(13));
	}
	
	@Test(expected = InvalidInputException.class)
	public void invalidInputAdditionForDecimal() throws Exception {
		calctest.stringaddvalid("2.1@1");
		
		
	}
	
	@Test(expected = InvalidInputException.class)
	public void invalidInputAdditionForNegative() throws Exception {
		calctest.stringaddvalid("2|-1|-22");
		
	}
	
	
}
