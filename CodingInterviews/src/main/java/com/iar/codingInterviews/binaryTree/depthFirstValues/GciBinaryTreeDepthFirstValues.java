package com.iar.codingInterviews.binaryTree.depthFirstValues;

import java.util.List;

import com.iar.codingInterviews.graph.GciGraphNode;

public interface GciBinaryTreeDepthFirstValues<T> {

	List<T> depthFirstValues(GciGraphNode<T> root);
}