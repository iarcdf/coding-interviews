package com.iar.codingInterviews.binaryTree.maxRootToLeafSum;

import org.junit.Test;

import com.iar.codingInterviews.graph.GciGraphNode;
import com.iar.codingInterviews.graph.GciGraphSample;

public class GciBinaryTreeMaxRootToLeafSumTester {

	GciBinaryTreeMaxRootToLeafSum maxRootToLeafSum = null;

	private GciBinaryTreeMaxRootToLeafSum getMaxRootToLeafSum() {
		return maxRootToLeafSum;
	}

	@Test
	public void test() {
		maxRootToLeafSum = new GciBinaryTreeMaxRootToLeafSumIterative();
		repeatTests();
		maxRootToLeafSum = new GciBinaryTreeMaxRootToLeafSumRecursive();
		repeatTests();
	}

	private void repeatTests() {
		test0();
		test1();
		test6();
	}

	private void test0() {
		GciGraphNode<Integer> root = GciGraphSample.createSampleInt0BinaryTree();
		int sum = getMaxRootToLeafSum().maxRootToLeafSum(root);
		assertMaxRootToLeafSumSample0BinaryTree(sum);
	}

	private void test1() {
		GciGraphNode<Integer> root = GciGraphSample.createSampleInt1BinaryTree();
		int sum = getMaxRootToLeafSum().maxRootToLeafSum(root);
		assertMaxRootToLeafSumSample1BinaryTree(sum);
	}

	private void test6() {
		GciGraphNode<Integer> root = GciGraphSample.createSampleInt26BinaryTree();
		int sum = getMaxRootToLeafSum().maxRootToLeafSum(root);
		assertMaxRootToLeafSumSample6BinaryTree(sum);
	}

	private void assertMaxRootToLeafSumSample0BinaryTree(int sum) {
		assert (sum == 0);
	}

	private void assertMaxRootToLeafSumSample1BinaryTree(int sum) {
		assert (sum == 3);
	}

	private void assertMaxRootToLeafSumSample6BinaryTree(int sum) {
		assert (sum == 20);
	}
}