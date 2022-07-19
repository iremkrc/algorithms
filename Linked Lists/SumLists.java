import java.util.*;

/* 2.5 Sum Lists: You have two numbers represented by a linked list, where each node contains a single digit. The digits are stored in reverse order, such that the 1's digit is at the head of the list. Write a function that adds the two numbers and returns the sum as a linked list.

Input: (7-> 1 -> 6) + (5 -> 9 -> 2).That is,617 + 295.
Output: 2 -> 1 -> 9. That is, 912
*/

public class SumLists {

	public static Node sumLists2(Node n1, Node n2){
		int n = 0;
		int addition = 0;
		Node ret = new Node();
		Node first = null;
		while(n1 != null && n2 != null){
			n++;
			int sum = n1.value + n2.value + addition;
			if(sum >= 10){
				addition = 1;
				sum -= 10;
			}else{
				addition = 0;
			}
			ret.value = sum;
			if(first == null) first = ret;
			ret = ret.next;
			n1 = n1.next;
			n2 = n2.next;
		}
		if(n1 != null){
			while(n1 != null){
				int sum = n1.value + addition;
				ret.value = sum;
				ret = ret.next;
				n1 = n1.next;
				addition = 0;
			}
		}else if(n2 != null){
			while(n2 != null){
				int sum = n2.value + addition;
				ret.value = sum;
				ret = ret.next;
				n2 = n2.next;
				addition = 0;
			}
		}
		return first;
	}

	// Time Complexity: O(N), Space Complexity: O(N)
	public static int sumLists(Node n1, Node n2){
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();
		
		int len1 = 0;
		int len2 = 0;
		
		while(n1 != null){
			s1.push(n1.value);
			len1++;
			n1 = n1.next;
		}
		
		while(n2 != null){
			s2.push(n2.value);
			len2++;
			n2 = n2.next;
		}
		
		int num1 = 0;
		int num2 = 0;
		
		for(int i=len1-1; i>=0; i--){
			num1 += Math.pow(10, i) * s1.pop();
		}
		for(int i=len2-1; i>=0; i--){
			num2 += Math.pow(10, i) * s2.pop();
		}
		
		return num1 + num2;
	}
	
	public static Node 
	
	
	
	
	
/*
	FOLLOW UP
	Suppose the digits are stored in forward order. Repeat the above problem.
	EXAMPLE
	Input:(6 -> 1 -> 7) + (2 -> 9 -> 5).That is,617 + 295.
	Output: 9 -> 1 -> 2. That is, 912.
*/

	public static int sumListsForward(Node n1, Node n2){
		int len1 = 0;
		int len2 = 0;

		Node n1Head = n1;
		Node n2Head = n2;
		
		while(n1 != null){
			len1++;
			n1 = n1.next;
		}
		
		while(n2 != null){
			len2++;
			n2 = n2.next;
		}
		int num1 = 0;
		int num2 = 0;
		
		for(int i=len1-1; i>=0; i--){
			num1 += Math.pow(10, i) * n1Head.value;
			n1Head = n1Head.next;
		}
		for(int i=len2-1; i>=0; i--){
			num2 += Math.pow(10, i) * n2Head.value;
			n2Head = n2Head.next;
		}
		
		return num1 + num2;
	}
	
    
}
