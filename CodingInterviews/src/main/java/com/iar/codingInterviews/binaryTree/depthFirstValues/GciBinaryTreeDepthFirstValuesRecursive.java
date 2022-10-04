package com.iar.codingInterviews.binaryTree.depthFirstValues;

import java.util.ArrayList;
import java.util.List;

import com.iar.codingInterviews.binaryTree.GciBinaryTreeNode;

public class GciBinaryTreeDepthFirstValuesRecursive<T> implements GciBinaryTreeDepthFirstValues<T> {

	// Time: O(number of nodes)
	// Space: O(depth of tree)
	@Override
	public List<T> depthFirstValues(GciBinaryTreeNode<T> root) {
		List<T> values = new ArrayList<T>();
		depthFirstValues(root, values);
		return values;
	}

	private void depthFirstValues(GciBinaryTreeNode<T> parent, List<T> values) {
		
		if (parent == null)
			return;

		values.add(parent.getValue());
		
		if (parent.getLeft() != null) {
			depthFirstValues(parent.getLeft(), values);
		}
		
		if (parent.getRight() != null) {
			depthFirstValues(parent.getRight(), values);
		}
	}

}
