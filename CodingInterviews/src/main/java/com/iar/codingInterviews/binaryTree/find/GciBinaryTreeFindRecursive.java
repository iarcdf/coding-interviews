package com.iar.codingInterviews.binaryTree.find;

import com.iar.codingInterviews.graph.GciGraphNode;

public class GciBinaryTreeFindRecursive<T> implements GciBinaryTreeFind<T> {

	// Time: O(number of nodes)
	// Space: O(number of nodes)
	@Override
	public GciGraphNode<T> find(GciGraphNode<T> root, T target) {
		if(root == null) return null;
		if(root.getValue().equals(target)) return root;
		GciGraphNode<T> node = find(root.getLeft(), target);
		if(node == null) {
			node = find(root.getRight(), target);
		}
		return node;
	}
}
