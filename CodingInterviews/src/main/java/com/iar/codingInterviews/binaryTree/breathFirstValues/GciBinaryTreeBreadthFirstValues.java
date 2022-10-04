package com.iar.codingInterviews.binaryTree.breathFirstValues;

import java.util.List;

import com.iar.codingInterviews.binaryTree.GciBinaryTreeNode;

public interface GciBinaryTreeBreadthFirstValues<T> {

	List<T> breadthFirstValues(GciBinaryTreeNode<T> root);
}