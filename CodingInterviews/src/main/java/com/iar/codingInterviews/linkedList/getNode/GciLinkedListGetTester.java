package com.iar.codingInterviews.linkedList.getNode;

import org.junit.Test;

import com.iar.codingInterviews.linkedList.GciLinkedListNode;

public class GciLinkedListGetTester {

	GciLinkedListGetNode<String> getter = null;

	private GciLinkedListGetNode<String> getGetter() {
		return getter;
	}

	@Test
	public void test() {
		getter = new GciLinkedListGetIterative<String>();
		repeatTests();
		getter = new GciLinkedListGetRecursive<String>();
		repeatTests();
	}

	private void repeatTests() {
		test1();
		test2();
		test4();
	}

	private void test1() {
		GciLinkedListNode<String> head = createSample1LinkedList();
		GciLinkedListNode<String> newHead = getGetter().get(head, 0);
		assertFindSample1LinkedList(newHead);
	}

	private void test2() {
		GciLinkedListNode<String> head = createSample2LinkedList();
		GciLinkedListNode<String> newHead = getGetter().get(head, 1);
		assertFindSample2LinkedList(newHead);
	}

	private void test4() {
		GciLinkedListNode<String> head = createSample4LinkedList();
		GciLinkedListNode<String> newHead = getGetter().get(head, 2);
		assertFindSample4LinkedList(newHead);
	}

	private GciLinkedListNode<String> createSample1LinkedList() {
		GciLinkedListNode<String> a = new GciLinkedListNode<>("a");
		return a;
	}

	private void assertFindSample1LinkedList(GciLinkedListNode<String> newHead) {
		assert (newHead.getValue().equals("a"));
	}

	private GciLinkedListNode<String> createSample2LinkedList() {
		GciLinkedListNode<String> a = new GciLinkedListNode<>("a");
		GciLinkedListNode<String> b = new GciLinkedListNode<>("b");
		a.setNext(b);
		return a;
	}

	private void assertFindSample2LinkedList(GciLinkedListNode<String> newHead) {
		assert (newHead.getValue().equals("b"));
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

	private void assertFindSample4LinkedList(GciLinkedListNode<String> newHead) {
		assert (newHead.getValue().equals("c"));
	}
}
