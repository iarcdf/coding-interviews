package com.iar.codingInterviews.binaryTree.minimum;

import org.junit.jupiter.api.Test;

import com.iar.codingInterviews.binaryTree.GciBinaryTreeNode;
import com.iar.codingInterviews.binaryTree.GciBinaryTreeSample;

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
		GciBinaryTreeNode<Integer> root = GciBinaryTreeSample.createSampleInt0BinaryTree();
		GciBinaryTreeNode<Integer> result = getMinimum().minimum(root);
		assertMinimumSample0BinaryTree(result);
	}

	private void test1() {
		GciBinaryTreeNode<Integer> root = GciBinaryTreeSample.createSampleInt1BinaryTree();
		GciBinaryTreeNode<Integer> result = getMinimum().minimum(root);
		assertMinimumSample1BinaryTree(result);
	}

	private void test6() {
		GciBinaryTreeNode<Integer> root = GciBinaryTreeSample.createSampleInt16BinaryTree();
		GciBinaryTreeNode<Integer> result = getMinimum().minimum(root);
		assertMinimumSample6BinaryTree(result);
	}

	private void assertMinimumSample0BinaryTree(GciBinaryTreeNode<Integer> result) {
		assert (result == null);
	}

	private void assertMinimumSample1BinaryTree(GciBinaryTreeNode<Integer> result) {
		assert (result.getValue() == 3);
	}

	private void assertMinimumSample6BinaryTree(GciBinaryTreeNode<Integer> result) {
		assert (result.getValue() == 3);
	}
}