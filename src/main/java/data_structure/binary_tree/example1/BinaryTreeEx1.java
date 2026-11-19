package data_structure.binary_tree.example1;

/**
 * Encapsulates binary tree ex1 behavior for efficient data organization and processing.
 */
public class BinaryTreeEx1 {
	Node root;
	/**
 * Encapsulates node behavior for efficient data organization and processing.
 */
	class Node {
		int key;
		Node left;
		Node right;

		/**
 * Creates a configured node instance for the represented workflow.
 */
		public Node(int key) {
			this.key = key;
			left = null;
			right = null;
		}
	}



	/**
 * Creates a configured binary tree ex1 instance for the represented workflow.
 */
	BinaryTreeEx1() {
		root = null;
	}

	/**
 * Adds insert information required by the workflow.
 */
	void insert(int key) {
		root = insert(root, key);
	}

	/**
 * Adds insert information required by the workflow.
 */
	Node insert(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}
		if (root.key > key) {
			root.left = insert(root.left, key);
		} else {
			root.right =insert(root.right, key);
		}
		return root;
	}

	/**
 * Performs the in order operation required by the represented example.
 */
	void inOrder() {
		System.out.println("---------------In-Order-----------");
		inOrderRec(root);
		System.out.println("");
	}

	// A utility function to do inorder traversal of BST
	void inOrderRec(Node root) {
		if (root != null) {
			inOrderRec(root.left);
			System.out.print(root.key +" ");
			inOrderRec(root.right);
		}
	}

	/**
 * Performs the pre order operation required by the represented example.
 */
	void preOrder() {
		System.out.println("---------------Pre Order-----------");
		preOrder(root);
		System.out.println("");
	}

	/**
 * Performs the pre order operation required by the represented example.
 */
	void preOrder(Node root) {
		if(root!=null) {
			System.out.print(root.key+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	/**
 * Performs the post order operation required by the represented example.
 */
	void postOrder() {
		System.out.println("---------------Post Order-----------");
		postOrder(root);
		System.out.println("");
	}
	/**
 * Performs the post order operation required by the represented example.
 */
	void postOrder(Node root) {
		if(root!=null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.key + " ");
		}
	}

	/**
 * Performs the search keyin bst operation required by the represented example.
 */
	boolean searchKeyinBST(int key) {
		boolean s =  searchKeyinBST(root,key);
		return s;
	}
	
	/**
 * Performs the search keyin bst operation required by the represented example.
 */
	boolean searchKeyinBST(Node root,int key) {
		if(root == null) {
			return false;
		}
		
		if(root.key == key) 
			return true;
		else if(root.key > key) 
			return searchKeyinBST(root.left,key);
		else 
			return	searchKeyinBST(root.right,key);
		
	}
	
	
	
		public static void main(String args[]) {
		BinaryTreeEx1 tree = new BinaryTreeEx1();

		/*
		 * Let us create following BST 50 / \ 30 70 / \ / \ 20 40 60 80
		 */
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		// print inorder traversal of the BST
		tree.inOrder();
		tree.preOrder();
		tree.postOrder();
		
		
	System.out.println("Key Exist: "+tree.searchKeyinBST(90));
	}

}
