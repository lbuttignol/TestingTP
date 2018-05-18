package Ejercicio2;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class NodeCoverage {

private int[] res = new int[100];
	
	@Test
	public void t1() {
		PrintPrimes o = new PrintPrimes();
		o.printPrimes(3);
		res[0] = 2;
		res[1] = 3;
		res[2] = 5;
		assertEquals(Arrays.toString(res),Arrays.toString(o.n_primes));
	}

}
