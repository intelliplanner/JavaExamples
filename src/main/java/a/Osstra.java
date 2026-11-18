package a;

public class Osstra {

    Node list = null;
    static class Node{
        int val;
        Node next = null;

        Node(int val){
            this.val = val;
        }
    }

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
