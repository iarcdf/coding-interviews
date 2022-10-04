package com.iar.codingInterviews.binaryTree.depthFirstValues;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.iar.codingInterviews.graph.GciGraphNode;

public class GciBinaryTreeDepthFirstValuesIterative<T> implements GciBinaryTreeDepthFirstValues<T> {

	// Time: O(number of nodes)
	// Space: O(number of nodes)
	@Override
	public List<T> depthFirstValues(GciGraphNode<T> root) {
		List<T> values = new ArrayList<T>();
		if(root==null) return values;
		Stack<GciGraphNode<T>> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			GciGraphNode<T> top = stack.peek();
			values.add(top.getValue());
			stack.pop();
			if (top.getRight() != null) {
				stack.push(top.getRight());
			}
			if (top.getLeft() != null) {
				stack.push(top.getLeft());
			} 
		}
		return values;
	}

}
