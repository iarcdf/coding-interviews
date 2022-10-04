package com.iar.codingInterviews.linkedList.zipper;

import com.iar.codingInterviews.linkedList.GciLinkedListNode;

public class GciLinkedListZipperIterative<T> implements GciLinkedListZipper<T> {

	// Time: O(number of nodes)
	// Space: O(node)
	@Override
	public GciLinkedListNode<T> zipper(GciLinkedListNode<T> head1, GciLinkedListNode<T> head2) {

		GciLinkedListNode<T> current1 = head1;
		GciLinkedListNode<T> current2 = head2;
		GciLinkedListNode<T> next1 = null;
		GciLinkedListNode<T> next2 = null;

		while (current1 != null || current2 != null) {

			if (current1 != null)
				next1 = current1.getNext();

			if (current2 != null)
				next2 = current2.getNext();

			if (current1 != null && current2 != null) {
				current1.setNext(current2);
				if (next1 != null) {
					current2.setNext(next1);
				}
			}

			current1 = next1;
			current2 = next2;
		}

		return head1;
	}

}