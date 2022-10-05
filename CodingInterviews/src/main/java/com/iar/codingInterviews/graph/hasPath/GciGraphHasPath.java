package com.iar.codingInterviews.graph.hasPath;

import com.iar.codingInterviews.graph.GciGraphNode;

public interface GciGraphHasPath<T> {

	boolean hasPath(GciGraphNode<T> source, GciGraphNode<T> destination);
}