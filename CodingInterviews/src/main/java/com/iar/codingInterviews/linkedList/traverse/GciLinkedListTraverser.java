package com.iar.codingInterviews.linkedList.traverse;

import java.util.function.Consumer;

import com.iar.codingInterviews.linkedList.GciLinkedListNode;

public interface GciLinkedListTraverser<T> {

	void traverse(GciLinkedListNode<T> head, Consumer<GciLinkedListNode<T>> predicate);
}