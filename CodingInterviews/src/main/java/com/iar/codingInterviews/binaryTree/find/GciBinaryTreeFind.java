package com.iar.codingInterviews.binaryTree.find;

import com.iar.codingInterviews.binaryTree.GciBinaryTreeNode;

public interface GciBinaryTreeFind<T> {

	GciBinaryTreeNode<T> find(GciBinaryTreeNode<T> root, T target);
}