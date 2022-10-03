package com.iar.codingInterviews.linkedList.revert;

import com.iar.codingInterviews.linkedList.GciLinkedListNode;

public interface GciLinkedListReverter<T> {

	GciLinkedListNode<T> revert(GciLinkedListNode<T> head);
}