package com.iar.codingInterviews.linkedList.revert;

import com.iar.codingInterviews.linkedList.GciLinkedListNode;

public class GciLinkedListReverterRecursive<T> implements GciLinkedListReverter<T> {

	// Time: O(number of nodes)
	// Space: O(number of nodes)
	@Override
	public GciLinkedListNode<T> revert(final GciLinkedListNode<T> head) {
		return revert(null, head);
	}

	private GciLinkedListNode<T> revert(final GciLinkedListNode<T> previous, final GciLinkedListNode<T> current) {
		
		if(current==null) {
			return previous;
		}

		GciLinkedListNode<T> next = current.getNext();
		
		current.setNext(previous);

		return revert(current, next);
	}

}