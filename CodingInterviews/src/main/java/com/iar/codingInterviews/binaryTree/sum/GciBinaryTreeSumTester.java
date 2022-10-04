package com.iar.codingInterviews.binaryTree.sum;

import org.junit.Test;

import com.iar.codingInterviews.graph.GciGraphNode;
import com.iar.codingInterviews.graph.GciGraphSample;

public class GciBinaryTreeSumTester {

	GciBinaryTreeSum sum = null;

	private GciBinaryTreeSum getSum() {
		return sum;
	}

	@Test
	public void test() {
		sum = new GciBinaryTreeSumIterative();
		repeatTests();
		sum = new GciBinaryTreeSumRecursive();
		repeatTests();
	}

	private void repeatTests() {
		test0();
		test1();
		test6();
	}

	private void test0() {
		GciGraphNode<Integer> root = GciGraphSample.createSampleInt0BinaryTree();
		int sum = getSum().sum(root);
		assertSumSample0BinaryTree(sum);
	}

	private void test1() {
		GciGraphNode<Integer> root = GciGraphSample.createSampleInt1BinaryTree();
		int sum = getSum().sum(root);
		assertSumSample1BinaryTree(sum);
	}

	private void test6() {
		GciGraphNode<Integer> root = GciGraphSample.createSampleInt06BinaryTree();
		int sum = getSum().sum(root);
		assertSumSample6BinaryTree(sum);
	}

	private void assertSumSample0BinaryTree(int sum) {
		assert (sum == 0);
	}

	private void assertSumSample1BinaryTree(int sum) {
		assert (sum == 3);
	}

	private void assertSumSample6BinaryTree(int sum) {
		assert (sum == 25);
	}
}