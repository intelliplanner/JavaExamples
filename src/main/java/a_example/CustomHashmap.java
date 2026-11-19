package a_example;

import java.util.List;
import java.util.Objects;

/**
 * Encapsulates custom hashmap behavior for the represented example workflow.
 */
public class CustomHashmap {
    Node node;


    /**
 * Creates a configured custom hashmap instance for the represented workflow.
 */
    public CustomHashmap( Node node) {
        this.node = node;
    }

    @Override
    /**
 * Supports reliable object comparison and collection lookup.
 */
    public boolean equals(Object n) {
           return  this.node.equals( (Node) n );
    }

    @Override
    /**
 * Verifies hash code conditions before processing continues.
 */
    public int hashCode() {
        return Objects.hash(node.key);
    }

    /**
 * Encapsulates node behavior for the represented example workflow.
 */
    static  class Node{
        String key;
        String value;

        /**
 * Creates a configured node instance for the represented workflow.
 */
        public Node(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    /**
 * Adds insert node information required by the workflow.
 */
    public List<Node> insertNode(Node n){
        List<Node> hashmap = null;
        if(n!=null){

        }
        return hashmap;
    }

}
