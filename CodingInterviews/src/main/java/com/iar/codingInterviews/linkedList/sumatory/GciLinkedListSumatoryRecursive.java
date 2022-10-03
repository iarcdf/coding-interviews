package com.iar.codingInterviews.linkedList.sumatory;

import com.iar.codingInterviews.linkedList.GciLinkedListNode;

public class GciLinkedListSumatoryRecursive implements GciLinkedListSumatory {

	@Override
	public int sum(GciLinkedListNode<Integer> head) {

		int sum = 0;
				
		if (head == null)
			return sum;

		sum = head.getValue();

		if (head.getNext() != null) {
			sum += sum(head.getNext());
		}
		
		return sum;
	}
}