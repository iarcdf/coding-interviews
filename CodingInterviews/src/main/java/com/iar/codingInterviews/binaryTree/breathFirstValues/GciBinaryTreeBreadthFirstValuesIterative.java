package com.iar.codingInterviews.binaryTree.breathFirstValues;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import com.iar.codingInterviews.binaryTree.GciBinaryTreeNode;

public class GciBinaryTreeBreadthFirstValuesIterative<T> implements GciBinaryTreeBreadthFirstValues<T> {

	// Time: O(number of nodes)
	// Space: O(number of nodes)
	@Override
	public List<T> breadthFirstValues(GciBinaryTreeNode<T> root) {
		List<T> values = new ArrayList<T>();
		if (root == null)
			return values;
		Deque<GciBinaryTreeNode<T>> queue = new ArrayDeque<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			GciBinaryTreeNode<T> current = queue.pop();
			values.add(current.getValue());
			if (current.getLeft() != null) {
				queue.add(current.getLeft());
			}
			if (current.getRight() != null) {
				queue.add(current.getRight());
			}
		}
		return values;
	}

}
