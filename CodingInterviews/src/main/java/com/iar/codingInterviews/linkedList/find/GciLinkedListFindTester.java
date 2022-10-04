package com.iar.codingInterviews.linkedList.find;

import org.junit.Test;

import com.iar.codingInterviews.linkedList.GciLinkedListNode;

public class GciLinkedListFindTester {

	GciLinkedListFinder<String> finder = null;

	private GciLinkedListFinder<String> getFinder() {
		return finder;
	}

	@Test
	public void test() {
		finder = new GciLinkedListFindIterative<String>();
		repeatTests();
		finder = new GciLinkedListFindRecursive<String>();
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
		GciLinkedListNode<String> newHead = getFinder().find(head, "a");
		assertFindSample0LinkedList(newHead);
	}

	private void test1() {
		GciLinkedListNode<String> head = createSample1LinkedList();
		GciLinkedListNode<String> newHead = getFinder().find(head, "b");
		assertFindSample1LinkedList(newHead);
	}

	private void test2() {
		GciLinkedListNode<String> head = createSample2LinkedList();
		GciLinkedListNode<String> newHead = getFinder().find(head, "e");
		assertFindSample2LinkedList(newHead);
	}

	private void test4() {
		GciLinkedListNode<String> head = createSample4LinkedList();
		GciLinkedListNode<String> newHead = getFinder().find(head, "d");
		assertFindSample4LinkedList(newHead);
	}
	
	private GciLinkedListNode<String> createSample0LinkedList() {
		return null;
	}

	private void assertFindSample0LinkedList(GciLinkedListNode<String> newHead) {
		assert (newHead == null);
	}

	private GciLinkedListNode<String> createSample1LinkedList() {
		GciLinkedListNode<String> a = new GciLinkedListNode<>("a");
		return a;
	}

	private void assertFindSample1LinkedList(GciLinkedListNode<String> newHead) {
		assert (newHead == null);
	}

	private GciLinkedListNode<String> createSample2LinkedList() {
		GciLinkedListNode<String> a = new GciLinkedListNode<>("a");
		GciLinkedListNode<String> b = new GciLinkedListNode<>("b");
		a.setNext(b);
		return a;
	}

	private void assertFindSample2LinkedList(GciLinkedListNode<String> newHead) {
		assert (newHead == null);
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
		assert (newHead.getValue().equals("d"));
	}
}
