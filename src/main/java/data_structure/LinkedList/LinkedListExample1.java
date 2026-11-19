package data_structure.LinkedList;


/**
 * Encapsulates linked list example1 behavior for efficient data organization and processing.
 */
public class LinkedListExample1 {

	Node head;

	/**
 * Encapsulates node behavior for efficient data organization and processing.
 */
	class Node {
		Node next;
		int data;

		/**
 * Creates a configured node instance for the represented workflow.
 */
		public Node(int data) {
			this.next = null;
			this.data = data;
		}
	}

	/**
 * Adds insert information required by the workflow.
 */
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

	/**
 * Performs the print linked list data operation required by the represented example.
 */
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
