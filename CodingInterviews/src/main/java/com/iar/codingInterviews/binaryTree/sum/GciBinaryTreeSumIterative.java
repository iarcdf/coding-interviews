package com.iar.codingInterviews.binaryTree.sum;

import java.util.Stack;

import com.iar.codingInterviews.graph.GciGraphNode;

public class GciBinaryTreeSumIterative implements GciBinaryTreeSum {

	// Time: O(number of nodes)
	// Space: O(number of nodes)
	@Override
	public int sum(GciGraphNode<Integer> root) {
		if(root == null) return 0;
		int sum = 0;
		Stack<GciGraphNode<Integer>> stack = new Stack<>();
		stack.push(root);
		while(!stack.isEmpty()) {
			GciGraphNode<Integer> current = stack.pop();
			sum += current.getValue();
			if(current.getRight()!=null) stack.push(current.getRight());
			if(current.getLeft()!=null) stack.push(current.getLeft());
		}
		return sum;
	}

}
