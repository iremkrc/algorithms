// 2.6 Palindrome: Implement a function to check if a linked list is a palindrome.

import java.util.*;

public class Palindrome {

	// Time Complexity: O(N), Space Complexity: O(N);
    public static boolean isPalindrome(Node head){
    	List<Integer> list = new ArrayList<>();
    	int length = 0;
    	while(head != null){
    		list.add(head.value);
    		length++;
    		head = head.next;
    	}

    	for(int i=0; i<=length/2-1; i++){
    		if(list.get(i) != list.get(length-i-1)) return false;
    	}
    	return true;
    }
    // 1->3->2->4->6
    
    //Stack: 1 3  
    // Time Complexity: O(N), Space Complexity: O(N)
    public static boolean isPalindromeUsingStack(Node head){
    	Stack<Integer> stack = new Stack<>();
    	Node ptr1 = head;
    	Node ptr2 = head;
    	boolean odd = false;
    	while(ptr1 != null){
    		if(ptr2 != null){
    			if(ptr2.next = null){
    				odd = true;
    			}
    			ptr2 = ptr2.next.next;
    			stack.push(ptr1.value);
    			ptr1 = ptr1.next;
    		}else{
    			if(!odd){
    				if(stack.pop() != ptr1.value) return false;
    			}else{
    				stack.pop();
    				odd = true;
    				if(stack.pop() != ptr1.value) return false;
    			}
    			ptr1 = ptr1.next;
    		}
    	}
    	return true;
    }
}
