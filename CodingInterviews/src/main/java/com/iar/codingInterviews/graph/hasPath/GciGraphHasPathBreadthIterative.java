package com.iar.codingInterviews.graph.hasPath;

import java.util.ArrayDeque;
import java.util.Deque;

import com.iar.codingInterviews.graph.GciGraphNode;

public class GciGraphHasPathBreadthIterative<T> implements GciGraphHasPath<T> {

	// n = # nodes
	// Time: O(n^2)
	// Space: O(n)
	@Override
	public boolean hasPath(GciGraphNode<T> source, GciGraphNode<T> destination) {
		Deque<GciGraphNode<T>> queue = new ArrayDeque<>();
		queue.add(source);
		while (!queue.isEmpty()) {
			GciGraphNode<T> current = queue.pop();
			if (current.getValue().equals(destination.getValue())) {
				return true;
			}
			for (GciGraphNode<T> neighbour : current.getNeighbours()) {
				queue.add(neighbour);
			}
		}
		return false;
	}
}
