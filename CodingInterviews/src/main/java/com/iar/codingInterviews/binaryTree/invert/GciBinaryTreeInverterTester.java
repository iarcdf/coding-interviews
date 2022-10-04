package com.iar.codingInterviews.binaryTree.invert;

import org.junit.Test;

import com.iar.codingInterviews.graph.GciGraphNode;
import com.iar.codingInterviews.graph.GciGraphSample;

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
		GciGraphNode<String> root = GciGraphSample.createSample0BinaryTree();
		GciGraphNode<String> invertedRoot = getInverter().invert(root);
		assertInvertedSample0BinaryTree(invertedRoot);
	}

	private void test1() {
		GciGraphNode<String> root = GciGraphSample.createSample1BinaryTree();
		GciGraphNode<String> invertedRoot = getInverter().invert(root);
		assertInvertedSample1BinaryTree(invertedRoot);
	}

	private void test6() {
		GciGraphNode<String> root = GciGraphSample.createSample6BinaryTree();
		GciGraphNode<String> invertedRoot = getInverter().invert(root);
		assertInvertedSample6BinaryTree(invertedRoot);
	}

	private GciGraphNode<String> createSample0BinaryTree() {
		return null;
	}

	private void assertInvertedSample0BinaryTree(GciGraphNode<String> invertedRoot) {
		assert (invertedRoot == null);
	}

	private void assertInvertedSample1BinaryTree(GciGraphNode<String> invertedRoot) {
		assert (invertedRoot != null);
		assert (invertedRoot.getValue().equals("a"));
	}

	private void assertInvertedSample6BinaryTree(GciGraphNode<String> invertedRoot) {
		assert (invertedRoot != null);
		assert (invertedRoot.getValue().equals("a"));
	}
}