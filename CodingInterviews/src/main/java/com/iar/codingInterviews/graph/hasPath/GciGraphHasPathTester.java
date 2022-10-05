package com.iar.codingInterviews.graph.hasPath;

import org.junit.Test;

import com.iar.codingInterviews.graph.GciGraphNode;
import com.iar.codingInterviews.graph.GciGraphSample;

public class GciGraphHasPathTester {

	GciGraphHasPath<String> hasPath = null;

	private GciGraphHasPath<String> getHasPath() {
		return hasPath;
	}

	@Test
	public void test() {
		hasPath = new GciGraphHasPathDepthIterative<String>();
		repeatTests();
		hasPath = new GciGraphHasPathDepthRecursive<String>();
		repeatTests();
		hasPath = new GciGraphHasPathBreadthIterative<String>();
		repeatTests();
	}

	private void repeatTests() {
		test1();
		test2();
	}

	private void test1() {
		GciGraphNode<String>[] nodes = GciGraphSample.createSampleForHasPathA();
		boolean result = getHasPath().hasPath(nodes[0], nodes[1]);
		assert (result);
	}

	private void test2() {
		GciGraphNode<String>[] nodes = GciGraphSample.createSampleForHasPathB();
		boolean result = getHasPath().hasPath(nodes[0], nodes[1]);
		assert (!result);
	}
}