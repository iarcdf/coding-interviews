package com.iar.codingInterviews.graph;

import java.util.ArrayList;
import java.util.List;

public class GciGraphNode<T> {

	private T value;

	private List<GciGraphNode<T>> neighbours = new ArrayList<>();

	public GciGraphNode() {
	}

	public GciGraphNode(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public List<GciGraphNode<T>> getNeighbours() {
		return neighbours;
	}

	public void setNeighbours(List<GciGraphNode<T>> neighbours) {
		this.neighbours = neighbours;
	}

}