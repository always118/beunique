package com.beunique.utils;

import java.util.HashMap;
import java.util.Map;

public class Codility {

	public static int falling_disks1(int[] A, int[] B) {
		int ringsNr = A.length;

		for (int a : A) {

			for (int j = 0; j < ringsNr; j++) {
				if (a < B[j]) {
					ringsNr = j;
				}

			}

		}

		return ringsNr;

	}

	public static int falling_disks(int[] A, int[] B) {
		int lastDisk = 0;
		int lastDiskIndex = 0;
		int ringsNr = 0;
		int minSize = 0;

		for (int j = 0; j < B.length; j++) {
			int b = B[j];

			if (B[j] <= lastDisk || B[j] <= minSize) {
				if (lastDiskIndex > 0) {
					lastDiskIndex--;
					A[lastDiskIndex] = -1;
					ringsNr++;
				}

				continue;

			}

			for (int i = 0; i < A.length; i++) {
				if (A[i] < minSize || i == 0) {
					minSize = A[i];
				}

				if (b > A[0]) {
					return ringsNr;
				}

				if (b > A[i] && i > 0) {
					lastDiskIndex = i - 1;
					A[lastDiskIndex] = -1;
					ringsNr++;
					lastDisk = B[j];
					break;
				}
				if (A[i] == -1) {
					break;
				}

				if (ringsNr == 0 && i == A.length - 1) {
					lastDiskIndex = A.length - 1;
					A[lastDiskIndex] = -1;
					ringsNr++;
					lastDisk = B[j];
				}

			}

		}

		return ringsNr;
	}

	public static void main(String[] args) {
		int[] A = new int[] { 10, 15, 8, 11, 15, 11, 14, 10, 10, 18, 5, 15 };
		int[] B = new int[] { 3, 6, 5, 1, 6 };

		System.out.println(falling_disks(A, B));

	}

}
