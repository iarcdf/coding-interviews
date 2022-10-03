package com.iar.codingInterviews.revertLinkedList;

import org.junit.Test;

public class GciLinkedListRevertTester {

	private GciLinkedListReverter<String> getReverter() {
		return new GciLinkedListReverterIterative<String>();
	}

	private GciLinkedListTraverser<String> getTraversal() {
		return new GciLinkedListTraverserRecursive<String>();
	}

	@Test
	public void test0() {
		GciLinkedListNode<String> head = null;
		GciLinkedListNode<String> newHead = getReverter().revert(head);
		assert (newHead == null);
	}

	@Test
	public void test1() {
		GciLinkedListNode<String> head = createSample1LinkedList();
		GciLinkedListNode<String> newHead = getReverter().revert(head);
		assertRevertedSample1LinkedList(newHead);
	}

	@Test
	public void test2() {
		GciLinkedListNode<String> head = createSample2LinkedList();
		GciLinkedListNode<String> newHead = getReverter().revert(head);
		assertRevertedSample2LinkedList(newHead);
	}

	@Test
	public void test4() {
		GciLinkedListNode<String> head = createSample4LinkedList();
		GciLinkedListNode<String> newHead = getReverter().revert(head);
		getTraversal().traverse(newHead, node -> System.out.println(node.getValue()));
		assertRevertedSample4LinkedList(newHead);
	}

	private GciLinkedListNode<String> createSample1LinkedList() {
		GciLinkedListNode<String> a = new GciLinkedListNode<>("a");
		return a;
	}

	private void assertRevertedSample1LinkedList(GciLinkedListNode<String> newHead) {
		assert (newHead.getValue().equals("a"));
		assert (newHead.getNextNode() == null);
	}

	private GciLinkedListNode<String> createSample2LinkedList() {
		GciLinkedListNode<String> a = new GciLinkedListNode<>("a");
		GciLinkedListNode<String> b = new GciLinkedListNode<>("b");
		a.setNextNode(b);
		return a;
	}

	private void assertRevertedSample2LinkedList(GciLinkedListNode<String> newHead) {
		assert (newHead.getValue().equals("b"));
		assert (newHead.getNextNode().getValue().equals("a"));
		assert (newHead.getNextNode().getNextNode() == null);
	}

	private GciLinkedListNode<String> createSample4LinkedList() {
		GciLinkedListNode<String> a = new GciLinkedListNode<>("a");
		GciLinkedListNode<String> b = new GciLinkedListNode<>("b");
		a.setNextNode(b);
		GciLinkedListNode<String> c = new GciLinkedListNode<>("c");
		b.setNextNode(c);
		GciLinkedListNode<String> d = new GciLinkedListNode<>("d");
		c.setNextNode(d);
		return a;
	}

	private void assertRevertedSample4LinkedList(GciLinkedListNode<String> newHead) {
		assert (newHead.getValue().equals("d"));
		assert (newHead.getNextNode().getValue().equals("c"));
		assert (newHead.getNextNode().getNextNode().getValue().equals("b"));
		assert (newHead.getNextNode().getNextNode().getNextNode().getValue().equals("a"));
		assert (newHead.getNextNode().getNextNode().getNextNode().getNextNode() == null);
	}

	private static void print(GciLinkedListNode<String> head) {
		GciLinkedListNode<String> current = head;
		while (current != null) {
			System.out.println(current.getValue());
			current = current.getNextNode();
		}
	}
}