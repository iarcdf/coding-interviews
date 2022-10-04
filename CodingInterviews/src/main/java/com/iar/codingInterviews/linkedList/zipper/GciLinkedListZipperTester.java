package com.iar.codingInterviews.linkedList.zipper;

import org.junit.Test;

import com.iar.codingInterviews.linkedList.GciLinkedListNode;

public class GciLinkedListZipperTester {

	GciLinkedListZipper<String> zipper = null;

	private GciLinkedListZipper<String> getZipper() {
		return zipper;
	}

	@Test
	public void test() {
		zipper = new GciLinkedListZipperIterative<String>();
		repeatTests();
		zipper = new GciLinkedListZipperRecursive<String>();
		repeatTests();
	}

	private void repeatTests() {
		test1();
		test2();
		test4();
		test5();
	}

	private void test1() {
		GciLinkedListNode<String> head1 = createSample10LinkedList();
		GciLinkedListNode<String> head2 = createSample11LinkedList();
		GciLinkedListNode<String> newHead = getZipper().zipper(head1, head2);
		assertFindSample1LinkedList(newHead);
	}

	private void test2() {
		GciLinkedListNode<String> head1 = createSample20LinkedList();
		GciLinkedListNode<String> head2 = createSample21LinkedList();
		GciLinkedListNode<String> newHead = getZipper().zipper(head1, head2);
		assertFindSample2LinkedList(newHead);
	}

	private void test4() {
		GciLinkedListNode<String> head1 = createSample40LinkedList();
		GciLinkedListNode<String> head2 = createSample41LinkedList();
		GciLinkedListNode<String> newHead = getZipper().zipper(head1, head2);
		assertFindSample4LinkedList(newHead);
	}

	private void test5() {
		GciLinkedListNode<String> head1 = createSample50LinkedList();
		GciLinkedListNode<String> head2 = createSample51LinkedList();
		GciLinkedListNode<String> newHead = getZipper().zipper(head1, head2);
		assertFindSample5LinkedList(newHead);
	}

	private GciLinkedListNode<String> createSample10LinkedList() {
		GciLinkedListNode<String> a = new GciLinkedListNode<>("a");
		return a;
	}

	private GciLinkedListNode<String> createSample11LinkedList() {
		GciLinkedListNode<String> a = new GciLinkedListNode<>("1");
		return a;
	}

	private void assertFindSample1LinkedList(GciLinkedListNode<String> newHead) {
		assert (newHead.getValue().equals("a"));
		assert (newHead.getNext().getValue().equals("1"));
		assert (newHead.getNext().getNext() == null);
	}

	private GciLinkedListNode<String> createSample20LinkedList() {
		GciLinkedListNode<String> a = new GciLinkedListNode<>("a");
		GciLinkedListNode<String> b = new GciLinkedListNode<>("b");
		a.setNext(b);
		return a;
	}

	private GciLinkedListNode<String> createSample21LinkedList() {
		GciLinkedListNode<String> a = new GciLinkedListNode<>("1");
		GciLinkedListNode<String> b = new GciLinkedListNode<>("2");
		a.setNext(b);
		return a;
	}

	private void assertFindSample2LinkedList(GciLinkedListNode<String> newHead) {
		assert (newHead.getValue().equals("a"));
		assert (newHead.getNext().getValue().equals("1"));
		assert (newHead.getNext().getNext().getValue().equals("b"));
		assert (newHead.getNext().getNext().getNext().getValue().equals("2"));
		assert (newHead.getNext().getNext().getNext().getNext() == null);
	}

	private GciLinkedListNode<String> createSample40LinkedList() {
		GciLinkedListNode<String> a = new GciLinkedListNode<>("a");
		GciLinkedListNode<String> b = new GciLinkedListNode<>("b");
		a.setNext(b);
		GciLinkedListNode<String> c = new GciLinkedListNode<>("c");
		b.setNext(c);
		GciLinkedListNode<String> d = new GciLinkedListNode<>("d");
		c.setNext(d);
		return a;
	}

	private GciLinkedListNode<String> createSample41LinkedList() {
		GciLinkedListNode<String> a = new GciLinkedListNode<>("1");
		GciLinkedListNode<String> b = new GciLinkedListNode<>("2");
		a.setNext(b);
		return a;
	}
	
	private void assertFindSample4LinkedList(GciLinkedListNode<String> newHead) {
		assert (newHead.getValue().equals("a"));
		assert (newHead.getNext().getValue().equals("1"));
		assert (newHead.getNext().getNext().getValue().equals("b"));
		assert (newHead.getNext().getNext().getNext().getValue().equals("2"));
		assert (newHead.getNext().getNext().getNext().getNext().getValue().equals("c"));
		assert (newHead.getNext().getNext().getNext().getNext().getNext().getValue().equals("d"));
		assert (newHead.getNext().getNext().getNext().getNext().getNext().getNext() == null);
	}

	private GciLinkedListNode<String> createSample50LinkedList() {
		GciLinkedListNode<String> a = new GciLinkedListNode<>("a");
		GciLinkedListNode<String> b = new GciLinkedListNode<>("b");
		a.setNext(b);
		GciLinkedListNode<String> c = new GciLinkedListNode<>("c");
		b.setNext(c);
		return a;
	}

	private GciLinkedListNode<String> createSample51LinkedList() {
		GciLinkedListNode<String> a = new GciLinkedListNode<>("1");
		GciLinkedListNode<String> b = new GciLinkedListNode<>("2");
		a.setNext(b);
		GciLinkedListNode<String> c = new GciLinkedListNode<>("3");
		b.setNext(c);
		GciLinkedListNode<String> d = new GciLinkedListNode<>("4");
		c.setNext(d);
		GciLinkedListNode<String> e = new GciLinkedListNode<>("5");
		d.setNext(e);
		return a;
	}

	private void assertFindSample5LinkedList(GciLinkedListNode<String> newHead) {
		assert (newHead.getValue().equals("a"));
		assert (newHead.getNext().getValue().equals("1"));
		assert (newHead.getNext().getNext().getValue().equals("b"));
		assert (newHead.getNext().getNext().getNext().getValue().equals("2"));
		assert (newHead.getNext().getNext().getNext().getNext().getValue().equals("c"));
		assert (newHead.getNext().getNext().getNext().getNext().getNext().getValue().equals("3"));
		assert (newHead.getNext().getNext().getNext().getNext().getNext().getNext().getValue().equals("4"));
		assert (newHead.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getValue().equals("5"));
		assert (newHead.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext() == null);
	}
}
