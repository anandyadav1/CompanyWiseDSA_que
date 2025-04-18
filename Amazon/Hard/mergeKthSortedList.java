// import org.w3c.dom.Node;
import java.util.*;
import java.util.ArrayList;

class Node{
    int val;
    Node next;
    Node(int v) {
        val=v;
    }
}
public class mergeKthSortedList {
    public static void print(Node node){
        while(node != null){
            System.out.print(node.val);
            if(node.next!=null) System.out.print("->");
            node=node.next;
        }
    }

    public static Node mergeLinkedList(Node h1, Node h2){
        Node p, dummy=new Node(0);
        p=dummy;
        while (h1 !=null && h2 != null) {
            if(h1.val<h2.val){
                p.next=h1;
                h1=h1.next;
            }else{
                p.next=h2;
                h2=h2.next;
            }
            p=p.next;
        }
        p.next=(h1==null) ? h2 : h1;

        return dummy.next;
    }
    public static Node merge(Node arr[], int k){
        for(int i=1; i<k; i++){
            arr[0]=mergeLinkedList(arr[0],arr[i]);
        }
        return arr[0];
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(){{
            add(new ArrayList<>(Arrays.asList(1,2,3,5,7)));
            add(new ArrayList<>(Arrays.asList(0,2,4)));
            add(new ArrayList<>(Arrays.asList(1,3,4,5,7)));
        }};
        System.out.println(list);
        int k=3;
        Node arr[]= new Node[k];
        // // First LinkedList 1->3->56
        // arr[0]=new Node(1);
        // arr[0].next=new Node(3);
        // arr[0].next.next=new Node(5);

        // //Second LinkedList 0->2->4
        // arr[1]=new Node(0);
        // arr[1].next=new Node(2);
        // arr[1].next.next=new Node(4);

        // //Third LinkedList 1->3->7
        // arr[2]=new Node(1);
        // arr[2].next=new Node(3);
        // arr[2].next.next=new Node(7);


        //OR


        for(int i=0; i<list.size(); i++){
            Node head=null, tail=null;
            for(int ele:list.get(i)){
                Node newNode=new Node(ele);;
                if(head==null){
                    head=newNode;
                    tail=newNode;
                }else{
                    tail.next=newNode;
                    tail=tail.next;
                }
            }
            arr[i]=head;
        }

        Node ans=merge(arr, k);
        print(ans);
    }
}