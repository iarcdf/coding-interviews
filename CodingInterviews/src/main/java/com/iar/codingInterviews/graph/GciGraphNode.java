package com.iar.codingInterviews.binaryTree;

public class GciBinaryTreeNode<T> {

	private T value;

	GciBinaryTreeNode<T> left = null;

	GciBinaryTreeNode<T> right = null;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public GciBinaryTreeNode<T> getLeft() {
		return left;
	}

	public void setLeft(GciBinaryTreeNode<T> left) {
		this.left = left;
	}

	public GciBinaryTreeNode<T> getRight() {
		return right;
	}

	public void setRight(GciBinaryTreeNode<T> right) {
		this.right = right;
	}
}