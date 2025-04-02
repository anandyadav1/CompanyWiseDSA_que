
class Node{
    int v;
    Node next;
    Node(int v){
        this.v=v;
    }
}

public class partitionList {
    public static Node partition(Node head, int x){
        if(head==null) return null;
        Node head1=new Node(-1);
        Node head2=new Node(-1);
        Node t1=head1;
        Node t2=head2;
        Node temp=head;
        while(temp!=null){
            if(x<=temp.v){
                t2.next=temp;
                t2=t2.next;
            }else{
                t1.next=temp;
                t1=t1.next;
            }
            temp=temp.next;
        }

        t2.next=null;
        t1.next=head2.next;

        return head1.next;
    }
    public static void main(String[] args) {
        int a[]={1,4,3,2,5,2};
        int x=3;

        //Output  1->2->2->4->3->5
        Node head=new Node(a[0]);
        Node temp=head;
        for(int i=1; i<a.length; i++){
            temp.next=new Node(a[i]);
            temp=temp.next;
        }

        Node finalHEAD=partition(head,x);
        Node heaNodes=finalHEAD;
        while(heaNodes!=null){
            System.out.print(heaNodes.v);
            if(heaNodes.next!=null){
                System.out.print("->");
            }
            heaNodes=heaNodes.next;
        }
    }
}

