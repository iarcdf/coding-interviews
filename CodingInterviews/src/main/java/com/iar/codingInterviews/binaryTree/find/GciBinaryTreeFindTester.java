package com.iar.codingInterviews.binaryTree.find;

import org.junit.Test;

import com.iar.codingInterviews.binaryTree.GciBinaryTreeNode;
import com.iar.codingInterviews.binaryTree.GciBinaryTreeSample;

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
		GciBinaryTreeNode<String> root = GciBinaryTreeSample.createSample0BinaryTree();
		GciBinaryTreeNode<String> node = getFind().find(root, "e");
		assertFindSample0BinaryTree(node);
	}

	private void test1() {
		GciBinaryTreeNode<String> root = GciBinaryTreeSample.createSample1BinaryTree();
		GciBinaryTreeNode<String> node = getFind().find(root, "a");
		assertFindSample1BinaryTree(node);
	}

	private void test6() {
		GciBinaryTreeNode<String> root = GciBinaryTreeSample.createSample6BinaryTree();
		GciBinaryTreeNode<String> node = getFind().find(root, "e");
		assertFindSample6BinaryTree(node);
	}

	private void assertFindSample0BinaryTree(GciBinaryTreeNode<String> node) {
		assert (node == null);
	}

	private void assertFindSample1BinaryTree(GciBinaryTreeNode<String> node) {
		assert (node.getValue().equals("a"));
	}

	private void assertFindSample6BinaryTree(GciBinaryTreeNode<String> node) {
		assert (node.getValue().equals("e"));
	}
}