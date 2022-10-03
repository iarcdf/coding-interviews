package com.iar.codingInterviews.linkedList.convertToArray;

import java.util.ArrayList;

import org.junit.Test;

import com.iar.codingInterviews.linkedList.GciLinkedListNode;

public class GciLinkedListArrayConverterTester {

	GciLinkedListArrayConverter<String> converter = null;

	private GciLinkedListArrayConverter<String> getConverter() {
		return converter;
	}

	@Test
	public void test() {
		converter = new GciLinkedListArrayConverterIterative<String>();
		repeatTests();
		converter = new GciLinkedListArrayConverterRecursive<String>();
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
		ArrayList<String> array = getConverter().convert(head);
		assertConvertedSample0LinkedList(array);
	}

	private void test1() {
		GciLinkedListNode<String> head = createSample1LinkedList();
		ArrayList<String> array = getConverter().convert(head);
		assertConvertedSample1LinkedList(array);
	}

	private void test2() {
		GciLinkedListNode<String> head = createSample2LinkedList();
		ArrayList<String> array = getConverter().convert(head);
		assertConvertedSample2LinkedList(array);
	}

	private void test4() {
		GciLinkedListNode<String> head = createSample4LinkedList();
		ArrayList<String> array = getConverter().convert(head);
		assertConvertedSample4LinkedList(array);
	}

	private GciLinkedListNode<String> createSample0LinkedList() {
		return null;
	}

	private void assertConvertedSample0LinkedList(ArrayList<String> array) {
		assert (array != null);
		assert (array.size() == 0);
	}
	
	private GciLinkedListNode<String> createSample1LinkedList() {
		GciLinkedListNode<String> a = new GciLinkedListNode<>("a");
		return a;
	}

	private void assertConvertedSample1LinkedList(ArrayList<String> array) {
		assert (array.get(0).equals("a"));
	}

	private GciLinkedListNode<String> createSample2LinkedList() {
		GciLinkedListNode<String> a = new GciLinkedListNode<>("a");
		GciLinkedListNode<String> b = new GciLinkedListNode<>("b");
		a.setNext(b);
		return a;
	}

	private void assertConvertedSample2LinkedList(ArrayList<String> array) {
		assert (array.get(0).equals("a"));
		assert (array.get(1).equals("b"));
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

	private void assertConvertedSample4LinkedList(ArrayList<String> array) {
		assert (array.get(0).equals("a"));
		assert (array.get(1).equals("b"));
		assert (array.get(2).equals("c"));
		assert (array.get(3).equals("d"));
	}
}
