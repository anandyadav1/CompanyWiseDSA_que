class Node{
    int val;
    Node next;
    Node(int v){
        val=v;
    }
}
public class reversedLinkedList {
    public static Node reverseFunctions(Node head){
        Node prev=null,curr=head, next;
        while (curr != null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        return prev;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7,8,9};
        Node head =new Node(nums[0]);
        Node temp=head;
        for(int i=1; i<nums.length; i++){
            temp.next=new Node(nums[i]);
            temp=temp.next;
        }
        temp.next=null;

        Node tempNode=head;
        System.out.println("Before LinkedList ");
        while (tempNode!=null) {
            System.out.print(tempNode.val);
            if(tempNode.next!=null){
                System.out.print("->");
            }
            tempNode=tempNode.next;
        }
        Node revNode=reverseFunctions(head);
        System.out.println("\nAfter Revrsed LinkedList ");
        while (revNode!=null) {
            System.out.print(revNode.val);
            if(revNode.next!=null){
                System.out.print("->");
            }
            revNode=revNode.next;
        }
    }
}