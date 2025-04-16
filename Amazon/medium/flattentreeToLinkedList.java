import java.util.*;
class Node{
    int v;
    Node l;
    Node r;
    Node(int v){
        this.v=v;
    }
}
public class flattentreeToLinkedList {
    public static Node constructTree(int a[]){
        if(a.length==0 || a[0]==-1){
            return null;
        }
        Queue<Node> q = new LinkedList<>();
        Node root=new Node(a[0]);
        q.add(root);
        int i=1;
        while(!q.isEmpty()){
            Node curr=q.poll();
            if(i<a.length && a[i]!=-1){
                Node nn=new Node(a[i]);
                curr.l=nn;
                q.add(nn);
            }
            i++;
            if(i<a.length && a[i]!=-1){
                Node nn=new Node(a[i]);
                curr.r=nn;
                q.add(nn);
            }
            i++;
        }
        return root;
    }

    public static void flattenLinkedList(Node root){
        while(root!=null){
            if(root.l!=null){
                Node curr=root.l;
                while(curr.r!=null){
                    curr=curr.r;
                }
                curr.r=root.r;
                root.r=root.l;
                root.l=null;
            }
            root=root.l;
        }
    }
    public static void pree(Node root){
        if(root!=null){
            System.out.print(root.v+"  ");
            pree(root.l);
            pree(root.r);
        }
    }
    public static void main(String[] args) {
        int a[]={1,2,5,3,4,6};
        Node root=constructTree(a);
        System.out.println(root.l.v);
        flattenLinkedList(root);
        System.out.println(root.l);
        System.out.println(root.r.v);
        pree(root);
    }
}
