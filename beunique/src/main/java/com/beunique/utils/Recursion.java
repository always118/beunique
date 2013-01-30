package com.beunique.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recursion {
	public static int falling_disks(int[] A, int[] B) {
		int ringsNr = 0;

		List<Integer> firstBreakpoint = getFirstBreakpoint(A, B);
		if (firstBreakpoint.isEmpty()) {
			return Math.min(A.length, B.length);
			
			// return ringsNr;
		}

		Integer fromA = firstBreakpoint.get(0);
		Integer toB = firstBreakpoint.get(1);
		int toA = fromA + toB;
		int[] A1 = Arrays.copyOfRange(A, fromA, toA);
		int[] B1 = Arrays.copyOfRange(B, 0, toB);
		
		if (toA<3){
			toA = 3;
			
		}
// continue here
		int[] A2 = Arrays.copyOfRange(A, 0, toA - 3);
		int[] B2 = Arrays.copyOfRange(B, toB + 1, toB + 1 + toA - 2);

		if (B1.length > 0 && A1.length > 0 || A2.length > 0 && B2.length > 0) {
			ringsNr +=  falling_disks(A1, B1) + falling_disks(A2, B2);
		}
		if (fromA > 0) {
			ringsNr++;
		}

		return ringsNr;
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

	protected static List<Integer> getFirstBreakpoint(int[] A, int[] B) {
		// 0 - A
		// 1 - B
		List<Integer> bp = new ArrayList<Integer>(2);
		
		int upTo = (A.length < B.length ? A.length : B.length );

		for (int i = 0; i < upTo; i++) {
			for (int j = 0; j < B.length; j++) {
				if (A[i] < B[j]) {
					bp.add(i);
					bp.add(j);
					return bp;
				}

			}
		}

		return bp;

	}

	public static int factoriel(int a) {
		int f;

		if (a > 1) {
			f = factoriel(a - 1) * a;
		} else {
			return 1;
		}
		return f;

	}

}
