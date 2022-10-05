package com.iar.codingInterviews.binaryTree.maxRootToLeafSum;

import com.iar.codingInterviews.binaryTree.GciBinaryTreeNode;

public class GciBinaryTreeMaxRootToLeafSumRecursive implements GciBinaryTreeMaxRootToLeafSum {

	// Time: O(number of nodes)
	// Space: O(number of nodes)
	@Override
	public int maxRootToLeafSum(GciBinaryTreeNode<Integer> root) {
		if (root == null)
			return 0;
		return maxRootToLeafSum(root, 0, 0);
	}

	public int maxRootToLeafSum(GciBinaryTreeNode<Integer> root, int sum, int max) {
		if (root == null)
			return max;
		sum += root.getValue();
		if (sum > max) {
			max = sum;
		}
		max = maxRootToLeafSum(root.getLeft(), sum, max);
		max = maxRootToLeafSum(root.getRight(), sum, max);
		return max;
	}

}
