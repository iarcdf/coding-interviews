package com.iar.codingInterviews.graph.undirectedConnectedComponentsCount;

import java.util.List;

import com.iar.codingInterviews.graph.GciGraphNode;

public interface GciGraphUndirectedConnectedComponentsCount<T> {

	int connectedComponentsCount(List<GciGraphNode<T>> nodes);
}