package com.iar.codingInterviews.graph.undirectedShortestPath;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

import com.iar.codingInterviews.graph.GciGraphNode;

public class GciGraphUndirectedShortestPathSolution<T> implements GciGraphUndirectedShortestPath<T> {

	// n = number of nodes
	// e = number of edges
	// Time: O(e)
	// Space: O(n)
	public Integer shortestPath(GciGraphNode<T> source, GciGraphNode<T> destination) {
		Set<GciGraphNode<T>> visited = new HashSet<>();
		visited.add(source);
		Deque<GciGraphNode<T>> nodeQueue = new ArrayDeque<>();
		nodeQueue.add(source);
		Deque<Integer> lengthQueue = new ArrayDeque<>();
		lengthQueue.add(0);
		while (!nodeQueue.isEmpty()) {
			GciGraphNode<T> currentNode = nodeQueue.pop();
			Integer currentLength = lengthQueue.pop();
			for (GciGraphNode<T> neighbour : currentNode.getNeighbours()) {
				if (neighbour.getValue().equals(destination.getValue())) {
					return currentLength + 1;
				}
				if (!visited.contains(neighbour)) {
					visited.add(neighbour);
					nodeQueue.add(neighbour);
					lengthQueue.add(currentLength + 1);
				}
			}
		}
		return null;
	}
}
