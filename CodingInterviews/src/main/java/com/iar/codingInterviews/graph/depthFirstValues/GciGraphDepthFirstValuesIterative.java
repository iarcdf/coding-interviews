package com.iar.codingInterviews.graph.depthFirstValues;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.iar.codingInterviews.graph.GciGraphNode;

public class GciGraphDepthFirstValuesIterative<T> implements GciGraphDepthFirstValues<T> {

	// Time: O(number of nodes)
	// Space: O(number of nodes)
	@Override
	public List<T> depthFirstValues(GciGraphNode<T> root) {
		List<T> values = new ArrayList<T>();
		if (root == null)
			return values;
		Stack<GciGraphNode<T>> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			GciGraphNode<T> current = stack.pop();
			values.add(current.getValue());
			for (int i = current.getNeighbours().size() - 1; i >= 0; i--) {
				GciGraphNode<T> neighbour = current.getNeighbours().get(i);
				stack.push(neighbour);
			}
		}
		return values;
	}

}
