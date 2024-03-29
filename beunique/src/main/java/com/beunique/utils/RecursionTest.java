package com.beunique.utils;

import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.util.Random;

import org.junit.Ignore;
import org.junit.Test;

public class RecursionTest {

	@Test
	public void testFalling_disks() {
		int[] A = new int[] { 5, 6, 4, 3, 6, 2, 3 };
		int[] B = new int[] { 2, 3, 5, 2, 4 };

		int result = Recursion.falling_disks(A, B);
		assertEquals(4, result);
	}

	@Test
	public void testFalling_disks4() {
		int[] A = new int[] { 10, 15, 8, 11, 15, 11, 14, 10, 10, 18, 5, 15 };
		int[] B = new int[] { 3, 6, 5, 1, 6 };

		int result = Recursion.falling_disks(A, B);
		assertEquals(5, result);
	}

	@Test
	public void testFalling_disks5() {
		int[] A = new int[] { 19, 7, 18, 9, 5, 5, 9, 8, 11, 16, 19, 16 };
		int[] B = new int[] { 7, 3, 2, 7, 6 };

		int result = Recursion.falling_disks(A, B);
		assertEquals(4, result);
	}

	@Test
	public void testFalling_disks2() {
		int[] A = new int[] { 5, 5, 5, 5, 5, 5, 5 };
		int[] B = new int[] { 2, 2, 2, 2 };

		int result = Recursion.falling_disks(A, B);
		assertEquals(4, result);
	}

	@Test
	public void testFalling_disks3() {
		int[] A = new int[] { 1, 1, 1, 1, 1, 1, 1 };
		int[] B = new int[] { 2, 2, 2, 2 };

		int result = Recursion.falling_disks(A, B);
		assertEquals(0, result);
	}

	@Test
	public void testFactoriel() {
		int a = 12;
		int result = Recursion.factoriel(a);
		assertEquals(479001600, result);
	}

	@Test
	public void testFalling_disksNew1() {
		int[] A = new int[] { 3 };
		int[] B = new int[] { 2 };

		assertEquals(1, Recursion.falling_disks(A, B));
	}

	@Test
	public void testFalling_disksNew2() {
		int[] A = new int[] { 2 };
		int[] B = new int[] { 3 };

		assertEquals(0, Recursion.falling_disks(A, B));
	}

	@Test
	public void testFalling_disksNew3() {
		int[] A = new int[] { 3, 2 };
		int[] B = new int[] { 2, 3 };

		assertEquals(2, Recursion.falling_disks(A, B));
	}

	@Test
	public void testFalling_disksNew4() {
		int[] A = new int[] { 3, 2 };
		int[] B = new int[] { 3, 2 };

		assertEquals(1, Recursion.falling_disks(A, B));
	}

	@Test
	public void testFalling_disks1() {
		int[] A = new int[] { 10, 15, 8, 11, 15, 11, 14, 10, 10, 18, 5, 15 };
		int[] B = new int[] { 3, 6, 5, 1, 6 };

		assertEquals(5, Recursion.falling_disks(A, B));
	}

	@Test
	public void testFalling_disks2R() {
		int[] A = new int[] { 5, 6, 4, 3, 6, 2, 3 };
		int[] B = new int[] { 2, 3, 5, 2, 4 };

		assertEquals(4, Recursion.falling_disks(A, B));
	}

	@Test
	public void testFalling_disks3R() {
		int[] A = new int[] { 5, 6, 4, 3, 6, 2, 3 };
		int[] B = new int[] { 3, 3, 3, 3 };

		assertEquals(4, Recursion.falling_disks(A, B));
	}

	@Test
	public void testFalling_disks4R() {
		int[] A = new int[] { 5, 6, 4, 3, 6, 2, 3 };
		int[] B = new int[] { 3, 2, 6, 3, 4, 6, 5 };

		assertEquals(2, Recursion.falling_disks(A, B));
	}

	@Test
	public void testFalling_disks5R() {
		int[] A = new int[] { 4, 3, 2, 1 };
		int[] B = new int[] { 1, 2, 3, 4 };

		assertEquals(4, Recursion.falling_disks(A, B));
	}

	@Test
	public void testFalling_disks6() {

		int[] A = new int[] { 1, 1, 1 };
		int[] B = new int[] { 2, 2, 2 };

		assertEquals(0, Recursion.falling_disks(A, B));
	}

	@Test
	public void testFalling_disks62() {

		int[] A = new int[] { 1, 1, 1 };
		int[] B = new int[] { 1, 1, 1 };

		assertEquals(3, Recursion.falling_disks(A, B));
	}

	@Ignore
	@Test
	public void testFalling_disksTimeTest() {
		Random randomGenerator = new Random();
		int randomRadius = randomGenerator.nextInt(1000000000);

		// Init arrays
		int[] A = new int[200000];
		int[] B = new int[200000];
		for (int i = 0; i < A.length; i++) {
			A[i] = randomRadius;
			B[i] = randomRadius;
		}

		Date d1 = new Date();
		int result = Recursion.falling_disks(A, B);
		Date d2 = new Date();
		double seconds = (d2.getTime() - d1.getTime()) / (double) 1000;
		System.out.println("It took nearly " + seconds
				+ " seconds to execute, random radius (" + randomRadius
				+ "), number of inserted disks" + result);

	}

