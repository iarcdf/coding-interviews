package com.iar.codingInterviews.binaryTree.maxRootToLeafSum;

import org.junit.jupiter.api.Test;

import com.iar.codingInterviews.binaryTree.GciBinaryTreeNode;
import com.iar.codingInterviews.binaryTree.GciBinaryTreeSample;

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
		GciBinaryTreeNode<Integer> root = GciBinaryTreeSample.createSampleInt0BinaryTree();
		int sum = getMaxRootToLeafSum().maxRootToLeafSum(root);
		assertMaxRootToLeafSumSample0BinaryTree(sum);
	}

	private void test1() {
		GciBinaryTreeNode<Integer> root = GciBinaryTreeSample.createSampleInt1BinaryTree();
		int sum = getMaxRootToLeafSum().maxRootToLeafSum(root);
		assertMaxRootToLeafSumSample1BinaryTree(sum);
	}

	private void test6() {
		GciBinaryTreeNode<Integer> root = GciBinaryTreeSample.createSampleInt26BinaryTree();
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