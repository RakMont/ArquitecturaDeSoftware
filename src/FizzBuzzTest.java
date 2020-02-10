import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	
	
	@Test
	void generateNumero1() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("1",fb.generate1(1));
		
	}
	@Test
	void generateNumero2() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("2",fb.generate1(2));
		
	}
	@Test
	void generateNumeroFizz() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("Fizz",fb.generate1(3));
		
	}
	@Test
	void generateNumeroBuzz() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("Buzz",fb.generate1(5));
		
	}
	
	@Test
	void generateNumeroBuzz10() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("Buzz",fb.generate1(10));
		
	}
	@Test
	void generateNumeroFizzBuzz() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("FizzBuzz",fb.generate1(15));
		
	}
	
	
	@Test
	void generateNumero30() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("FizzBuzz",fb.generate1(30));
		
	}
	
	@Test
	void generateNumero20() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("Buzz",fb.generate1(20));
		
	}
	@Test
	void generateNumero25() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("Buzz",fb.generate1(25));
		
	}
	
	@Test
	void generateNumero24() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("Fizz",fb.generate1(24));
		
	}
	@Test
	void generateNumero45() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("FizzBuzz",fb.generate1(45));
		
	}
	@Test
	void generateNumero46() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("46",fb.generate1(46));
		
	}
	
   
	
}
