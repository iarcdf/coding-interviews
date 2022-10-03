package com.iar.codingInterviews.invertBinaryTree;

import com.iar.codingInterviews.revertLinkedList.GciLinkedListNode;

public class GciInvertBinaryTree {
	
	public static void main(final String args[]) {
		
		GciLinkedListNode<String> a = new GciLinkedListNode<>("a");
		GciLinkedListNode<String> b = new GciLinkedListNode<>("b");
		a.setNextNode(b);
		GciLinkedListNode<String> c = new GciLinkedListNode<>("c");
		b.setNextNode(c);
		GciLinkedListNode<String> d = new GciLinkedListNode<>("d");
		c.setNextNode(d);
		
		print(a);

		System.out.println("------------------------------");

		GciLinkedListNode<String> newHead = revert(a);
		
		print(newHead);
	}
	
	//      -> a -> b -> null
	//         1    2    3 
	// null <- a    b -> null
	// null <- a <- b <-

	//      -> a -> b -> c -> d -> null
	//         1    2    3
	// null <- a <- b    c -> d -> null
	//              1    2    3
	// null <- a <- b <- c    d -> null
	//                   1    2    3
	// null <- a <- b <- c <- d <-

	private static GciLinkedListNode<String> revert(GciLinkedListNode<String> head) {
		
		if(head==null) return null;
		
		if(head.getNextNode()==null) return head;
		
		GciLinkedListNode<String> n1 = head;
		GciLinkedListNode<String> n2 = n1.getNextNode();
		GciLinkedListNode<String> n3 = n2.getNextNode();
		
		while(n3!=null) {
			n2.setNextNode(n1);
			n1 = n2;
			n2 = n3;
			n3 = n3.getNextNode();
		}

		n2.setNextNode(n1);

		head.setNextNode(null);
		
		return n2;
	}

	private static void print(GciLinkedListNode<String> head) {
		GciLinkedListNode<String> current = head;
		while(current!=null) {
			System.out.println(current.getValue());
			current = current.getNextNode();
		}
	}
}