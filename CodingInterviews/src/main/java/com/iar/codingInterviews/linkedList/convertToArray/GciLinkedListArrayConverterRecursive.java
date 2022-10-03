package com.iar.codingInterviews.linkedList.convertToArray;

import java.util.ArrayList;

import com.iar.codingInterviews.linkedList.GciLinkedListNode;

public class GciLinkedListArrayConverterRecursive<T> implements GciLinkedListArrayConverter<T> {

	@Override
	public ArrayList<T> convert(GciLinkedListNode<T> head) {

		ArrayList<T> array = new ArrayList<>();

		if (head == null)
			return array;

		array.add(head.getValue());

		GciLinkedListNode<T> next = head.getNext();

		if (next != null) {
			convert(next, array);
		}

		return array;
	}

	private void convert(GciLinkedListNode<T> node, ArrayList<T> array) {

		array.add(node.getValue());

		GciLinkedListNode<T> next = node.getNext();

		if (next != null) {
			convert(next, array);
		}
	}
}
