package Java8.ForEach;

import java.io.*;

// DO NOT change the class name
public class Solution
{
    public static void main(String[] args) {

        System.out.println("Hello Java!");
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(2);
        ListNode ln3 = new ListNode(3);
        ListNode ln4 = new ListNode(4);

        //1 -> 2 -> 3 -> 4 -> null
        ln1.next = ln2;
        ln2.next = ln3;
        ln3.next = ln4;
        ln4.next = null;

        ListNode lnReverse = reverse(ln1);
        System.out.println(lnReverse.val);
        System.out.println(lnReverse.next.val);
        System.out.println(lnReverse.next.next.val);
        System.out.println(lnReverse.next.next.next.val);

    }

    public static ListNode reverse(ListNode head) {
//        ListNode next= null;
        ListNode currNode = head;
        ListNode newNode = null;
        while(currNode.next == null){
            System.out.println(currNode.val);
//            currNode.next = null;
//            currNode == currNode.next;
            if(currNode == null){
               newNode = new ListNode(currNode.val);
            }
        }

        return newNode;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}