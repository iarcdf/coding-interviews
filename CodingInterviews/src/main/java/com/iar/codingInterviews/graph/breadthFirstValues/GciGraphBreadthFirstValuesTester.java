package com.iar.codingInterviews.graph.breadthFirstValues;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.iar.codingInterviews.graph.GciGraphNode;
import com.iar.codingInterviews.graph.GciGraphSample;

public class GciGraphBreadthFirstValuesTester {

	GciGraphBreadthFirstValues<String> depthFirstValues = null;

	private GciGraphBreadthFirstValues<String> getDepthFirstValues() {
		return depthFirstValues;
	}

	@Test
	public void test() {
		depthFirstValues = new GciGraphBreadthFirstValuesIterative<String>();
		repeatTests();
	}

	private void repeatTests() {
		test0();
		test1();
		test6();
	}

	private void test0() {
		GciGraphNode<String> root = GciGraphSample.createSample0Graph();
		List<String> values = getDepthFirstValues().breadthFirstValues(root);
		assertBreadthFirstValuesSample0Graph(values);
	}

	private void test1() {
		GciGraphNode<String> root = GciGraphSample.createSample1Graph();
		List<String> values = getDepthFirstValues().breadthFirstValues(root);
		assertBreadthFirstValuesSample1Graph(values);
	}

	private void test6() {
		GciGraphNode<String> root = GciGraphSample.createSample6Graph();
		List<String> values = getDepthFirstValues().breadthFirstValues(root);
		assertBreadthFirstValuesSample6Graph(values);
	}

	private void assertBreadthFirstValuesSample0Graph(List<String> values) {
		assert (values.size() == 0);
	}

	private void assertBreadthFirstValuesSample1Graph(List<String> values) {
		assert (values.size() == 1);
		assert (values.get(0).equals("a"));
	}

	private void assertBreadthFirstValuesSample6Graph(List<String> values) {
		assert (values.size() == 6);
		assert (values.get(0).equals("a"));
		assert (values.get(1).equals("b"));
		assert (values.get(2).equals("c"));
		assert (values.get(3).equals("d"));
		assert (values.get(4).equals("e"));
		assert (values.get(5).equals("f"));
	}
}