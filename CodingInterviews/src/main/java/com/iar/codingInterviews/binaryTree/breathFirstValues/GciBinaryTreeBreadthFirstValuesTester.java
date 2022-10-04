package com.iar.codingInterviews.binaryTree.breathFirstValues;

import java.util.List;

import org.junit.Test;

import com.iar.codingInterviews.binaryTree.GciBinaryTreeNode;
import com.iar.codingInterviews.binaryTree.GciBinaryTreeSample;

public class GciBinaryTreeBreadthFirstValuesTester {

	GciBinaryTreeBreadthFirstValues<String> depthFirstValues = null;

	private GciBinaryTreeBreadthFirstValues<String> getDepthFirstValues() {
		return depthFirstValues;
	}

	@Test
	public void test() {
		depthFirstValues = new GciBinaryTreeBreadthFirstValuesIterative<String>();
		repeatTests();
		depthFirstValues = new GciBinaryTreeBreadthFirstValuesRecursive<String>();
		repeatTests();
	}

	private void repeatTests() {
		test0();
		test1();
		test6();
	}

	private void test0() {
		GciBinaryTreeNode<String> root = GciBinaryTreeSample.createSample0BinaryTree();
		List<String> values = getDepthFirstValues().breadthFirstValues(root);
		assertDepthFirstValuesSample0BinaryTree(values);
	}

	private void test1() {
		GciBinaryTreeNode<String> root = GciBinaryTreeSample.createSample1BinaryTree();
		List<String> values = getDepthFirstValues().breadthFirstValues(root);
		assertDepthFirstValuesSample1BinaryTree(values);
	}

	private void test6() {
		GciBinaryTreeNode<String> root = GciBinaryTreeSample.createSample6BinaryTree();
		List<String> values = getDepthFirstValues().breadthFirstValues(root);
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
		assert (values.get(2).equals("c"));
		assert (values.get(3).equals("d"));
		assert (values.get(4).equals("e"));
		assert (values.get(5).equals("f"));
	}
}