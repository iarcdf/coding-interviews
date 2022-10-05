package com.iar.codingInterviews.binaryTree.minimum;

import java.util.ArrayDeque;
import java.util.Deque;

import com.iar.codingInterviews.binaryTree.GciBinaryTreeNode;

public class GciBinaryTreeMinimumIterative implements GciBinaryTreeMinimum {

	// Time: O(number of nodes)
	// Space: O(number of nodes)
	@Override
	public GciBinaryTreeNode<Integer> minimum(GciBinaryTreeNode<Integer> root) {
		if (root == null)
			return null;
		GciBinaryTreeNode<Integer> minimum = root;
		Deque<GciBinaryTreeNode<Integer>> queue = new ArrayDeque<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			GciBinaryTreeNode<Integer> current = queue.pop();
			if (current.getValue() < minimum.getValue())
				minimum = current;
			if (current.getLeft() != null)
				queue.add(current.getLeft());
			if (current.getRight() != null)
				queue.add(current.getRight());
		}
		return minimum;
	}

}
