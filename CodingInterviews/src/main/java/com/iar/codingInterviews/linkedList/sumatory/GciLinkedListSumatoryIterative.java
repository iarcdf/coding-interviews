package com.iar.codingInterviews.linkedList.sumatory;

import com.iar.codingInterviews.linkedList.GciLinkedListNode;

public class GciLinkedListSumatoryIterative implements GciLinkedListSumatory {

	@Override
	public int sum(GciLinkedListNode<Integer> head) {

		int sum = 0;
				
		if (head == null)
			return sum;

		GciLinkedListNode<Integer> current = head;

		while (current != null) {
			sum += current.getValue();
			current = current.getNext();
		}
		
		return sum;
	}
}