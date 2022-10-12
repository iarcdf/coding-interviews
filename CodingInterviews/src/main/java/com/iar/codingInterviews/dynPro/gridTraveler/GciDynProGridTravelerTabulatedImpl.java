package com.iar.codingInterviews.dynPro.gridTraveler;

public class GciDynProGridTravelerTabulatedImpl implements GciDynProGridTraveler {

	public int gridTraveler(int m, int n) {

		int[][] table = new int[m][n];

		for (int r = 0; r < table.length; r++) {
			for (int c = 0; c < table[r].length; c++) {
				if (r == 0 && c == 0) {
					table[r][c] = 0;
				} else if (r == 1 && c == 0) {
					table[1][0] = 1;
				} else if (r == 0 && c == 1) {
					table[0][1] = 1;
				} else if (c == 0) {
					table[r][0] = table[r - 1][0];
				} else if (r == 0) {
					table[0][c] = table[0][c - 1];
				} else {
					table[r][c] = table[r - 1][c] + table[r][c - 1];
				}
			}
		}

		return table[m - 1][n - 1];
	}
}
