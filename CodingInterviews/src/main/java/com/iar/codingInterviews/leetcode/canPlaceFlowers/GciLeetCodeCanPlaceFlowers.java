package com.iar.codingInterviews.leetcode.canPlaceFlowers;

import org.junit.jupiter.api.Test;

public class GciLeetCodeCanPlaceFlowers {

	@Test
	public void test1() {
		assert (canPlaceFlowers(new int[] { 0, 0, 1, 0, 1 }, 1));
	}

	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		boolean lastPlotPlanted = false;
		int availableSpots = 0;
		for (int i = 0; i < flowerbed.length; i++) {
			if (flowerbed[i] == 0) {
				if (i == 0 && flowerbed.length == 1) {
					availableSpots++;
					lastPlotPlanted = true;
				} else if (i == 0 && i + 1 < flowerbed.length && flowerbed[i + 1] == 0) {
					availableSpots++;
					lastPlotPlanted = true;
				} else if (i - 1 >= 0 && i + 1 < flowerbed.length && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0
						&& !lastPlotPlanted) {
					availableSpots++;
					lastPlotPlanted = true;
				} else if (i - 1 >= 0 && i + 1 == flowerbed.length && flowerbed[i - 1] == 0 && !lastPlotPlanted) {
					availableSpots++;
					lastPlotPlanted = true;
				} else {
					lastPlotPlanted = false;
				}
			} else {
				lastPlotPlanted = false;
			}
		}
		return availableSpots >= n;
	}

}
