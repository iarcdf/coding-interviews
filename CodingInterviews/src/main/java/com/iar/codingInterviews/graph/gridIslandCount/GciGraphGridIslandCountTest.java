package com.iar.codingInterviews.graph.gridIslandCount;

import org.junit.jupiter.api.Test;

public class GciGraphGridIslandCountTest {

	@Test
	public void test() {
		repeatTests();
	}

	private void repeatTests() {
		test1();
	}

	private void test1() {
		String[][] nodes = createSample1();
		int result = (new GciGraphGridIslandCountSolution()).solve(nodes);
		assert (result == 3);
	}

	private String[][] createSample1() {
		return new String[][] { 
			{ "W", "L", "W", "W", "W" }, 
			{ "W", "L", "W", "W", "W" }, 
			{ "W", "W", "W", "L", "W" }, 
			{ "W", "W", "L", "L", "W" }, 
			{ "L", "W", "W", "L", "L" }, 
			{ "L", "L", "W", "W", "W" }, 
			};
	}

}