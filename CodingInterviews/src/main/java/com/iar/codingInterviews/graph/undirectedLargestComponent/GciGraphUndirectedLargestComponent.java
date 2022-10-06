package com.iar.codingInterviews.graph.undirectedLargestComponent;

import java.util.List;

import com.iar.codingInterviews.graph.GciGraphNode;

public interface GciGraphUndirectedLargestComponent<T> {

	int largestComponent(List<GciGraphNode<T>> nodes);
}