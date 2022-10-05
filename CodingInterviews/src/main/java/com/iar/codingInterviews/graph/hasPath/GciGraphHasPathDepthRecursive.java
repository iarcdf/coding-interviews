package com.iar.codingInterviews.graph.hasPath;

import com.iar.codingInterviews.graph.GciGraphNode;

public class GciGraphHasPathDepthRecursive<T> implements GciGraphHasPath<T> {

	// n = # nodes
	// Time: O(n^2)
	// Space: O(n)
	@Override
	public boolean hasPath(GciGraphNode<T> source, GciGraphNode<T> destination) {
		if (source.getValue().equals(destination.getValue())) {
			return true;
		}
		for(GciGraphNode<T> neighbour : source.getNeighbours()) {
			if(hasPath(neighbour, destination)) {
				return true;
			}
		}
		return false;
	}
}
