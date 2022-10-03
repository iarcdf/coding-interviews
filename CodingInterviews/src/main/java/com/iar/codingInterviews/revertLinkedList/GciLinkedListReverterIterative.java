package com.iar.codingInterviews.revertLinkedList;

public class GciLinkedListReverterIterative<T> implements GciLinkedListReverter<T> {

	@Override
	public GciLinkedListNode<T> revert(GciLinkedListNode<T> head) {

		if (head == null)
			return null;

		if (head.getNext() == null)
			return head;

		GciLinkedListNode<T> n1 = head;
		GciLinkedListNode<T> n2 = n1.getNext();
		GciLinkedListNode<T> n3 = n2.getNext();

		while (n3 != null) {
			n2.setNext(n1);
			n1 = n2;
			n2 = n3;
			n3 = n3.getNext();
		}

		n2.setNext(n1);

		head.setNext(null);

		return n2;
	}
}