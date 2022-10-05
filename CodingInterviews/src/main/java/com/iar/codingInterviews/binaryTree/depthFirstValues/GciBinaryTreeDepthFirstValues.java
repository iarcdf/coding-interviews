package com.iar.codingInterviews.binaryTree.depthFirstValues;

import java.util.List;

import com.iar.codingInterviews.binaryTree.GciBinaryTreeNode;

public interface GciBinaryTreeDepthFirstValues<T> {

	List<T> depthFirstValues(GciBinaryTreeNode<T> root);
}