package easy;

// package Amazon;
import java.util.*;
class Node{
    int v;
    Node next;
    Node(int v){
        this.v=v;
    }
}

public class traverseLinkedList {
    public static void main(String[] args) {
        int a[]={1, 2, 4, 5, 6, 7, 8, 9};
        Node head1=new Node(a[0]);
        Node temp1=head1;
        for(int i=1; i<a.length; i++){
            temp1.next=new Node(a[i]);
            temp1=temp1.next;

        }
        System.out.println(head1.next.next.v);
        temp1=head1;
        while(temp1!=null){
            System.out.print(temp1.v);
            if(temp1.next!=null){
                System.out.print("->");
            }
            temp1=temp1.next;
        }
    }
}

