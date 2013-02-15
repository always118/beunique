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

		}

		int fromA = firstBreakpoint.get(0);
		int toB = firstBreakpoint.get(1);
		int toA = fromA + toB;

		int[] A1 = Arrays.copyOfRange(A, fromA, toA);
		int[] B1 = Arrays.copyOfRange(B, 0, toB);

		if (B1.length > 0 && A1.length > 0) {
			int rightSide = falling_disks(A1, B1);
			int correction = rightSide - Math.min(A1.length, B1.length);

			ringsNr += rightSide - correction;
		}
		if (fromA > 0) {
			ringsNr++;
			ringsNr += fromA - 1;
		}

		return ringsNr;
	}

	protected static List<Integer> getFirstBreakpoint(int[] A, int[] B) {
		// 0 - A
		// 1 - B
		List<Integer> bp = new ArrayList<Integer>(2);

		int upTo = (A.length < B.length ? A.length : B.length);

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
