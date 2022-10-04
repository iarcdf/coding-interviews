package com.iar.codingInterviews.binaryTree.breathFirstValues;

import java.util.ArrayList;
import java.util.List;

import com.iar.codingInterviews.graph.GciGraphNode;

public class GciBinaryTreeBreadthFirstValuesRecursive<T> implements GciBinaryTreeBreadthFirstValues<T> {

	// Time: O(number of nodes)
	// Space: O(depth of tree)
	@Override
	public List<T> breadthFirstValues(GciGraphNode<T> root) {
		List<T> values = new ArrayList<T>();
		if (root == null)
			return values;
		values.add(root.getValue());
		breadthFirstValues(root, values);
		return values;
	}

	private void breadthFirstValues(GciGraphNode<T> parent, List<T> values) {

		if (parent == null)
			return;

		if (parent.getLeft() != null) {
			values.add(parent.getLeft().getValue());
		}

		if (parent.getRight() != null) {
			values.add(parent.getRight().getValue());
		}

		breadthFirstValues(parent.getLeft(), values);
		breadthFirstValues(parent.getRight(), values);
	}

}
