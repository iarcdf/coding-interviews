package com.iar.codingInterviews.graph.undirectedHasPath;

import org.junit.Test;

import com.iar.codingInterviews.graph.GciGraphNode;
import com.iar.codingInterviews.graph.GciGraphSample;

public class GciGraphUndirectedHasPathTester {

	GciGraphUndirectedHasPath<String> hasPath = null;

	private GciGraphUndirectedHasPath<String> getHasPath() {
		return hasPath;
	}

	@Test
	public void test() {
		hasPath = new GciGraphUndirectedHasPathDepthRecursive<String>();
		repeatTests();
	}

	private void repeatTests() {
		test1();
		test2();
	}

	private void test1() {
		GciGraphNode<String>[] nodes = GciGraphSample.createSampleForUndirectedHasPathA();
		boolean result = getHasPath().hasPath(nodes[0], nodes[1]);
		assert (result);
	}

	private void test2() {
		GciGraphNode<String>[] nodes = GciGraphSample.createSampleForUndirectedHasPathB();
		boolean result = getHasPath().hasPath(nodes[0], nodes[1]);
		assert (!result);
	}
}