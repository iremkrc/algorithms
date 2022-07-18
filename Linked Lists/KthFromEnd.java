// 2.2 Return Kth to Last: Implement an algorithm to find the kth to last element of a singly linked list.
// Given a linked list and integer ‘n’, write an algorithm to find the nth node from the end in the Linked List.

// * -> * -> * -> * -> *

public class KthFromEnd {

	// Time Complexity: O(N), Space Complexity: O(1)
    public static LinkedListNode elementFromEnd(LinkedListNode node, int k){
    	int length = 0;
    	LinkedListNode head = node;
    	while(node != null){
    		length++;
    		node = node.next;
    	}
    	for(int i=0; i<=length-k; i++){
    		head = head.next;
    	}
    	return head;
    }
}
