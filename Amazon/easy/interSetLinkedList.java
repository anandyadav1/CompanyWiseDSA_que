package easy;
class Node{
    int v;
    Node next;
    Node(int v) {
        this.v = v;
    }
}

public class interSetLinkedList {
    public static Node interSet(Node h1, Node h2){
        if(h1==null || h2==null) return null;
        Node t1=h1;
        Node t2=h2;
        while(t1 != t2){
            t1= (t1==null) ? h2 : t1.next;
            t2= (t2==null) ? h1 : t2.next;
        }

        return t2;
    }
    public static void main(String[] args) {
        int a[] = { 1,2,3,4,8,3,89,5,33};
        int b[] = { 33,45};
        Node head1 = new Node(a[0]);
        Node head2 = new Node(b[0]);
        Node temp1 = head1;
        Node temp2 = head2;
        for (int i = 1; i < a.length; i++) {
            temp1.next = new Node(a[i]);
            temp1 = temp1.next;
        }
        for (int i = 1; i < b.length; i++) {
            temp2.next = new Node(b[i]);
            temp2 = temp2.next;
        }
        Node common=new Node(50);
        common.next=new Node(55);
        common.next.next=new Node(60);

        temp1.next=common;
        temp2.next=common;

        Node ans = interSet(head1, head2);
        if (ans != null) {
            System.out.println(ans.v);
        } else {
            System.out.println("No intersection found");
        }
    }
}
