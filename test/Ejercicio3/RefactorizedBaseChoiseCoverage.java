package Ejercicio3;

import static org.junit.Assert.*;

import org.junit.Test;

public class RefactorizedBaseChoiseCoverage {

	@Test
	public void t1Base() {
		assertEquals(120,Cal.cal(1, 3, 5, 3, 2019));
	}
	
	@Test
	public void t2() {
		assertEquals(121,Cal.cal(1, 3, 5, 3, 2020));
	}
	
	@Test
	public void t3() {
		assertEquals(0,Cal.cal(2, 3, 2, 3, 2019));
	}
	
	// this case violate the precondition
	@Test//(expected=IllegalArgumentException.class)
	public void t4() {
		Cal.cal(5, 3, 1, 3, 2019);
	}
	
	@Test
	public void t5() {
		assertEquals(146,Cal.cal(1, 3, 5, 29, 2019));
	}
	
	@Test
	public void t6() {
		assertEquals(147,Cal.cal(1, 3, 5, 30, 2019));
	}
	
	@Test
	public void t7() {
		assertEquals(148,Cal.cal(1, 3, 5, 31, 2019));
	}
	
	// this case violate the precondition
	@Test//(expected=IllegalArgumentException.class) 
	public void t8() {
		Cal.cal(1, 3, 5, 32, 2019); 
	}
	
	@Test
	public void t9() {
		assertEquals(120,Cal.cal(1, 3, 5, 3, 2100));
	}

	@Test
	public void t10() {
		assertEquals(121,Cal.cal(1, 3, 5, 3, 2000));
	}
}
