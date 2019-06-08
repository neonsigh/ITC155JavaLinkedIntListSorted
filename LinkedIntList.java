/* Write a method called isSorted that returns true if the list is in 
 * sorted (nondecreasing) order and returns fals otherwise. An empty
 * list is considered to be sorted.
 * 
 * isSorted method is at line 102
 */


public class LinkedIntList {

	
	private ListNode front; // first value in the list
	
	// construct an empty list
	public LinkedIntList() {
		front = null;
	}
	
	// append a value to the end of the list
	public void add(int value) {
		if(front == null) {
			front = new ListNode(value);
		} else {
			ListNode current = front;
			while(current.next != null) {
				current = current.next;
			}
			
			current.next = new ListNode(value);
		}
	}
	
	
	// return the current # of elements in the list
	public int size() {
		int count = 0;
		ListNode current = front;
		while(current != null) {
			current = current.next;
			count++;
		}
		return count;
	}
	
	
	
	
	// return a comma-separated bracketed version of the list 
	public String toString() {
		if(front == null) {
			return "[]";
		} else {
			String result = "[" + front.data; // fence post
			ListNode current = front.next;
			while (current != null) {
				result += " , " + current.data;
				current = current.next;
			}
			
			result += "]";
			return result;
		}
	}
	
	// return the value at a given index in the list
	public int get(int index) {
		return nodeAt(index).data;
	}

	// pre: 0 < index < size
	// return a reference to the node at a given index
	private ListNode nodeAt(int index) {
		ListNode current = front;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		return current;
	}
	
	public void add(int index, int value) {
		if(index == 0) {
			front = new ListNode(value, front);
		} else {
			ListNode current = nodeAt(index -1);
			current.next = new ListNode(value, current.next);
		}
	}
	
	// pre 0 < index < size()
	// post: remove value at the given index
	public void remove(int index) {
		if(index == 0) {
			front = front.next;
		} else {
			ListNode current = nodeAt(index - 1);
			current.next = current.next.next;
		}
	}
	
	
	
	public boolean isSorted() {
	    if(front == null) // if list is empty consider it sorted
	        return true;
	        
	    ListNode pre = front; // setting previous list item to compare current to
	    ListNode current = pre.next; // setting list item we want to check against previous item
	    
	    while(current != null) { // if current position to check is not empty
	        if(pre.data > current.data) // if previous is greater than current item being checked
	            return false;
	            
	        pre = current; // move previous item forward one
	        current = pre.next; // move current item to be checked forward one
	    }
	    
	    return true; // return true that the list has items and they are sorted
	}
	
}
