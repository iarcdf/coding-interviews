package com.iar.codingInterviews.revertLinkedList;

public class GciLinkedListNode<T> {

	private T value;

	private GciLinkedListNode<T> nextNode;
	
	public GciLinkedListNode(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public GciLinkedListNode<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(GciLinkedListNode<T> nextNode) {
		this.nextNode = nextNode;
	}
	
	
}
