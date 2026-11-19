package data_structure.binary_tree.example;

/** Purpose: Encapsulates binary tree behavior; it supports data-structure processing. Owner: Virendra Gupta. */
public class BinaryTree {

	/** Purpose: Encapsulates node behavior; it supports data-structure processing. Owner: Virendra Gupta. */
	static class Node {
		int value;
		Node left;
		Node right;

		/** Purpose: Creates a node instance. */
		Node(int value) {
			this.value = value;
			this.left = null;
			this.right = null;
		}
	}

	/** Purpose: Adds insert node data. */
	private static void insertNode(Node node, int val) {
		if (node.left != null) {
			insertNode(node, val);
		} else if (node.left != null) {

		}
		printBinaryTree(node);
	}

	/** Purpose: Performs the print binary tree operation. */
	private static void printBinaryTree(Node bTree) {

	}

		public static void main(String[] str) {

	}
}
