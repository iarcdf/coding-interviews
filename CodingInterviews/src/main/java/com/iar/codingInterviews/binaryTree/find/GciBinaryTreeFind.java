package com.iar.codingInterviews.binaryTree.find;

import com.iar.codingInterviews.graph.GciGraphNode;

public interface GciBinaryTreeFind<T> {

	GciGraphNode<T> find(GciGraphNode<T> root, T target);
}