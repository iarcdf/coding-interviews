package com.iar.codingInterviews.binaryTree.breathFirstValues;

import java.util.List;

import com.iar.codingInterviews.graph.GciGraphNode;

public interface GciBinaryTreeBreadthFirstValues<T> {

	List<T> breadthFirstValues(GciGraphNode<T> root);
}