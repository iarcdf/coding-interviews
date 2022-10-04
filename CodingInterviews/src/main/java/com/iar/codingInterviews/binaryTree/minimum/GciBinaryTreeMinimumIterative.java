package com.iar.codingInterviews.binaryTree.minimum;

import java.util.ArrayDeque;
import java.util.Deque;

import com.iar.codingInterviews.graph.GciGraphNode;

public class GciBinaryTreeMinimumIterative implements GciBinaryTreeMinimum {

	// Time: O(number of nodes)
	// Space: O(number of nodes)
	@Override
	public GciGraphNode<Integer> minimum(GciGraphNode<Integer> root) {
		if (root == null)
			return null;
		GciGraphNode<Integer> minimum = root;
		Deque<GciGraphNode<Integer>> queue = new ArrayDeque<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			GciGraphNode<Integer> current = queue.pop();
			if (current.getValue() < minimum.getValue())
				minimum = current;
			if (current.getLeft() != null)
				queue.add(current.getLeft());
			if (current.getRight() != null)
				queue.add(current.getRight());
		}
		return minimum;
	}

}
