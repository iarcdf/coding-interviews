package com.iar.codingInterviews.graph.undirectedConnectedComponentsCount;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.iar.codingInterviews.graph.GciGraphNode;

public class GciGraphUndirectedConnectedComponentsCountDepthRecursive<T>
		implements GciGraphUndirectedConnectedComponentsCount<T> {

	// n = # nodes
	// Time: O(n^2)
	// Space: O(n)
	@Override
	public int connectedComponentsCount(List<GciGraphNode<T>> nodes) {
		int count = 0;
		Set<GciGraphNode<T>> visited = new HashSet<>();
		for (GciGraphNode<T> node : nodes) {
			if (!visited.contains(node)) {
				visitConnectedNodes(node, visited);
				count++;
			}
		}
		return count;
	}

	private void visitConnectedNodes(GciGraphNode<T> node, Set<GciGraphNode<T>> visited) {
		if (visited.contains(node))
			return;
		visited.add(node);
		for (GciGraphNode<T> neighbour : node.getNeighbours()) {
			visitConnectedNodes(neighbour, visited);
		}
	}

}
