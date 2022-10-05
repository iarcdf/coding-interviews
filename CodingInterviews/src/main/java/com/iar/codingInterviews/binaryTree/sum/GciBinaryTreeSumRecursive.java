package com.iar.codingInterviews.binaryTree.sum;

import com.iar.codingInterviews.binaryTree.GciBinaryTreeNode;

public class GciBinaryTreeSumRecursive implements GciBinaryTreeSum {

	// Time: O(number of nodes)
	// Space: O(number of nodes)
	@Override
	public int sum(GciBinaryTreeNode<Integer> root) {
		if (root == null)
			return 0;
		return root.getValue() + sum(root.getLeft()) + sum(root.getRight());
	}
}
