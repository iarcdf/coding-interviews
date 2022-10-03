package com.iar.codingInterviews.revertLinkedList;

import org.junit.Test;

public class GciLinkedListRevertTester {

	private GciLinkedListReverter<String> getReverter() {
		return new GciLinkedListReverterRecursive<String>();
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
		assert (newHead.getNext() == null);
	}

	private GciLinkedListNode<String> createSample2LinkedList() {
		GciLinkedListNode<String> a = new GciLinkedListNode<>("a");
		GciLinkedListNode<String> b = new GciLinkedListNode<>("b");
		a.setNext(b);
		return a;
	}

	private void assertRevertedSample2LinkedList(GciLinkedListNode<String> newHead) {
		assert (newHead.getValue().equals("b"));
		assert (newHead.getNext().getValue().equals("a"));
		assert (newHead.getNext().getNext() == null);
	}

	private GciLinkedListNode<String> createSample4LinkedList() {
		GciLinkedListNode<String> a = new GciLinkedListNode<>("a");
		GciLinkedListNode<String> b = new GciLinkedListNode<>("b");
		a.setNext(b);
		GciLinkedListNode<String> c = new GciLinkedListNode<>("c");
		b.setNext(c);
		GciLinkedListNode<String> d = new GciLinkedListNode<>("d");
		c.setNext(d);
		return a;
	}

	private void assertRevertedSample4LinkedList(GciLinkedListNode<String> newHead) {
		assert (newHead.getValue().equals("d"));
		assert (newHead.getNext().getValue().equals("c"));
		assert (newHead.getNext().getNext().getValue().equals("b"));
		assert (newHead.getNext().getNext().getNext().getValue().equals("a"));
		assert (newHead.getNext().getNext().getNext().getNext() == null);
	}

	private static void print(GciLinkedListNode<String> head) {
		GciLinkedListNode<String> current = head;
		while (current != null) {
			System.out.println(current.getValue());
			current = current.getNext();
		}
	}
}