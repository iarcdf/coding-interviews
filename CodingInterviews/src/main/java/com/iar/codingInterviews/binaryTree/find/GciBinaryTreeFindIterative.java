package com.iar.codingInterviews.binaryTree.find;

import java.util.Stack;

import com.iar.codingInterviews.binaryTree.GciBinaryTreeNode;

public class GciBinaryTreeFindIterative<T> implements GciBinaryTreeFind<T> {

	// Time: O(number of nodes)
	// Space: O(number of nodes)
	@Override
	public GciBinaryTreeNode<T> find(GciBinaryTreeNode<T> root, T target) {
		if (root == null)
			return null;
		Stack<GciBinaryTreeNode<T>> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			GciBinaryTreeNode<T> current = stack.pop();
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
