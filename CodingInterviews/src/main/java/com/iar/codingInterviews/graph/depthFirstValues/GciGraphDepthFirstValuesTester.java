package com.iar.codingInterviews.graph.depthFirstValues;

import java.util.List;

import org.junit.Test;

import com.iar.codingInterviews.graph.GciGraphNode;
import com.iar.codingInterviews.graph.GciGraphSample;

public class GciGraphDepthFirstValuesTester {

	GciGraphDepthFirstValues<String> depthFirstValues = null;

	private GciGraphDepthFirstValues<String> getDepthFirstValues() {
		return depthFirstValues;
	}

	@Test
	public void test() {
		depthFirstValues = new GciGraphDepthFirstValuesIterative<String>();
		repeatTests();
		depthFirstValues = new GciGraphDepthFirstValuesRecursive<String>();
		repeatTests();
	}

	private void repeatTests() {
		test0();
		test1();
		test6();
	}

	private void test0() {
		GciGraphNode<String> root = GciGraphSample.createSample0Graph();
		List<String> values = getDepthFirstValues().depthFirstValues(root);
		assertDepthFirstValuesSample0Graph(values);
	}

	private void test1() {
		GciGraphNode<String> root = GciGraphSample.createSample1Graph();
		List<String> values = getDepthFirstValues().depthFirstValues(root);
		assertDepthFirstValuesSample1Graph(values);
	}

	private void test6() {
		GciGraphNode<String> root = GciGraphSample.createSample6Graph();
		List<String> values = getDepthFirstValues().depthFirstValues(root);
		assertDepthFirstValuesSample6Graph(values);
	}

	private void assertDepthFirstValuesSample0Graph(List<String> values) {
		assert (values.size() == 0);
	}

	private void assertDepthFirstValuesSample1Graph(List<String> values) {
		assert (values.size() == 1);
		assert (values.get(0).equals("a"));
	}

	private void assertDepthFirstValuesSample6Graph(List<String> values) {
		assert (values.size() == 6);
		assert (values.get(0).equals("a"));
		assert (values.get(1).equals("b"));
		assert (values.get(2).equals("d"));
		assert (values.get(3).equals("f"));
		assert (values.get(4).equals("c"));
		assert (values.get(5).equals("e"));
	}
}