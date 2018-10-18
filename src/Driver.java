
public class Driver {
	public static void main(String [] args){
		// Create a LinkedList and verify the methods
		SingleLinkedList list = new SingleLinkedList();
		list.printList();
		list.addFirst(10); list.printList();
		list.addFirst(20); list.printList();
		list.addFirst(25); list.printList();
		list.addLast(30); list.printList();
		list.removeFirst(); list.printList();
		list.printReverse(list.getHead());
	}

}
