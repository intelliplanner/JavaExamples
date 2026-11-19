package a_example;

import java.util.List;
import java.util.Objects;

/** Purpose: Encapsulates custom hashmap behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
public class CustomHashmap {
    Node node;

    
    /** Purpose: Creates a custom hashmap instance. */
    public CustomHashmap( Node node) {
        this.node = node;
    }

    @Override
    
    /** Purpose: Supports reliable object comparison. */
    public boolean equals(Object n) {
           return  this.node.equals( (Node) n );
    }

    @Override
    
    /** Purpose: Validates hash code conditions. */
    public int hashCode() {
        return Objects.hash(node.key);
    }

    /** Purpose: Encapsulates node behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
    static  class Node{
        String key;
        String value;

        /** Purpose: Creates a node instance. */
        public Node(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    /** Purpose: Adds insert node data. */
    public List<Node> insertNode(Node n){
        List<Node> hashmap = null;
        if(n!=null){

        }
        return hashmap;
    }

}
