package Ejercicio2;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class PrimePathCoverage {
	private int [] res = new int[100];
	
	@Test
	public void t1() {
		PrintPrimes o = new PrintPrimes();
		o.printPrimes(-1);
//		should be the first assert
//		assertEquals(new int [0].toString(),o.n_primes.toString()); 
		res[0] = 2;
		assertEquals(Arrays.toString(res),Arrays.toString(o.n_primes)); 
	}

	@Test
	public void t2() {
		PrintPrimes o = new PrintPrimes();
		o.printPrimes(2);
		res[0] = 2;
		res[1] = 3;
		assertEquals(Arrays.toString(res),Arrays.toString(o.n_primes));
	}
	
	@Test
	public void t3() {
		PrintPrimes o = new PrintPrimes();
		o.printPrimes(3);
		res[0] = 2;
		res[1] = 3;
		res[2] = 5;
		assertEquals(Arrays.toString(res),Arrays.toString(o.n_primes)); 
	}
	
	@Test
	public void t4() {
		PrintPrimes o = new PrintPrimes();
		o.printPrimes(5);
		res[0] = 2;
		res[1] = 3;
		res[2] = 5;
		res[3] = 7;
		res[4] = 11;
		assertEquals(Arrays.toString(res),Arrays.toString(o.n_primes)); 
	}
}
