package com.iar.codingInterviews.graph.depthFirstValues;

import java.util.List;

import com.iar.codingInterviews.graph.GciGraphNode;

public interface GciGraphDepthFirstValues<T> {

	List<T> depthFirstValues(GciGraphNode<T> root);
}