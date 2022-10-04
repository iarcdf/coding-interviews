package com.iar.codingInterviews.linkedList.revert;

import com.iar.codingInterviews.linkedList.GciLinkedListNode;

public class GciLinkedListReverterIterative<T> implements GciLinkedListReverter<T> {

	// Time: O(number of nodes)
	// Space: O(1)
	@Override
	public GciLinkedListNode<T> revert(GciLinkedListNode<T> head) {

		if (head == null)
			return null;

		GciLinkedListNode<T> previous = null;
		GciLinkedListNode<T> current = head;

		while (current != null) {
			GciLinkedListNode<T> next = current.getNext();
			current.setNext(previous);
			previous = current;
			current = next;
		}

		return previous;
	}
}