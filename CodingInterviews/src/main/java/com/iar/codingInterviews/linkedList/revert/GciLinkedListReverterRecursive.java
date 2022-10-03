package com.iar.codingInterviews.linkedList.revert;

import com.iar.codingInterviews.linkedList.GciLinkedListNode;

public class GciLinkedListReverterRecursive<T> implements GciLinkedListReverter<T> {

	@Override
	public GciLinkedListNode<T> revert(final GciLinkedListNode<T> head) {

		if (head == null)
			return null;

		if (head.getNext() == null)
			return head;

		GciLinkedListNode<T> n1 = head;
		GciLinkedListNode<T> n2 = n1.getNext();
		GciLinkedListNode<T> n3 = n2.getNext();

		n2.setNext(n1);

		n1.setNext(null);

		if (n3 == null) {
			return n2;
		}

		return revert(n2, n3);
	}

	private GciLinkedListNode<T> revert(final GciLinkedListNode<T> n2, final GciLinkedListNode<T> n3) {

		GciLinkedListNode<T> m1 = n2;
		GciLinkedListNode<T> m2 = n3;
		GciLinkedListNode<T> m3 = n3.getNext();

		m2.setNext(m1);

		if (m3 == null) {
			return m2;
		}

		return revert(m2, m3);
	}

}