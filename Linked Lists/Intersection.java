// 2.7 Intersection: Given two (singly) linked lists, determine if the two lists intersect. Return the inter­secting node. Note that the intersection is defined based on reference, not value. That is, if the kth node of the first linked list is the exact same node (by reference) as the jth node of the second linked list, then they are intersecting.

public class Intersection {
    public static Node intersection(Node n1, Node n2){
    	int len1 = 0;
    	int len2 = 0;
    	Node nf1 = n1;
    	Node nf2 = n2;
    	while(nf1 != null){
    		len1++;
    		nf1 = nf1.next;
    	}
    	while(nf2 != null){
    		len2++;
    		nf2 = nf2.next;
    	}
    	nf1 = n1;
    	nf2 = n2;
    	
    	int smaller = 0;
    	
    	if(len1>len2){
    		for(int i=0; i<len1-len2; i++){
    			nf1 = nf1.next;
    			smaller = len2;
    		}
    	}else{
    		for(int i=0; i<len2-len1; i++){
    			nf2 = nf2.next;
    			smaller = len1;
    		}
    	}
    	
    	for(int i=0; i<smaller; i++){
    		while(nf1 != null){
    			if(nf1.value == nf2.value && nf1.next == nf2.next) return nf1;
    			nf1 = nf1.next;
    			nf2 = nf2.next;
    		}
    	}
    	
    }
}
