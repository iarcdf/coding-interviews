package com.iar.codingInterviews.graph.undirectedShortestPath;

import com.iar.codingInterviews.graph.GciGraphNode;

public interface GciGraphUndirectedShortestPath<T> {

	Integer shortestPath(GciGraphNode<T> source, GciGraphNode<T> destination);
}