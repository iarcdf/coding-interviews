package com.iar.codingInterviews.linkedList.zipper;

import com.iar.codingInterviews.linkedList.GciLinkedListNode;

public interface GciLinkedListZipper<T> {

	GciLinkedListNode<T> zipper(GciLinkedListNode<T> head1, GciLinkedListNode<T> head2);
}