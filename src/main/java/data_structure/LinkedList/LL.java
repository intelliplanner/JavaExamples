package data_structure.LinkedList;

/** Purpose: Encapsulates ll behavior; it supports data-structure processing. Owner: Virendra Gupta. */
public class LL {
	Node head = null;

	/** Purpose: Encapsulates node behavior; it supports data-structure processing. Owner: Virendra Gupta. */
	static class Node {
		int data;
		Node next;

		/** Purpose: Creates a node instance. */
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

		public static void main(String s[]) {
		LL linkedList = new LL();
		linkedList.addFirst(linkedList, 1);
		linkedList.addFirst(linkedList, 2);
		linkedList.addFirst(linkedList, 3);
		linkedList.addFirst(linkedList, 4);
		linkedList.addFirst(linkedList, 5);
		linkedList.addFirst(linkedList, 2);
		 printLinkedList(linkedList);
		// linkedList.addNodeAtPosition(linkedList, 40, 2);
		// printLinkedList(linkedList);
		// reverseLinkedList(linkedList);
		// reverseLinkedListSecondway(linkedList);
		// searchMiddleOfLinkedList(linkedList);
		// deleteMiddleOfLinkedList(linkedList);
		// removeDuplicateElementFromSortedLinkedList(linkedList);
		// reverseLinkedListInGroupsOfGivenSize(linkedList);
		// detectLoopInLinkedList();
		removeLoopInLinkedList(); // Not Completed Go to GeeksFor Geeks
	}

	/** Purpose: Removes remove loop in linked list data. */
	private static void removeLoopInLinkedList() {
		LL linkedList = new LL();
		// assign values to each linked list node
		linkedList.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node five = new Node(5);
//		Node six = new Node(6);
//		Node seven = new Node(7);
//		Node eight = new Node(8);
//		Node nine = new Node(9);
//		Node ten = new Node(10);
		// connect each node of linked list to next node
		linkedList.head.next = second;
		second.next = third;
		third.next = fourth;
		// make loop in LinkedList
		fourth.next = five;
		five.next=second;
//		six.next=seven;
//		seven.next=eight;
//		eight.next=nine;
//		nine.next=ten;
//		ten.next=third;
//		removeLoopInLinkedList(linkedList);
	}

	/** Purpose: Removes remove loop in linked list data. */
	private static void removeLoopInLinkedList(LL linkedList) {

		if (linkedList == null || linkedList.head.next == null) {
			return;
		}
		Node slowNode = linkedList.head;
		Node fastNode = linkedList.head;
		while (slowNode != null && fastNode != null && fastNode.next != null) {
			slowNode = slowNode.next;
			fastNode = fastNode.next.next;
			if (slowNode == fastNode) {
//				System.out.println("Loop Detected at " + slowNode.data +" to "+slowNode.next.data);
				removeLoop(slowNode,linkedList.head);
				break;
			}
		}
		printLinkedList(linkedList);
	}

	/** Purpose: Removes remove loop data. */
	private static void removeLoop(Node loop, Node head) {
        Node ptr1 = loop;
        Node ptr2 = loop;
 
        // Count the number of nodes in loop
        int k = 1, i;
        while (ptr1.next != ptr2) {
            ptr1 = ptr1.next;
            k++;
        }
 
        // Fix one pointer to head
        ptr1 = head;
 
        // And the other pointer to k nodes after head
        ptr2 = head;
        for (i = 0; i < k; i++) {
            ptr2 = ptr2.next;
        }
 
        /*  Move both pointers at the same pace,
         they will meet at loop starting node */
        while (ptr2 != ptr1) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
 
        // Get pointer to the last node
        while (ptr2.next != ptr1) {
            ptr2 = ptr2.next;
        }
 
        /* Set the next node of the loop ending node
         to fix the loop */
        ptr2.next = null;
    }

	/** Purpose: Performs the detect loop in linked list operation. */
	private static void detectLoopInLinkedList() {
		LL linkedList = new LL();

		// assign values to each linked list node
		linkedList.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);

		// connect each node of linked list to next node
		linkedList.head.next = second;
		second.next = third;
		third.next = fourth;
		// make loop in LinkedList
		fourth.next = second;
		detectLoopInLinkedList(linkedList);
	}

