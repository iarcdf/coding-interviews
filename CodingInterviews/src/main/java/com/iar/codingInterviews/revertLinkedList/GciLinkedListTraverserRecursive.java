package com.iar.codingInterviews.revertLinkedList;

import java.util.function.Consumer;

public class GciLinkedListTraverserRecursive<T> implements GciLinkedListTraverser<T> {

	@Override
	public void traverse(GciLinkedListNode<T> head, Consumer<GciLinkedListNode<T>> consumer) {

		if (head == null)
			return;

		GciLinkedListNode<T> current = head;

		if (current != null) {
			consumer.accept(current);
			traverse(current.getNextNode(), consumer);
		}
	}
}