package com.iar.codingInterviews.graph.breadthFirstValues;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import com.iar.codingInterviews.graph.GciGraphNode;

public class GciGraphBreadthFirstValuesIterative<T> implements GciGraphBreadthFirstValues<T> {

	// Time: O(number of nodes)
	// Space: O(number of nodes)
	@Override
	public List<T> breadthFirstValues(GciGraphNode<T> root) {
		List<T> values = new ArrayList<T>();
		if (root == null)
			return values;
		Deque<GciGraphNode<T>> queue = new ArrayDeque<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			GciGraphNode<T> current = queue.pop();
			values.add(current.getValue());
			for (GciGraphNode<T> neighbour : current.getNeighbours()) {
				queue.add(neighbour);
			}
		}
		return values;
	}

}
