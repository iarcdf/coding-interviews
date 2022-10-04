package com.iar.codingInterviews.binaryTree.minimum;

import org.junit.Test;

import com.iar.codingInterviews.graph.GciGraphNode;
import com.iar.codingInterviews.graph.GciGraphSample;

public class GciBinaryTreeMinimumTester {

	GciBinaryTreeMinimum minimum = null;

	private GciBinaryTreeMinimum getMinimum() {
		return minimum;
	}

	@Test
	public void test() {
		minimum = new GciBinaryTreeMinimumIterative();
		repeatTests();
		minimum = new GciBinaryTreeMinimumRecursive();
		repeatTests();
	}

	private void repeatTests() {
		test0();
		test1();
		test6();
	}

	private void test0() {
		GciGraphNode<Integer> root = GciGraphSample.createSampleInt0BinaryTree();
		GciGraphNode<Integer> result = getMinimum().minimum(root);
		assertMinimumSample0BinaryTree(result);
	}

	private void test1() {
		GciGraphNode<Integer> root = GciGraphSample.createSampleInt1BinaryTree();
		GciGraphNode<Integer> result = getMinimum().minimum(root);
		assertMinimumSample1BinaryTree(result);
	}

	private void test6() {
		GciGraphNode<Integer> root = GciGraphSample.createSampleInt16BinaryTree();
		GciGraphNode<Integer> result = getMinimum().minimum(root);
		assertMinimumSample6BinaryTree(result);
	}

	private void assertMinimumSample0BinaryTree(GciGraphNode<Integer> result) {
		assert (result == null);
	}

	private void assertMinimumSample1BinaryTree(GciGraphNode<Integer> result) {
		assert (result.getValue() == 3);
	}

	private void assertMinimumSample6BinaryTree(GciGraphNode<Integer> result) {
		assert (result.getValue() == 3);
	}
}