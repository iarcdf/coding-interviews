package com.iar.codingInterviews.graph.depthFirstValues;

import java.util.ArrayList;
import java.util.List;

import com.iar.codingInterviews.graph.GciGraphNode;

public class GciGraphDepthFirstValuesRecursive<T> implements GciGraphDepthFirstValues<T> {

	// Time: O(number of nodes)
	// Space: O(depth of tree)
	@Override
	public List<T> depthFirstValues(GciGraphNode<T> root) {
		List<T> values = new ArrayList<T>();
		if (root == null)
			return values;
		depthFirstValues(root, values);
		return values;
	}

	private void depthFirstValues(GciGraphNode<T> current, List<T> values) {
		values.add(current.getValue());
		for (GciGraphNode<T> neighbour : current.getNeighbours()) {
			depthFirstValues(neighbour, values);
		}
	}

}
