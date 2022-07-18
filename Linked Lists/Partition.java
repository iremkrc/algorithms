/* 
Partition: Write code to partition a linked list around a value x, such that all nodes less than x come
before all nodes greater than or equal to x. If x is contained within the list, the values of x only need
to be after the elements less than x (see below). The partition element x can appear anywhere in the
"right partition"; it does not need to appear between the left and right partitions.

Input: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [partition= 5]
Output: 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8
*/
public class Partition {
	// Time Complexity: O(N^2), Space Complexity: O(1)
	public static void partitionInPlace(Node head, int p){
		Node current = null;
		while(head != null){
			if(head.value >= p){
				current = head;
				boolean flag = false;
				while(current != null){
					if(current.value < p){
						int temp = current.value;
						current.value = head.value;
						head.value = temp;
						flag = true;
						break;
					}
					current = current.next;
				}
				if(!flag) return;
			}
			head = head.next;
		}
	}
	
	// Time Complexity: O(N), Space Complexity: O(N)
	public static Node partition(Node head, int p){
		Node start = null;
		Node firstStart = null;
		Node end = null;
		Node firstEnd = null;
		
		while(head != null){
			if(head.value < p){
				if(start == null) start = head;
				else{
					if(firstStart == null) firstStart = start;
					start.next = head;
					start = head;
				}
			}else{
				if(end == null) end = head;
				else{
					if(firstEnd == null) firstEnd = end;
					end.next = head;
					end = head;
				}
			}
			head = head.next;
		}
		
		start.next = firstEnd;
		return firstStart;
	}
    
}
