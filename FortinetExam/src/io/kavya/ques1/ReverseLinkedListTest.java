package io.kavya.Fortinet;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import io.kavya.Fortinet.ReverseLinkedList.Node;

public class ReverseLinkedListTest {

	ReverseLinkedList list = new ReverseLinkedList();
	Node head;
	@Before
	public void setup(){
		
      head = new Node(85);
      head.next = new Node(15);
      head.next.next = new Node(4);
      head.next.next.next = new Node(20);
      }
	
	@Test
	public void ReverseLinkedListtest() {
		
		head = list.reverse(head);
        assertEquals(20,head.value);
	}

}
	