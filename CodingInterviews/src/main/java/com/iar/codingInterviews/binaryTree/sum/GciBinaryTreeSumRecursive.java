package com.iar.codingInterviews.binaryTree.sum;

import com.iar.codingInterviews.graph.GciGraphNode;

public class GciBinaryTreeSumRecursive implements GciBinaryTreeSum {

	// Time: O(number of nodes)
	// Space: O(number of nodes)
	@Override
	public int sum(GciGraphNode<Integer> root) {
		if (root == null)
			return 0;
		return root.getValue() + sum(root.getLeft()) + sum(root.getRight());
	}
}
