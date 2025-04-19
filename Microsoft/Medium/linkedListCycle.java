class Node {
    int val;
    Node next;

    Node(int v) {
        val = v;
    }
}

public class linkedListCycle {
    public static boolean checkCycle(Node head){
        Node fast=head, slow=head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow) return true;
        }

        return false;
    }
    public static void main(String[] args) {
        int arr[] = { 3, 2, 0, 4 };
        int pos = 1; // cycle starts at node with value 2 (0-based index)
        Node head = new Node(arr[0]);
        Node temp = head;
        Node createCycle = null; // Initialize to null
        for (int i =1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
            // Save the node at 'pos' to create the cycle later
            if (i == pos) {
                createCycle = temp;
            }
        }
        // Create the cycle
        temp.next = createCycle;

        System.out.println(checkCycle(head));
    }

}
