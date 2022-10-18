package com.iar.codingInterviews.linkedList.sumatory;

import org.junit.jupiter.api.Test;

import com.iar.codingInterviews.linkedList.GciLinkedListNode;

public class GciLinkedListSumatoryTester {

	GciLinkedListSumatory sumatory = null;

	private GciLinkedListSumatory getSumatory() {
		return sumatory;
	}

	@Test
	public void test() {
		sumatory = new GciLinkedListSumatoryIterative();
		repeatTests();
		sumatory = new GciLinkedListSumatoryRecursive();
		repeatTests();
	}

	private void repeatTests() {
		test0();
		test1();
		test2();
		test4();
	}

	private void test0() {
		GciLinkedListNode<Integer> head = createSample0LinkedList();
		assertSumatorySample0LinkedList(getSumatory().sum(head));
	}

	private void test1() {
		GciLinkedListNode<Integer> head = createSample1LinkedList();
		assertSumatorySample1LinkedList(getSumatory().sum(head));
	}

	private void test2() {
		GciLinkedListNode<Integer> head = createSample2LinkedList();
		assertSumatorySample2LinkedList(getSumatory().sum(head));
	}

	private void test4() {
		GciLinkedListNode<Integer> head = createSample4LinkedList();
		assertSumatorySample4LinkedList(getSumatory().sum(head));
	}

	private GciLinkedListNode<Integer> createSample0LinkedList() {
		return null;
	}

	private void assertSumatorySample0LinkedList(int sum) {
		assert (sum == 0);
	}

	private GciLinkedListNode<Integer> createSample1LinkedList() {
		GciLinkedListNode<Integer> a = new GciLinkedListNode<>(6);
		return a;
	}

	private void assertSumatorySample1LinkedList(int sum) {
		assert (sum == 6);
	}

	private GciLinkedListNode<Integer> createSample2LinkedList() {
		GciLinkedListNode<Integer> a = new GciLinkedListNode<>(6);
		GciLinkedListNode<Integer> b = new GciLinkedListNode<>(4);
		a.setNext(b);
		return a;
	}

	private void assertSumatorySample2LinkedList(int sum) {
		assert (sum == 10);
	}

	private GciLinkedListNode<Integer> createSample4LinkedList() {
		GciLinkedListNode<Integer> a = new GciLinkedListNode<>(6);
		GciLinkedListNode<Integer> b = new GciLinkedListNode<>(4);
		a.setNext(b);
		GciLinkedListNode<Integer> c = new GciLinkedListNode<>(2);
		b.setNext(c);
		GciLinkedListNode<Integer> d = new GciLinkedListNode<>(8);
		c.setNext(d);
		return a;
	}

	private void assertSumatorySample4LinkedList(int sum) {
		assert (sum == 20);
	}
}
