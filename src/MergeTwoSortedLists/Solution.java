package MergeTwoSortedLists;

public class Solution {
	/**
	  Definition for singly-linked list.
	  */
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	  	public void print(ListNode l1) {
	  		ListNode ptr1 = l1; 
	  		while (ptr1!=null) {
	  			System.out.print(ptr1.val + " -> ");
	  		}
	  	}
	 
	    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        ListNode ptr1 = l1; 
	        ListNode ptr2 = l2; 
	        
	        ListNode l3 = new ListNode(); 
	        ListNode ptr3 = l3; 
	        while(ptr1 != null && ptr2 != null){
	            if(ptr3!=null){
	                if(ptr1.val >= ptr2.val){
	                    ptr3.next = ptr2; 
	                    ptr2 = ptr2.next;
	                    ptr3 = ptr3.next;
	                }
	                else{
	                    ptr3.next = ptr1; 
	                    ptr1 = ptr1.next;
	                    ptr3 = ptr3.next; 
	                }
	            }
	            else{
	                if(ptr1.val <= ptr2.val){
	                    ptr3 = ptr1;
	                    ptr1=ptr1.next;
	                }
	                else{
	                    ptr3 = ptr2;
	                    ptr2 = ptr2.next;
	                }
	            }
	        }
	            
	        
	        if(ptr1!= null)
	            ptr3.next = ptr1; 
	        if(ptr2!= null)
	            ptr3.next = ptr2;
	        
	        return l3; 
	    }
}

