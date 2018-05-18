package Ejercicio3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CorrelatedActiveClauseCoverage {

	@Test
	public void t1() {
		assertEquals(62,Cal.cal(1,2,3,4, 2000));
	}
	
	@Test
	public void t2() {
		assertEquals(61,Cal.cal(1,2,3,4, 2100));
	}
	
	@Test
	public void t3() {
		assertEquals(62,Cal.cal(1,2,3,4, 2020));
	}
	
	@Test
	public void t4() {
		assertEquals(61,Cal.cal(1,2,3,4, 2019));
	}
	
}
