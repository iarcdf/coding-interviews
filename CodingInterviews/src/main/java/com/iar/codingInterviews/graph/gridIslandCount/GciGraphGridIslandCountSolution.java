package com.iar.codingInterviews.graph.gridIslandCount;

import java.util.HashSet;
import java.util.Set;

public class GciGraphGridIslandCountSolution {

	// r = number of rows
	// w = number of columns
	// Time: O(r*c)
	// Space: O(r*c)
	public int solve(String[][] nodes) {
		int count = 0;
		Set<String> visited = new HashSet<>();
		for (int r = 0; r < nodes.length; r++) {
			for (int c = 0; c < nodes[r].length; c++) {
				if (!isVisited(r,c,visited) && nodes[r][c].equals("L")) {
					exploreIsland(nodes, r, c, visited);
					count++;
				}
			}
		}
		return count;
	}

	private boolean isVisited(int r, int c, Set<String> visited) {
		return visited.contains(r + ":" + c);
	}

	private boolean addToVisited(int r, int c, Set<String> visited) {
		return visited.add(r + ":" + c);
	}

	private void exploreIsland(String[][] nodes, int r, int c, Set<String> visited) {

		if (nodes[r][c].equals("W")) {
			return;
		}

		if (isVisited(r, c, visited))
			return;

		addToVisited(r, c, visited);

		// right
		if (c + 1 < nodes[r].length ) { 
			exploreIsland(nodes, r, c + 1, visited);
		}
		
		// down
		if (r + 1 < nodes.length) { 
			exploreIsland(nodes, r + 1, c, visited);
		} 
		
		// left
		if (c - 1 > 0) { 
			exploreIsland(nodes, r, c - 1, visited);
		} 
		
		// up
		if (r - 1 > 0) { 
			exploreIsland(nodes, r - 1, c, visited);
		}
	}
}
