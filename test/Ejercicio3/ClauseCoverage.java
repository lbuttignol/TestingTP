package Ejercicio3;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClauseCoverage {

	@Test
	public void t1() {
		assertEquals(197,Cal.cal(3,2,9,15,2020));
	}

	@Test//(expected=IllegalArgumentException.class)
	public void t2() {
		Cal.cal(0,0,13,35,10001);	
	}
	
	@Test//(expected=IllegalArgumentException.class)
	public void t3() {
		Cal.cal(9,2,3,15,0);
	}
}
