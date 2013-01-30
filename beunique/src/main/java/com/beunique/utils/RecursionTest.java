package com.beunique.utils;

import static org.junit.Assert.*;

import java.util.List;

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
	public void testGetFirstBreakpoint() {
		int[] A = new int[] { 5, 6, 4, 3, 6, 2, 3 };
		int[] B = new int[] { 2, 3, 2, 5, 4 };

		List<Integer> result = Recursion.getFirstBreakpoint(A, B);
		assertSame(2, result.get(0));
		assertSame(3, result.get(1));
	}

	@Test
	public void testCalculateBreakpoint() {
		int[] B = new int[] { 2, 3, 5, 2, 4 };
		assertEquals(2, Recursion.calculateBreakpoint(B, 1, 2, 4));
	}

	@Test
	public void testCalculateBreakpoint2() {
		int[] B = new int[] { 2, 3, 5, 2, 4 };
		assertEquals(0, Recursion.calculateBreakpoint(B, 0, B.length - 1, 6));
	}

	@Test
	public void testCalculateBreakpoint3() {
		int[] B = new int[] { 2, 3, 5, 2, 4 };
		assertEquals(2, Recursion.calculateBreakpoint(B, 0, B.length, 4));
	}

	@Test
	public void testFactoriel() {
		int a = 12;
		int result = Recursion.factoriel(a);
		assertEquals(479001600, result);
	}

}
