package com.iar.codingInterviews.linkedList.convertToArray;

import java.util.ArrayList;

import com.iar.codingInterviews.linkedList.GciLinkedListNode;

public class GciLinkedListArrayConverterIterative<T> implements GciLinkedListArrayConverter<T> {

	@Override
	public ArrayList<T> convert(GciLinkedListNode<T> head) {

		ArrayList<T> result = new ArrayList<>();
		
		if (head == null)
			return result;

		GciLinkedListNode<T> current = head;

		while (current != null) {
			result.add(current.getValue());
			current = current.getNext();
		}
		
		return result;
	}
}