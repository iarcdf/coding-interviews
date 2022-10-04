package com.iar.codingInterviews.linkedList.getNode;

import com.iar.codingInterviews.linkedList.GciLinkedListNode;

public interface GciLinkedListGetNode<T> {

	GciLinkedListNode<T> get(GciLinkedListNode<T> head, int index);
}