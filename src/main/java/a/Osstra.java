package a;

/**
 * Encapsulates osstra behavior for the represented example workflow.
 */
public class Osstra {

    Node list = null;
    /**
 * Encapsulates node behavior for the represented example workflow.
 */
    static class Node{
        int val;
        Node next = null;

        /**
 * Creates a configured node instance for the represented workflow.
 */
        Node(int val){
            this.val = val;
        }
    }

    /**
 * Adds insert information required by the workflow.
 */
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
