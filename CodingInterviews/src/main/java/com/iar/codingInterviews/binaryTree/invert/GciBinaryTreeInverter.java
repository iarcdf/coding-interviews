package com.iar.codingInterviews.binaryTree.invert;

import com.iar.codingInterviews.binaryTree.GciBinaryTreeNode;

public interface GciBinaryTreeInverter<T> {

	GciBinaryTreeNode<T> invert(GciBinaryTreeNode<T> root);
}