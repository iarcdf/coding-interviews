package com.iar.codingInterviews.graph.undirectedConnectedComponentsCount;

import java.util.List;

import org.junit.Test;

import com.iar.codingInterviews.graph.GciGraphNode;
import com.iar.codingInterviews.graph.GciGraphSample;

public class GciGraphUndirectedConnectedComponentsCountTester {

	GciGraphUndirectedConnectedComponentsCount<String> connectedComponentsCount = null;

	private GciGraphUndirectedConnectedComponentsCount<String> getConnectedComponentsCount() {
		return connectedComponentsCount;
	}

	@Test
	public void test() {
		connectedComponentsCount = new GciGraphUndirectedConnectedComponentsCountDepthRecursive<String>();
		repeatTests();
	}

	private void repeatTests() {
		test1();
		test2();
	}

	private void test1() {
		List<GciGraphNode<String>> nodes = GciGraphSample.createSample1ForUndirectedConnectedComponentsCount();
		int result = getConnectedComponentsCount().connectedComponentsCount(nodes);
		assert (result == 2);
	}

	private void test2() {
		List<GciGraphNode<String>> nodes = GciGraphSample.createSample2ForUndirectedConnectedComponentsCount();
		int result = getConnectedComponentsCount().connectedComponentsCount(nodes);
		assert (result == 3);
	}
}