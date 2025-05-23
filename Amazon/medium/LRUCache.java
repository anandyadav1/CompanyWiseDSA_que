import java.util.HashMap;

class Node{
    Node prev,next;
    int key,value;
    Node(int _key, int _value){
        key=_key;
        value=_value;
    }
}
public class LRUCache {

    Node head=new Node(0, 0), tail=new Node(0,0);
    HashMap<Integer,Node> map = new HashMap<>();
    int capacity;

    public LRUCache(int _capacity){
        capacity=_capacity;
        head.next=tail;
        tail.prev=head;
    }

    public int get(int key){
        if(map.containsKey(key)){
            Node node = map.get(key);
            remove(node);
            insert(node);
            return node.value;
        }
        else{
            return -1;
        }
    }

    public void put(int key, int value){
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        if(map.size()==capacity){
            remove(tail.prev);
        }
        insert(new Node(key, value));
    }
    void remove(Node node){
        map.remove(node.key);
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }

    void insert(Node node){
        map.put(node.key,node);
        Node headNext=head.next;
        head.next=node;
        node.prev=head;
        headNext.prev=node;
        node.next=headNext;
    }
    public static void main(String[] args) {
        LRUCache obj = new LRUCache(2);
        obj.put(1,1);
        obj.put(2,2);
        System.out.println(obj.get(1));
        obj.put(3,3);
        System.out.println(obj.get(2));
        obj.put(4,4);
        System.out.println(obj.get(1));
        System.out.println(obj.get(3));
        System.out.println(obj.get(4));
    }
}
