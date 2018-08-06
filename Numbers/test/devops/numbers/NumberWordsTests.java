package devops.numbers;

import org.junit.*;

import devops.numbers.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;
	
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}

	
	@Test
public void number1() {
		Assert.assertEquals( "1", "ONE", numberWords.toWords(1) ) ;
	}
	
	@Test
	public void number50() {
		Assert.assertEquals( "20", "TWENTY", numberWords.toWords(20) ) ;
	}
	@Test
	public void number18() {
		Assert.assertEquals( "18", "EIGHTEEN", numberWords.toWords(18) ) ;
	}
	@Test
	public void number998() {
		Assert.assertEquals( "998", "NINE HUNDREDS NINETY EIGHT", numberWords.toWords(998) ) ;
	}
	
	
//	@Test
//	public void numberOutOfRangeReturnsError() {
//		Assert.assertEquals( "Error", "Number out of range", numberWords.toWords( -1 ) ) ;
//	}
}
