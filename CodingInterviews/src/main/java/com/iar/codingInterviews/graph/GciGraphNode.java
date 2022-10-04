package com.iar.codingInterviews.graph;

public class GciGraphNode<T> {

	private T value;

	GciGraphNode<T> left = null;

	GciGraphNode<T> right = null;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public GciGraphNode<T> getLeft() {
		return left;
	}

	public void setLeft(GciGraphNode<T> left) {
		this.left = left;
	}

	public GciGraphNode<T> getRight() {
		return right;
	}

	public void setRight(GciGraphNode<T> right) {
		this.right = right;
	}
}