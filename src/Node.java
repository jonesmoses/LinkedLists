// Node class to create the Linked List
public class Node {
	// Data fields
	Object data; 		// Data element
	Node next;  		// Pointer to the next node
	// Node previous; 	// Pointer to the previous node, for double Linked Lists
	
	// Constructor 
	public Node(Object data){
		this.data = data;
		this.next = null;
	}
}
