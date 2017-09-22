package io.kavya.Fortinet;

public class ReverseLinkedList {
	static Node head;
	 
	static class Node {
		Node next;
		int value;
		
		Node(int v)
		{
			next = null;
			value = v;
		}
	}
	
	
	//Time Complexity: O(n)
	//Space Complexity : O(n)
	public Node reverse(Node head)
	{
		Node previous = null;
		Node current = head;
		Node next = null;
		while(current != null)
		{
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		head = previous;
		return head;
	}
}
