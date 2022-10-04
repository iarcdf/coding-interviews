package com.iar.codingInterviews.binaryTree.invert;

import com.iar.codingInterviews.graph.GciGraphNode;

public interface GciBinaryTreeInverter<T> {

	GciGraphNode<T> invert(GciGraphNode<T> root);
}