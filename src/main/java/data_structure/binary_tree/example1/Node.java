package data_structure.binary_tree.example1;

/** Purpose: Encapsulates node behavior; it supports data-structure processing. Owner: Virendra Gupta. */
public class Node { 
    int data; 
    Node left, right; 

    /** Purpose: Creates a node instance. */
    public Node(int d) 
    { 
        data = d; 
        left = right = null; 
    } 
} 