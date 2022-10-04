package com.iar.codingInterviews.binaryTree.depthFirstValues;

import java.util.List;

import org.junit.Test;

import com.iar.codingInterviews.graph.GciGraphNode;
import com.iar.codingInterviews.graph.GciGraphSample;

public class GciBinaryTreeDepthFirstValuesTester {

	GciBinaryTreeDepthFirstValues<String> depthFirstValues = null;

	private GciBinaryTreeDepthFirstValues<String> getDepthFirstValues() {
		return depthFirstValues;
	}

	@Test
	public void test() {
		depthFirstValues = new GciBinaryTreeDepthFirstValuesIterative<String>();
		repeatTests();
		depthFirstValues = new GciBinaryTreeDepthFirstValuesRecursive<String>();
		repeatTests();
	}

	private void repeatTests() {
		test0();
		test1();
		test6();
	}

	private void test0() {
		GciGraphNode<String> root = GciGraphSample.createSample0BinaryTree();
		List<String> values = getDepthFirstValues().depthFirstValues(root);
		assertDepthFirstValuesSample0BinaryTree(values);
	}

	private void test1() {
		GciGraphNode<String> root = GciGraphSample.createSample1BinaryTree();
		List<String> values = getDepthFirstValues().depthFirstValues(root);
		assertDepthFirstValuesSample1BinaryTree(values);
	}

	private void test6() {
		GciGraphNode<String> root = GciGraphSample.createSample6BinaryTree();
		List<String> values = getDepthFirstValues().depthFirstValues(root);
		assertDepthFirstValuesSample6BinaryTree(values);
	}

	private void assertDepthFirstValuesSample0BinaryTree(List<String> values) {
		assert (values.size() == 0);
	}

	private void assertDepthFirstValuesSample1BinaryTree(List<String> values) {
		assert (values.size() == 1);
		assert (values.get(0).equals("a"));
	}

	private void assertDepthFirstValuesSample6BinaryTree(List<String> values) {
		assert (values.size() == 6);
		assert (values.get(0).equals("a"));
		assert (values.get(1).equals("b"));
		assert (values.get(2).equals("d"));
		assert (values.get(3).equals("e"));
		assert (values.get(4).equals("c"));
		assert (values.get(5).equals("f"));
	}
}