package a;

/** Purpose: Encapsulates osstra behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
public class Osstra {

    Node list = null;
    
    /** Purpose: Encapsulates node behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
    static class Node{
        int val;
        Node next = null;

        /** Purpose: Creates a node instance. */
        Node(int val){
            this.val = val;
        }
    }

    /** Purpose: Adds insert data. */
    public Node  insert(int value){
        if(list == null){
            list = new Node(value);
            list.next = null;
        }
        else{
            while(list.next != null){
                list.next = list.next.next;
            }
//            while(list.next == null){
            Node newNode = new Node(value);
            list.next = newNode;
            list.next.next = null;
//            }
//            while((list.next != null){
//
//            }

        }
        return list;
    }

        public static void main(String... arr){
        Osstra obj  = new Osstra();
        Node node = obj.insert(1);
        obj.insert(3);
        obj.insert(5);
        node =  obj.insert(7);
//         while(node.next!=null){
//             System.out.print(node.val);
//             node = node.next;
//         }

    }

}
