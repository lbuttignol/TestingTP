package Ejercicio3;

import static org.junit.Assert.*;

import org.junit.Test;

public class RefactorizedClauseCoverage {

	@Test
	public void t1() {
		assertEquals(83,Cal.cal(2,20,5,13,2020));
	}

	@Test(expected=IllegalArgumentException.class)
	public void t2() {
		Cal.cal(0,0,-1,-3,0);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void t3() {
		Cal.cal(13,32,16,39,10001);
	}
}
