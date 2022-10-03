package com.iar.codingInterviews.revertLinkedList;

import java.util.function.Consumer;

public interface GciLinkedListTraverser<T> {

	void traverse(GciLinkedListNode<T> head, Consumer<GciLinkedListNode<T>> predicate);
}