package com.iar.codingInterviews.binaryTree.maxRootToLeafSum;

import java.util.Stack;

import com.iar.codingInterviews.binaryTree.GciBinaryTreeNode;

public class GciBinaryTreeMaxRootToLeafSumIterative implements GciBinaryTreeMaxRootToLeafSum {

	// Time: O(number of nodes)
	// Space: O(number of nodes)
	@Override
	public int maxRootToLeafSum(GciBinaryTreeNode<Integer> root) {
		if (root == null)
			return 0;
		int max = 0;
		Stack<GciBinaryTreeNode<Integer>> stack = new Stack<>();
		stack.push(root);
		Stack<Integer> sumStack = new Stack<>();
		sumStack.push(root.getValue());
		while (!stack.isEmpty()) {
			GciBinaryTreeNode<Integer> current = stack.pop();
			int sum = sumStack.pop();
			if (sum > max) {
				max = sum;
			}
			if (current.getRight() != null) {
				stack.push(current.getRight());
				sumStack.push(sum + current.getRight().getValue());
			}
			if (current.getLeft() != null) {
				stack.push(current.getLeft());
				sumStack.push(sum + current.getLeft().getValue());
			}
		}
		return max;

	}

}
