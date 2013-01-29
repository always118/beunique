package com.beunique.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RecursionTest {

	@Test
	public void testFallingDisc() {
		int[] A = new int[] { 5, 6, 4, 3, 6, 2, 3 };
		int[] B = new int[] { 2, 3, 5, 2, 4 };

		int result = Recursion.fallingDisc(A, B);
		assertEquals(4, result);
	}
	
	@Test
	public void testCalculateBreakpoint(){
		int[] B = new int[] { 2, 3, 5, 2, 4 };
		assertEquals(2, Recursion.calculateBreakpoint(B, 1, 2, 4));
	}
	@Test
	public void testCalculateBreakpoint2(){
		int[] B = new int[] { 2, 3, 5, 2, 4 };
		assertEquals(0, Recursion.calculateBreakpoint(B, 0, B.length-1, 6));
	}
	@Test
	public void testCalculateBreakpoint3(){
		int[] B = new int[] { 2, 3, 5, 2, 4 };
		assertEquals(2, Recursion.calculateBreakpoint(B, 0, B.length, 4));
	}

}
