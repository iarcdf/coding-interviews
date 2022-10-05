package com.iar.codingInterviews.binaryTree.find;

import com.iar.codingInterviews.binaryTree.GciBinaryTreeNode;

public class GciBinaryTreeFindRecursive<T> implements GciBinaryTreeFind<T> {

	// Time: O(number of nodes)
	// Space: O(number of nodes)
	@Override
	public GciBinaryTreeNode<T> find(GciBinaryTreeNode<T> root, T target) {
		if(root == null) return null;
		if(root.getValue().equals(target)) return root;
		GciBinaryTreeNode<T> node = find(root.getLeft(), target);
		if(node == null) {
			node = find(root.getRight(), target);
		}
		return node;
	}
}
