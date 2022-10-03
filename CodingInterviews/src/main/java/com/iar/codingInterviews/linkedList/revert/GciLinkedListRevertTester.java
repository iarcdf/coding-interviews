package com.iar.codingInterviews.linkedList.revert;

import org.junit.Test;

import com.iar.codingInterviews.linkedList.GciLinkedListNode;

public class GciLinkedListRevertTester {

	GciLinkedListReverter<String> reverter = null;

	private GciLinkedListReverter<String> getReverter() {
		return reverter;
	}

	@Test
	public void test() {
		reverter = new GciLinkedListReverterIterative<String>();
		repeatTests();
		reverter = new GciLinkedListReverterRecursive<String>();
		repeatTests();
	}

	private void repeatTests() {
		test0();
		test1();
		test2();
		test4();
	}

	private void test0() {
		GciLinkedListNode<String> head = createSample0LinkedList();
		GciLinkedListNode<String> newHead = getReverter().revert(head);
		assertRevertedSample0LinkedList(newHead);
	}

	private void test1() {
		GciLinkedListNode<String> head = createSample1LinkedList();
		GciLinkedListNode<String> newHead = getReverter().revert(head);
		assertRevertedSample1LinkedList(newHead);
	}

	private void test2() {
		GciLinkedListNode<String> head = createSample2LinkedList();
		GciLinkedListNode<String> newHead = getReverter().revert(head);
		assertRevertedSample2LinkedList(newHead);
	}

	private void test4() {
		GciLinkedListNode<String> head = createSample4LinkedList();
		GciLinkedListNode<String> newHead = getReverter().revert(head);
		assertRevertedSample4LinkedList(newHead);
	}
	
	private GciLinkedListNode<String> createSample0LinkedList() {
		return null;
	}

	private void assertRevertedSample0LinkedList(GciLinkedListNode<String> newHead) {
		assert (newHead == null);
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
}
