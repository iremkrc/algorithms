// Delete Middle Node: Implement an algorithm to delete a node in the middle (i.e., any node but the first and last node, not necessarily the exact middle) of a singly linked list, given only access to that node.

// Input:the node c from the linked list a->b->c->d->e->f
// Result: nothing is returned, but the new linked list looks like a->b->d->e->f

public class DeleteMiddleNode {

	// Time Complexity: O(N), Space Complexity: O(1)
	// Node does not have to in the beginning, it can be the first or the last node as well.
    public static void deleteMiddleNode(Node middle){
    	while(middle.next != null){
			middle.value = middle.next.value;
			middle = middle.next;
    	}
    	middle = null;
    }
    
    // Time Complexity: O(1), Space Complexity: O(1)
    public static void deleteMiddleNode(Node middle){
    	middle.value = middle.next.value;
    	middle.next = middle.next.next;
    }
}
