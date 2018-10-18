public class SingleLinkedList {
	private Node head;		// Head of the linkedlist
	private int size;		// How many nodes are there in list
	
	// Constructor
	public SingleLinkedList(){
		this.head = new Node(8); // Creates the head
		size = 0;
	}
	
	// AddFirst method, adds at the beginning of the list
	public void addFirst(Object item){
		Node first = new Node(item);	//Create new node
		first.next = head.next;			//Copy the next from the head
		head.next = first;				// Update head next
		this.size++;					// Increment the size
	}
	
	// AddAfter adds node after the node reference provided
	public void addAfter(Node target, Object item){
		Node insert = new Node(item);
		insert.next = target.next;
		target.next = insert;
		this.size++;
	}
	
	// AddLast method adds a node at the end of the linked list
	public void addLast(Object item){
		// We need getNode() to retrieve the referenc and then call addAfter()
		Node target = getNode(size);
		addAfter(target, item);
	}
	
	// Helper method, getNode, returns the reference to the node at given index
	public Node getNode(int index) {
		if(index < 0 || index > size)
			return null;
		Node iter = head;
		for(int i = 0; i < index; i++){
			iter = iter.next;
		}
		return iter;
	}
	public Object removeFirst(){
		// Check if there is data to be removed
		if (size ==0)
			return null;
		Node removed = head.next;		// Removing the first node, printed by head
		head.next = head.next.next;		// Update the head
		return removed.data;
	}
	
	// Helper display
	public void printList(){
		Node temp = head;
		System.out.print("Data: ");
		while(temp.next != null){
			System.out.print(temp.next.data+ "-> ");
			temp = temp.next;
		}
		System.out.println();
	}
	public void printReverse(){
		this.printReverse(this.head);
		System.out.println();
	}
	
	// Print the list in reverse
	public void printReverse(Node head){
		if(head.next == null)		//Base
			return;
		printReverse(head.next);	//Recursive Call
		System.out.print(head.next.data + "<- ");
	}
	public Node getHead(){
		return head;
	}
}
