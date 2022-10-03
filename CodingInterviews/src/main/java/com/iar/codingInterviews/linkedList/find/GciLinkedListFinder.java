package com.iar.codingInterviews.linkedList.find;

import com.iar.codingInterviews.linkedList.GciLinkedListNode;

public interface GciLinkedListFinder<T> {

	GciLinkedListNode<T> find(GciLinkedListNode<T> head, T target);
}