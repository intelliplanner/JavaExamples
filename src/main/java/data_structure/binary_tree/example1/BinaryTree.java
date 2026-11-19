package data_structure.binary_tree.example1;

/** Purpose: Encapsulates binary tree behavior; it supports data-structure processing. Owner: Virendra Gupta. */
public class BinaryTree {
	
	/** Purpose: Encapsulates node behavior; it supports data-structure processing. Owner: Virendra Gupta. */
	static class Node {
		int value;
		Node left, right;

		/** Purpose: Creates a node instance. */
		Node(int value) {
			this.value = value;
			left = null;
			right = null;
		}
	}

	/** Purpose: Adds insert data. */
	public void insert(Node node, int value) {
		if (value < node.value) {
			if (node.left != null) {
				insert(node.left, value);
			} else {
				System.out.println(" Inserted " + value + " to left of " + node.value);
				node.left = new Node(value);
			}
		} else if (value > node.value) {
			if (node.right != null) {
				insert(node.right, value);
			} else {
				System.out.println("  Inserted " + value + " to right of " + node.value);
				node.right = new Node(value);
			}
		}
	}

	/** Purpose: Performs the traverse in order operation. */
	public void traverseInOrder(Node node) {
		if (node != null) {
			traverseInOrder(node.left);
			System.out.print(" " + node.value);
			traverseInOrder(node.right);
		}
	}

		public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();
		Node root = new Node(5);
		System.out.println("Binary Tree Example");
		System.out.println("Building tree with root value " + root.value);
		tree.insert(root, 2);
		tree.insert(root, 4);
		tree.insert(root, 8);
		tree.insert(root, 6);
		tree.insert(root, 7);
		tree.insert(root, 3);
		tree.insert(root, 9);
		System.out.println("Traversing tree in order");
		tree.traverseInOrder(root);

	}
}
