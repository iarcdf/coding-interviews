package com.iar.codingInterviews.linkedList.getNode;

import com.iar.codingInterviews.linkedList.GciLinkedListNode;

public class GciLinkedListGetRecursive<T> implements GciLinkedListGetNode<T> {

	// Time: O(number of nodes)
	// Space: O(number of nodes)
	@Override
	public GciLinkedListNode<T> get(GciLinkedListNode<T> head, int index) {

		if (head == null)
			throw new ArrayIndexOutOfBoundsException();

		if (index == 0) {
			return head;
		}

		return get(head.getNext(), index - 1);
	}
}