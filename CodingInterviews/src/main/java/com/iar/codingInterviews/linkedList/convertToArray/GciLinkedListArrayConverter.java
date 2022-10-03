package com.iar.codingInterviews.linkedList.convertToArray;

import java.util.ArrayList;

import com.iar.codingInterviews.linkedList.GciLinkedListNode;

public interface GciLinkedListArrayConverter<T> {

	ArrayList<T> convert(GciLinkedListNode<T> head);
}