import java.util.*;

class Node{
    int val;
    Node left;
    Node right;
    Node(int v){
        val=v;
    }
}
public class treeInvert {
    public static void invertTree(Node root){
        if(root==null) return;
        Node temp;
        temp=root.left;
        root.left=root.right;
        root.right=temp;

        invertTree(root.left);
        invertTree(root.right);
    }
    public static Node createTree(int node[]){
        if(node.length==0 || node[0]==-1) return null;
        Queue<Node> q = new LinkedList<>();
        Node root=new Node(node[0]);
        q.add(root);
        int i=1;
        while (!q.isEmpty()) {
            Node curr=q.poll();
            if(i<node.length && node[i]!=-1){
                Node newNode=new Node(node[i]);
                curr.left=newNode;
                q.add(newNode);
            }
            i++;
            if(i<node.length && node[i]!=-1){
                Node newNode=new Node(node[i]);
                curr.right=newNode;
                q.add(newNode);
            }
            i++;
        }

        return root;

    }
    public static void pre(Node root){
        if(root!=null){
            System.out.print(root.val+" ");
            pre(root.left);
            pre(root.right);
        }
    }
    public static void main(String[] args) {
        int node[]={1,2,3,4,5,6,7};
        /*          1                                     1
                  /   \           convert               /   \
                 2      3       ---------->            3      2
                / \    /  \                          / \    /  \
               4   5  6    7                        7   6   5   4       */

        Node root=createTree(node);
        System.out.println("Before Invert, Tree");
        pre(root);
        invertTree(root);
        System.out.println();
        System.out.println();
        System.out.println("After Invert, Tree");
        pre(root);
    }
}
