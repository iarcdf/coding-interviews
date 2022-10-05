package com.iar.codingInterviews.graph.undirectedHasPath;

import java.util.HashSet;
import java.util.Set;

import com.iar.codingInterviews.graph.GciGraphNode;

public class GciGraphUndirectedHasPathDepthRecursive<T> implements GciGraphUndirectedHasPath<T> {

	// n = # nodes
	// Time: O(n^2)
	// Space: O(n)
	@Override
	public boolean hasPath(GciGraphNode<T> source, GciGraphNode<T> destination) {
		return hasPath(source, destination, new HashSet<GciGraphNode<T>>());
	}

	private boolean hasPath(GciGraphNode<T> source, GciGraphNode<T> destination, Set<GciGraphNode<T>> visited) {
		if(visited.contains(source)) {
			return false;
		}
		visited.add(source);
		if (source.getValue().equals(destination.getValue())) {
			return true;
		}
		for (GciGraphNode<T> neighbour : source.getNeighbours()) {
			if (hasPath(neighbour, destination, visited)) {
				return true;
			}
		}
		return false;
	}
}
