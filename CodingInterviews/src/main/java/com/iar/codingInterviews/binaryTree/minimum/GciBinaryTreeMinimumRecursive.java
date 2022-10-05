package com.iar.codingInterviews.binaryTree.minimum;

import com.iar.codingInterviews.binaryTree.GciBinaryTreeNode;

public class GciBinaryTreeMinimumRecursive implements GciBinaryTreeMinimum {

	// Time: O(number of nodes)
	// Space: O(number of nodes)
	@Override
	public GciBinaryTreeNode<Integer> minimum(GciBinaryTreeNode<Integer> root) {
		if (root == null)
			return null;
		GciBinaryTreeNode<Integer> minimum = root;
		GciBinaryTreeNode<Integer> leftMinimum = minimum(root.getLeft());
		if (leftMinimum != null && leftMinimum.getValue() < minimum.getValue()) {
			minimum = leftMinimum;
		}
		GciBinaryTreeNode<Integer> rightMinimum = minimum(root.getRight());
		if (rightMinimum != null && rightMinimum.getValue() < minimum.getValue()) {
			minimum = rightMinimum;
		}
		return minimum;

	}
}
