package com.iar.codingInterviews.revertLinkedList;

public class GciLinkedListReverterRecursive<T> implements GciLinkedListReverter<T> {

	@Override
	public GciLinkedListNode<T> revert(GciLinkedListNode<T> head) {

		if (head == null)
			return null;

		if (head.getNextNode() == null)
			return head;

		GciLinkedListNode<T> n1 = head;
		GciLinkedListNode<T> n2 = n1.getNextNode();
		GciLinkedListNode<T> n3 = n2.getNextNode();

		while (n3 != null) {
			n2.setNextNode(n1);
			n1 = n2;
			n2 = n3;
			n3 = n3.getNextNode();
		}

		n2.setNextNode(n1);

		head.setNextNode(null);

		return n2;
	}
}