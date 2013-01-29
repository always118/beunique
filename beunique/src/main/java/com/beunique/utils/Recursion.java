package com.beunique.utils;

public class Recursion {
	public static int fallingDisc(int[] A, int[] B) {
		int a;
		int fromA = 0;
		int fromB = 0;
		int toA = A.length;
		int toB = B.length;
		int ringsNr = 0;

		for (int i = 0; i < A.length; i++) {
			a = A[i];
			int breakpoint = calculateBreakpoint(B, fromB, toB, a);	
			if (breakpoint != 0){
				
			}
			
		}
		

		return 0;
	}



	/**
	 * @param B
	 *            - disks
	 * @param from
	 *            0-based
	 * @param to
	 *            0-based
	 * @param current
	 *            current
	 * @return
	 */
	protected static int calculateBreakpoint(int[] B, int from, int to,
			int current) {

		do {
			if (B[from] > current) {
				return from;
			}
			from++;
		} while (from <= to);

		return 0;

	}

}
