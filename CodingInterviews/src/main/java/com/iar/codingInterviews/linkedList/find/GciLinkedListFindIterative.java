package com.iar.codingInterviews.linkedList.find;

import com.iar.codingInterviews.linkedList.GciLinkedListNode;

public class GciLinkedListFindIterative<T> implements GciLinkedListFinder<T> {

	// Time: O(number of nodes)
	// Space: O(node)
	@Override
	public GciLinkedListNode<T> find(GciLinkedListNode<T> head, T target) {

		if (head == null)
			return null;

		GciLinkedListNode<T> current = head;
		while (current != null) {
			if (valuesAreEquals(current.getValue(), target)) {
				return current;
			}
			current = current.getNext();
		}

		return null;
	}

	private boolean valuesAreEquals(T value1, T value2) {

		if (value1 == null && value2 == null) {
			return true;
		}

		if (value1 != null && value2 != null && value1.equals(value2)) {
			return true;
		}

		return false;
	}
}