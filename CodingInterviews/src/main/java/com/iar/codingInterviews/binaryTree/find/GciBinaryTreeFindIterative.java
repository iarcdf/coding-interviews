package com.iar.codingInterviews.binaryTree.find;

import java.util.Stack;

import com.iar.codingInterviews.graph.GciGraphNode;

public class GciBinaryTreeFindIterative<T> implements GciBinaryTreeFind<T> {

	// Time: O(number of nodes)
	// Space: O(number of nodes)
	@Override
	public GciGraphNode<T> find(GciGraphNode<T> root, T target) {
		if (root == null)
			return null;
		Stack<GciGraphNode<T>> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			GciGraphNode<T> current = stack.pop();
			if (current.getValue().equals(target))
				return current;
			if (current.getRight() != null)
				stack.push(current.getRight());
			if (current.getLeft() != null)
				stack.push(current.getLeft());
		}
		return null;
	}

}
