package com.iar.codingInterviews.graph.undirectedLargestComponent;

import java.util.List;

import org.junit.Test;

import com.iar.codingInterviews.graph.GciGraphNode;
import com.iar.codingInterviews.graph.GciGraphSample;

public class GciGraphUndirectedLargestComponentTester {

	GciGraphUndirectedLargestComponent<String> largestComponent = null;

	private GciGraphUndirectedLargestComponent<String> getLargestComponent() {
		return largestComponent;
	}

	@Test
	public void test() {
		largestComponent = new GciGraphUndirectedLargestComponentSolution<String>();
		repeatTests();
	}

	private void repeatTests() {
		test1();
		test2();
	}

	private void test1() {
		List<GciGraphNode<String>> nodes = GciGraphSample.createSample1ForUndirectedConnectedComponentsCount();
		int result = getLargestComponent().largestComponent(nodes);
		assert (result == 5);
	}

	private void test2() {
		List<GciGraphNode<String>> nodes = GciGraphSample.createSample2ForUndirectedConnectedComponentsCount();
		int result = getLargestComponent().largestComponent(nodes);
		assert (result == 5);
	}
}