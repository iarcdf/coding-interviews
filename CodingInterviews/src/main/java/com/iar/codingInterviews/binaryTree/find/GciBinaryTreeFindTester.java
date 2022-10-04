package com.iar.codingInterviews.binaryTree.find;

import org.junit.Test;

import com.iar.codingInterviews.graph.GciGraphNode;
import com.iar.codingInterviews.graph.GciGraphSample;

public class GciBinaryTreeFindTester {

	GciBinaryTreeFind<String> find = null;

	private GciBinaryTreeFind<String> getFind() {
		return find;
	}

	@Test
	public void test() {
		find = new GciBinaryTreeFindIterative<String>();
		repeatTests();
		find = new GciBinaryTreeFindRecursive<String>();
		repeatTests();
	}

	private void repeatTests() {
		test0();
		test1();
		test6();
	}

	private void test0() {
		GciGraphNode<String> root = GciGraphSample.createSample0BinaryTree();
		GciGraphNode<String> node = getFind().find(root, "e");
		assertFindSample0BinaryTree(node);
	}

	private void test1() {
		GciGraphNode<String> root = GciGraphSample.createSample1BinaryTree();
		GciGraphNode<String> node = getFind().find(root, "a");
		assertFindSample1BinaryTree(node);
	}

	private void test6() {
		GciGraphNode<String> root = GciGraphSample.createSample6BinaryTree();
		GciGraphNode<String> node = getFind().find(root, "e");
		assertFindSample6BinaryTree(node);
	}

	private void assertFindSample0BinaryTree(GciGraphNode<String> node) {
		assert (node == null);
	}

	private void assertFindSample1BinaryTree(GciGraphNode<String> node) {
		assert (node.getValue().equals("a"));
	}

	private void assertFindSample6BinaryTree(GciGraphNode<String> node) {
		assert (node.getValue().equals("e"));
	}
}