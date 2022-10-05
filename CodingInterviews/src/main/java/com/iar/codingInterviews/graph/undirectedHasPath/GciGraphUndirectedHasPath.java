package com.iar.codingInterviews.graph.undirectedHasPath;

import com.iar.codingInterviews.graph.GciGraphNode;

public interface GciGraphUndirectedHasPath<T> {

	boolean hasPath(GciGraphNode<T> source, GciGraphNode<T> destination);
}