package com.iar.codingInterviews.graph.undirectedLargestComponent;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.iar.codingInterviews.graph.GciGraphNode;

public class GciGraphUndirectedLargestComponentSolution<T> implements GciGraphUndirectedLargestComponent<T> {

	// n = number of nodes
	// e = number of edges
	// Time: O(e)
	// Space: O(n)
	public int largestComponent(List<GciGraphNode<T>> nodes) {
		int maxSize = 0;
		Set<GciGraphNode<T>> visited = new HashSet<>();
		for (GciGraphNode<T> node : nodes) {
			if (!visited.contains(node)) {
				int size = countConnectedNodes(node, visited);
				maxSize = Math.max(maxSize, size);
			}
		}
		return maxSize;
	}

	private int countConnectedNodes(GciGraphNode<T> node, Set<GciGraphNode<T>> visited) {
		if (visited.contains(node))
			return 0;
		visited.add(node);
		int size = 1;
		for (GciGraphNode<T> neighbour : node.getNeighbours()) {
			size += countConnectedNodes(neighbour, visited);
		}
		return size;
	}

}
