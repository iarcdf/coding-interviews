package com.iar.codingInterviews.linkedList;

public class GciLinkedListNode<T> {

	private T value;

	private GciLinkedListNode<T> next;
	
	public GciLinkedListNode(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public GciLinkedListNode<T> getNext() {
		return next;
	}

	public void setNext(GciLinkedListNode<T> nextNode) {
		this.next = nextNode;
	}
	
	
}
