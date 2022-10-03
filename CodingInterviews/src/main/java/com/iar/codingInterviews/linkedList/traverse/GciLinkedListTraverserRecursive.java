package com.iar.codingInterviews.linkedList.traverse;

import java.util.function.Consumer;

import com.iar.codingInterviews.linkedList.GciLinkedListNode;

public class GciLinkedListTraverserRecursive<T> implements GciLinkedListTraverser<T> {

	@Override
	public void traverse(GciLinkedListNode<T> head, Consumer<GciLinkedListNode<T>> consumer) {

		if (head == null)
			return;

		GciLinkedListNode<T> current = head;

		if (current != null) {
			consumer.accept(current);
			traverse(current.getNext(), consumer);
		}
	}
}