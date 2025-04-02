package easy;
class Node {
    int v;
    Node next;

    Node(int v) {
        this.v = v;
    }
}

public class palindromeLikedList {

    public static Node reverse(Node head){
        Node prev=null;
        while(head!=null){
            Node next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }
    public static boolean helper(Node head){
        if(head==null) return true;
        Node fast=head, slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        if(fast!=null){
            slow=slow.next;
        }
        slow=reverse(slow);
        fast=head;
        while(slow!=null && fast!=null){
            if(slow.v!=fast.v) return false;
            slow=slow.next;
            fast=fast.next;
        }
        return true;

    }
    public static void main(String[] args) {
        int a[]={1, 2, 3, 2, 1};
        Node head = new Node(a[0]);
        Node temp=head;
        for(int i=1; i<a.length; i++){
            temp.next=new Node(a[i]);
            temp=temp.next;
        }
        boolean check=helper(head);
        if(check){
            System.out.println("LinkedList is the palindrome");
        }else{
            System.out.println("LinkedList is not palindrome");
        }
    }
}
