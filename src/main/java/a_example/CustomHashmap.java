package a_example;

import java.util.List;
import java.util.Objects;

public class CustomHashmap {
    Node node;


    public CustomHashmap( Node node) {
        this.node = node;
    }

    @Override
    public boolean equals(Object n) {
           return  this.node.equals( (Node) n );
    }

    @Override
    public int hashCode() {
        return Objects.hash(node.key);
    }

    static  class Node{
        String key;
        String value;

        public Node(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public List<Node> insertNode(Node n){
        List<Node> hashmap = null;
        if(n!=null){

        }
        return hashmap;
    }

}
