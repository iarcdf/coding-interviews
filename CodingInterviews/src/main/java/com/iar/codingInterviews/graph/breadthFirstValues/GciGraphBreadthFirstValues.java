package com.iar.codingInterviews.graph.breadthFirstValues;

import java.util.List;

import com.iar.codingInterviews.graph.GciGraphNode;

public interface GciGraphBreadthFirstValues<T> {

	List<T> breadthFirstValues(GciGraphNode<T> root);
}