	/** Purpose: Performs the detect loop in linked list operation. */
	private static void detectLoopInLinkedList(LL linkedList) {
		if (linkedList == null || linkedList.head.next == null) {
			return;
		}
		Node slowNode = linkedList.head;
		Node fastNode = linkedList.head;
		while (fastNode.next != null) {
			slowNode = slowNode.next;
			fastNode = fastNode.next.next;
			if (slowNode.data == fastNode.data) {
				System.out.println("Loop Detected at " + slowNode.next.data);
				break;
			}
		}
	}

	/** Purpose: Performs the reverse linked list in groups of given size operation. */
	private static void reverseLinkedListInGroupsOfGivenSize(LL linkedList) {
		if (linkedList == null || linkedList.head.next == null) {
			return;
		}
		Node currNode = linkedList.head;
		Node prevNode = null;
		int i = 1;
		int k = 2;
		while (currNode != null && currNode.next != null) {
			if (i == k) {
				prevNode = currNode;
				currNode = prevNode;
				break;
			} else {
				i++;
			}
		}
		printLinkedList(linkedList);
	}

	/** Purpose: Removes remove duplicate element from sorted linked list data. */
	private static void removeDuplicateElementFromSortedLinkedList(LL linkedList) {

		if (linkedList == null || linkedList.head.next == null) {
			return;
		}
		Node currNode = linkedList.head;
		Node prevNode = null;
		while (currNode != null && currNode.next != null) {
			prevNode = currNode;
			currNode = currNode.next;
			if (prevNode.data == currNode.data) {
				prevNode.next = currNode.next;
			}
		}
		printLinkedList(linkedList);
	}

	/** Purpose: Removes delete middle of linked list data. */
	private static void deleteMiddleOfLinkedList(LL linkedList) {
		Node prevNode = null;
		Node slowPointer = linkedList.head;
		Node fastPointer = linkedList.head;
		while (fastPointer != null && fastPointer.next != null) {
			prevNode = slowPointer;
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
			if (fastPointer == null || fastPointer.next == null) {
				prevNode.next = slowPointer.next;
			}
		}
		printLinkedList(linkedList);
	}

	/** Purpose: Performs the search middle of linked list operation. */
	private static void searchMiddleOfLinkedList(LL linkedList) {

		if (linkedList != null) {
			Node slowPointer = linkedList.head;
			Node fastPointer = linkedList.head;
			while (fastPointer != null && fastPointer.next != null) {
				slowPointer = slowPointer.next;
				fastPointer = fastPointer.next.next;
			}
			System.out.println("Middle Element: " + slowPointer.data);
		}
	}

	/** Purpose: Performs the reverse linked list operation. */
	private static void reverseLinkedList(LL linkedList) {
		if (linkedList != null && linkedList.head.next == null) {
			return;
		}
		Node prevNode = linkedList.head;
		Node currNode = linkedList.head.next;
		Node NextNode = null;
		while (currNode != null) {
			NextNode = currNode.next;
			currNode.next = prevNode;
			prevNode = currNode;
			currNode = NextNode;
		}
		linkedList.head.next = null;
		linkedList.head = prevNode;

		printLinkedList(linkedList);
	}

	/** Purpose: Performs the reverse linked list secondway operation. */
	private static void reverseLinkedListSecondway(LL linkedList) {
		if (linkedList != null) {
			reverseList(linkedList.head);
		}
	}

	/** Purpose: Performs the reverse list operation. */
	private static void reverseList(Node node) {
		if (node != null) {
			reverseList(node.next);
			System.out.print(node.data + " ");
		}
	}

	/** Purpose: Performs the print linked list operation. */
	private static void printLinkedList(LL linkedList) {
		if (linkedList != null) {
			Node node = linkedList.head;
			while (node != null) {
				System.out.print(node.data + " ");
				node = node.next;
			}
			System.out.println();
		}
	}

	/** Purpose: Adds add node at position data. */
	private void addNodeAtPosition(LL linkedList, int data, int position) {
		Node newNode = new Node(data);
		if (linkedList != null) {
			Node node = linkedList.head;
			int i = 1;
			Node prevNode = null;
			while (node != null) {
				if (i == position) {
					// Node nodeNext = node;
					prevNode.next = newNode;
					newNode.next = node;
					break;
				} else {
					prevNode = node;
					node = node.next;
					i++;
				}
			}
		}
	}

	/** Purpose: Adds add first data. */
	private void addFirst(LL linkedList, int data) {
		Node newNode = new Node(data);
		if (linkedList.head == null) {
			linkedList.head = newNode;
		} else {
			Node last = linkedList.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
	}

}
