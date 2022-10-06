package com.iar.codingInterviews.graph.undirectedShortestPath;

import org.junit.Test;

import com.iar.codingInterviews.graph.GciGraphNode;
import com.iar.codingInterviews.graph.GciGraphSample;

public class GciGraphUndirectedShortestPathTest {

	GciGraphUndirectedShortestPath<String> shortestPath = null;

	private GciGraphUndirectedShortestPath<String> getShortestPath() {
		return shortestPath;
	}

	@Test
	public void test() {
		shortestPath = new GciGraphUndirectedShortestPathSolution<String>();
		repeatTests();
	}

	private void repeatTests() {
		test1();
	}

	private void test1() {
		GciGraphNode<String>[] nodes = GciGraphSample.createSample1ForUndirectedShortestPath();
		int result = getShortestPath().shortestPath(nodes[0], nodes[1]);
		assert (result == 2);
	}
}