package com.beunique.utils;

import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.util.Random;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CodilityTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testFalling_disksNew1() {
		int[] A = new int[] { 3 };
		int[] B = new int[] { 2 };

		assertEquals(1, Codility.falling_disks(A, B));
	}

	@Test
	public void testFalling_disksNew2() {
		int[] A = new int[] { 2 };
		int[] B = new int[] { 3 };

		assertEquals(0, Codility.falling_disks(A, B));
	}

	@Test
	public void testFalling_disksNew3() {
		int[] A = new int[] { 3, 2 };
		int[] B = new int[] { 2, 3 };

		assertEquals(2, Codility.falling_disks(A, B));
	}

	@Test
	public void testFalling_disksNew4() {
		int[] A = new int[] { 3, 2 };
		int[] B = new int[] { 3, 2 };

		assertEquals(1, Codility.falling_disks(A, B));
	}

	@Test
	public void testFalling_disks1() {
		int[] A = new int[] { 10, 15, 8, 11, 15, 11, 14, 10, 10, 18, 5, 15 };
		int[] B = new int[] { 3, 6, 5, 1, 6 };

		assertEquals(5, Codility.falling_disks(A, B));
	}

	@Test
	public void testFalling_disks2() {
		int[] A = new int[] { 5, 6, 4, 3, 6, 2, 3 };
		int[] B = new int[] { 2, 3, 5, 2, 4 };

		assertEquals(4, Codility.falling_disks(A, B));
	}

	@Test
	public void testFalling_disks3() {
		int[] A = new int[] { 5, 6, 4, 3, 6, 2, 3 };
		int[] B = new int[] { 3, 3, 3, 3 };

		assertEquals(4, Codility.falling_disks(A, B));
	}

	@Test
	public void testFalling_disks4() {
		int[] A = new int[] { 5, 6, 4, 3, 6, 2, 3 };
		int[] B = new int[] { 3, 2, 6, 3, 4, 6, 5 };

		assertEquals(2, Codility.falling_disks(A, B));
	}

	@Test
	public void testFalling_disks5() {
		int[] A = new int[] { 4, 3, 2, 1 };
		int[] B = new int[] { 1, 2, 3, 4 };

		assertEquals(4, Codility.falling_disks(A, B));
	}

	@Test
	public void testFalling_disks6() {

		int[] A = new int[] { 1, 1, 1 };
		int[] B = new int[] { 2, 2, 2 };

		assertEquals(0, Codility.falling_disks(A, B));
	}

	@Test
	public void testFalling_disksTimeTest() {
		Random randomGenerator = new Random();
		int randomRadius = randomGenerator.nextInt(1000000000);

		// Init arrays
		int[] A = new int[200000];
		int[] B = new int[200000];
		for (int i = 0; i < A.length; i++) {
			// A[i] = 2;
			// B[i] = 2;
			A[i] = randomRadius;
			B[i] = randomRadius;
		}

		System.out.println("Radius: " + randomRadius);
		Date d1 = new Date();
		Codility.falling_disks(A, B);
		Date d2 = new Date();
		double seconds = (d2.getTime() - d1.getTime()) / (double) 1000;
		System.out.println("It took nearly " + seconds + " seconds to execute");

	}

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
		int result = Codility.falling_disks(A, B);
		assertEquals(size, result);
		Date d2 = new Date();
		double seconds = (d2.getTime() - d1.getTime()) / (double) 1000;
		System.out.println("It took about " + seconds + " seconds to execute ("
				+ size + ") ");

	}

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
		int result = Codility.falling_disks(A, B);
		assertEquals(size, result);
		Date d2 = new Date();
		double seconds = (d2.getTime() - d1.getTime()) / (double) 1000;
		System.out.println("It took about " + seconds + " seconds to execute ("
				+ size + ") ");

	}

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
		int result = Codility.falling_disks(A, B);
		assertEquals(size, result);
		Date d2 = new Date();
		double seconds = (d2.getTime() - d1.getTime()) / (double) 1000;
		System.out.println("It took about " + seconds + " seconds to execute ("
				+ size + ") ");

	}

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
		int result = Codility.falling_disks(A, B);
		assertEquals(size, result);
		Date d2 = new Date();
		double seconds = (d2.getTime() - d1.getTime()) / (double) 1000;
		System.out.println("It took about " + seconds + " seconds to execute ("
				+ size + ") ");

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
		System.out.println(Codility.falling_disks(A, B));
		Date d2 = new Date();
		double seconds = (d2.getTime() - d1.getTime()) / (double) 1000;
		System.out.println("It took nearly " + seconds + " seconds to execute");

	}

}
