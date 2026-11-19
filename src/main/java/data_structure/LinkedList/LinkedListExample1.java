package data_structure.LinkedList;

/** Purpose: Encapsulates linked list example1 behavior; it supports data-structure processing. Owner: Virendra Gupta. */
public class LinkedListExample1 {

	Node head;

	/** Purpose: Encapsulates node behavior; it supports data-structure processing. Owner: Virendra Gupta. */
	class Node {
		Node next;
		int data;

		/** Purpose: Creates a node instance. */
		public Node(int data) {
			this.next = null;
			this.data = data;
		}
	}

	/** Purpose: Adds insert data. */
	private LinkedListExample1 insert(int data, LinkedListExample1 list) {
		Node newNode = new Node(data);
		newNode.next = null;
		if (list.head == null) {
			list.head = newNode;
		} else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
		return list;
	}

		public static void main(String args[]) {
		LinkedListExample1 list = new LinkedListExample1();
		list = list.insert(3, list);
		list = list.insert(4, list);
		list = list.insert(5, list);
		list = list.insert(6, list);

		printLinkedListData(list);
	}

	/** Purpose: Performs the print linked list data operation. */
	private static void printLinkedListData(LinkedListExample1 list) {
		if (list != null) {
			Node node = list.head;
			while (node != null && node.next != null) {
				System.out.println(node.data);
				node = node.next;
			}
		}
	}

}
