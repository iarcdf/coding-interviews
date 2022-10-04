package com.iar.codingInterviews.linkedList.getNode;

import com.iar.codingInterviews.linkedList.GciLinkedListNode;

public class GciLinkedListGetIterative<T> implements GciLinkedListGetNode<T> {

	// Time: O(number of nodes)
	// Space: O(node)
	@Override
	public GciLinkedListNode<T> get(GciLinkedListNode<T> head, int index) {

		if (head == null)
			throw new ArrayIndexOutOfBoundsException();

		int currentIndex = 0;
		GciLinkedListNode<T> current = head;
		while (current != null) {
			if (currentIndex == index) {
				return current;
			}
			current = current.getNext();
			currentIndex++;
		}

		throw new ArrayIndexOutOfBoundsException();
	}
}