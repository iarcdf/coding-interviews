package com.iar.codingInterviews.dynPro.gridTraveler;

public class GciDynProGridTravelerImpl implements GciDynProGridTraveler {

	public int gridTraveler(int m, int n) {

		if (m == 0)
			return 0;

		if (n == 0)
			return 0;

		if (m == 1 && n == 1)
			return 1;

		return gridTraveler(m - 1, n) + gridTraveler(m, n - 1);
	}
}
