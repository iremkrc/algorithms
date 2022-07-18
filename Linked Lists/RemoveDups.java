// 2.1 Remove Dups: Write code to remove duplicates from an unsorted linked list.

import java.util.*;

public class RemoveDups {

	// Time Complexity: O(N), Space Complexity O(N)
	public static void removeDups(LinkedListNode n){
		HashSet<Integer> set = new HashSet<>();
		LinkedListNode previous = null;
		while(n != null){
			if(!set.contains(n.value)){
				set.add(n.value);
				previous = n;
			}else{
				previous.next = n.next;
			}
			n = n.next;
		}
	}
	// Time Complexity: O(N^2), Space Complexity O(1)
	public static void removeDupsInPlace(LinkedListNode n){
		LinkedListNode second = null;
		while(n != null){
			second = n.next;
			LinkedListNode secondPrev = n;
			while(second != null){
				if(n.data == second.data){
					secondPrev.next = second.next;
				}else{
					secondPrev = second;
				}
				second = second.next;
			}
			n = n.next;
		}
	}
}