	@Ignore
	@Test
	public void testFalling_disksTimeTest2() {
		// Init arrays
		int size = 20000;
		int[] A = new int[size];
		int[] B = new int[size];
		for (int i = 0; i < A.length; i++) {

			A[i] = 1000000000 - i;
			B[i] = i + 1;
		}

		// System.out.println("Radius: " + randomRadius);
		Date d1 = new Date();
		int result = Recursion.falling_disks(A, B);
		assertEquals(size, result);
		Date d2 = new Date();
		double seconds = (d2.getTime() - d1.getTime()) / (double) 1000;
		System.out.println("It took about " + seconds + " seconds to execute ("
				+ size + "), pyramid model ");

	}

	@Ignore
	@Test
	public void testFalling_disksTimeTest3() {

		// Init arrays
		int size = 200000;
		int[] A = new int[size];
		int[] B = new int[size];
		for (int i = 0; i < A.length; i++) {

			A[i] = 1000000000 - i;
			B[i] = 1 + i;
		}

		// System.out.println("Radius: " + randomRadius);
		Date d1 = new Date();
		int result = Recursion.falling_disks(A, B);
		assertEquals(size, result);
		Date d2 = new Date();
		double seconds = (d2.getTime() - d1.getTime()) / (double) 1000;
		System.out.println("It took about " + seconds + " seconds to execute ("
				+ size + ") pyramid model ");

	}

	@Ignore
	@Test
	public void testFalling_disksTimeTest4() {
		Random randomGenerator = new Random();
		// Init arrays
		int size = 200000;
		int[] A = new int[size];
		int[] B = new int[size];
		for (int i = 0; i < A.length; i++) {

			A[i] = 99000000 + randomGenerator.nextInt(1000000);
			B[i] = randomGenerator.nextInt(990000);
		}

		// System.out.println("Radius: " + randomRadius);
		Date d1 = new Date();
		int result = Recursion.falling_disks(A, B);
		assertEquals(size, result);
		Date d2 = new Date();
		double seconds = (d2.getTime() - d1.getTime()) / (double) 1000;
		System.out.println("It took about " + seconds + " seconds to execute ("
				+ size + ") random, but largest B is smaller than smallest A");

	}

	@Ignore
	@Test
	public void testFalling_disksTimeTest5() {
		Random randomGenerator = new Random();
		// Init arrays
		int size = 200000;
		int[] A = new int[size];
		int[] B = new int[size];
		for (int i = 0; i < A.length; i++) {

			if (i < 50000) {
				A[i] = 900000000 + randomGenerator.nextInt(100000000);
				B[i] = randomGenerator.nextInt(600000000);

			} else if (i < 100000) {

				A[i] = 800000000 + randomGenerator.nextInt(100000000);
				B[i] = 600000000 + randomGenerator.nextInt(100000000);

			} else if (i < 150000) {

				A[i] = 700000000 + randomGenerator.nextInt(100000000);

				B[i] = 700000000 + randomGenerator.nextInt(100000000);

			} else {

				A[i] = 600000000 + randomGenerator.nextInt(100000000);

				B[i] = 800000000 + randomGenerator.nextInt(100000000);

			}

		}

		// System.out.println("Radius: " + randomRadius);
		Date d1 = new Date();
		int result = Recursion.falling_disks(A, B);
		assertEquals(size, result);
		Date d2 = new Date();
		double seconds = (d2.getTime() - d1.getTime()) / (double) 1000;
		System.out.println("It took about " + seconds + " seconds to execute ("
				+ size
				+ ") pyramid model, (with random generators, four level)");

	}

	@Ignore
	@Test
	public void testFalling_disksStressTest() {
		Random randomGenerator = new Random();
		int randomRadius = randomGenerator.nextInt(1000000000);

		// Init arrays
		int a = randomGenerator.nextInt(200000);
		int b = randomGenerator.nextInt(200000);
		int[] A = new int[a];
		int[] B = new int[b];
		for (int i = 0; i < A.length; i++) {
			A[i] = randomGenerator.nextInt(1000000000);
			B[i] = randomGenerator.nextInt(1000000000);
		}

		System.out.println("Radius: " + randomRadius);
		System.out.println("A.length:" + a);
		System.out.println("B.length:" + b);
		System.out.println((a > b) ? "A>B" : "B>A");
		Date d1 = new Date();
		System.out.println(Recursion.falling_disks(A, B));
		Date d2 = new Date();
		double seconds = (d2.getTime() - d1.getTime()) / (double) 1000;
		System.out.println("It took nearly " + seconds
				+ " seconds to execute, pure random");

	}

}
