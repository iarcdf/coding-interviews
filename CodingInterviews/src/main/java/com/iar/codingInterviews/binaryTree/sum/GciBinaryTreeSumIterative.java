package com.iar.codingInterviews.binaryTree.sum;

import java.util.Stack;

import com.iar.codingInterviews.binaryTree.GciBinaryTreeNode;

public class GciBinaryTreeSumIterative implements GciBinaryTreeSum {

	// Time: O(number of nodes)
	// Space: O(number of nodes)
	@Override
	public int sum(GciBinaryTreeNode<Integer> root) {
		if(root == null) return 0;
		int sum = 0;
		Stack<GciBinaryTreeNode<Integer>> stack = new Stack<>();
		stack.push(root);
		while(!stack.isEmpty()) {
			GciBinaryTreeNode<Integer> current = stack.pop();
			sum += current.getValue();
			if(current.getRight()!=null) stack.push(current.getRight());
			if(current.getLeft()!=null) stack.push(current.getLeft());
		}
		return sum;
	}

}
