package com.iar.codingInterviews.binaryTree.invert;

import org.junit.jupiter.api.Test;

import com.iar.codingInterviews.binaryTree.GciBinaryTreeNode;
import com.iar.codingInterviews.binaryTree.GciBinaryTreeSample;

public class GciBinaryTreeInverterTester {

	GciBinaryTreeInverter<String> inverter = null;

	private GciBinaryTreeInverter<String> getInverter() {
		return inverter;
	}

	@Test
	public void test() {
		//inverter = new GciBinaryTreeInverterIterative<String>();
		//repeatTests();
		//inverter = new GciBinaryTreeInverterRecursive<String>();
		//repeatTests();
	}

	private void repeatTests() {
		test0();
		test1();
		test6();
	}

	private void test0() {
		GciBinaryTreeNode<String> root = GciBinaryTreeSample.createSample0BinaryTree();
		GciBinaryTreeNode<String> invertedRoot = getInverter().invert(root);
		assertInvertedSample0BinaryTree(invertedRoot);
	}

	private void test1() {
		GciBinaryTreeNode<String> root = GciBinaryTreeSample.createSample1BinaryTree();
		GciBinaryTreeNode<String> invertedRoot = getInverter().invert(root);
		assertInvertedSample1BinaryTree(invertedRoot);
	}

	private void test6() {
		GciBinaryTreeNode<String> root = GciBinaryTreeSample.createSample6BinaryTree();
		GciBinaryTreeNode<String> invertedRoot = getInverter().invert(root);
		assertInvertedSample6BinaryTree(invertedRoot);
	}

	private GciBinaryTreeNode<String> createSample0BinaryTree() {
		return null;
	}

	private void assertInvertedSample0BinaryTree(GciBinaryTreeNode<String> invertedRoot) {
		assert (invertedRoot == null);
	}

	private void assertInvertedSample1BinaryTree(GciBinaryTreeNode<String> invertedRoot) {
		assert (invertedRoot != null);
		assert (invertedRoot.getValue().equals("a"));
	}

	private void assertInvertedSample6BinaryTree(GciBinaryTreeNode<String> invertedRoot) {
		assert (invertedRoot != null);
		assert (invertedRoot.getValue().equals("a"));
	}
}