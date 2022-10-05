package com.iar.codingInterviews.graph.hasPath;

import java.util.Stack;

import com.iar.codingInterviews.graph.GciGraphNode;

public class GciGraphHasPathDepthIterative<T> implements GciGraphHasPath<T> {

	// n = # nodes
	// Time: O(n^2)
	// Space: O(n)
	@Override
	public boolean hasPath(GciGraphNode<T> source, GciGraphNode<T> destination) {
		Stack<GciGraphNode<T>> stack = new Stack<>();
		stack.push(source);
		while (!stack.isEmpty()) {
			GciGraphNode<T> current = stack.pop();
			if (current.getValue().equals(destination.getValue())) {
				return true;
			}
			for (int i = current.getNeighbours().size() - 1; i >= 0; i--) {
				GciGraphNode<T> neighbour = current.getNeighbours().get(i);
				stack.push(neighbour);
			}
		}
		return false;
	}
}
