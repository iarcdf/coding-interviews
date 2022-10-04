package com.iar.codingInterviews.linkedList.zipper;

import com.iar.codingInterviews.linkedList.GciLinkedListNode;

public class GciLinkedListZipperRecursive<T> implements GciLinkedListZipper<T> {

	// Time: O(number of nodes of the shorter list)
	// Space: O(number of nodes of the shorter list)
	@Override
	public GciLinkedListNode<T> zipper(GciLinkedListNode<T> head1, GciLinkedListNode<T> head2) {
		return zipper(head1, head1, head2);
	}

	private GciLinkedListNode<T> zipper(GciLinkedListNode<T> head, GciLinkedListNode<T> current1,
			GciLinkedListNode<T> current2) {

		if (current1 == null || current2 == null)
			return head;

		GciLinkedListNode<T> next1 = current1.getNext();
		GciLinkedListNode<T> next2 = current2.getNext();

		current1.setNext(current2);

		if (next1 != null)
			current2.setNext(next1);

		return zipper(head, next1, next2);
	}

}