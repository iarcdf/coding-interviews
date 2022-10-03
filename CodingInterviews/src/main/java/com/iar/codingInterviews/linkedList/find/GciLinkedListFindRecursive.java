package com.iar.codingInterviews.linkedList.find;

import com.iar.codingInterviews.linkedList.GciLinkedListNode;

public class GciLinkedListFindRecursive<T> implements GciLinkedListFinder<T> {

	// Time: O(number of nodes)
	// Space: O(number of nodes)
	@Override
	public GciLinkedListNode<T> find(GciLinkedListNode<T> head, T target) {

		if (head == null)
			return null;

		if(valuesAreEquals(head.getValue(), target)) {
			return head;
		}
		
		return find(head.getNext(), target) ;
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