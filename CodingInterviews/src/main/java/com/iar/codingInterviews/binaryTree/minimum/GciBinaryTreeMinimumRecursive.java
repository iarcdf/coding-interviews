package com.iar.codingInterviews.binaryTree.minimum;

import com.iar.codingInterviews.graph.GciGraphNode;

public class GciBinaryTreeMinimumRecursive implements GciBinaryTreeMinimum {

	// Time: O(number of nodes)
	// Space: O(number of nodes)
	@Override
	public GciGraphNode<Integer> minimum(GciGraphNode<Integer> root) {
		if (root == null)
			return null;
		GciGraphNode<Integer> minimum = root;
		GciGraphNode<Integer> leftMinimum = minimum(root.getLeft());
		if (leftMinimum != null && leftMinimum.getValue() < minimum.getValue()) {
			minimum = leftMinimum;
		}
		GciGraphNode<Integer> rightMinimum = minimum(root.getRight());
		if (rightMinimum != null && rightMinimum.getValue() < minimum.getValue()) {
			minimum = rightMinimum;
		}
		return minimum;

	}
}
