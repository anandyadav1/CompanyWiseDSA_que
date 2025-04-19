
class Node {
    int val;
    Node next;
    Node(int x) {
        val = x;
        next = null;
    }
}

public class deleteNodes {
    public static void deleteNode(Node node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null)
                System.out.print(" -> ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create the linked list: 4 -> 5 -> 1 -> 9
        Node head = new Node(4);
        head.next = new Node(5);
        head.next.next = new Node(1);
        head.next.next.next = new Node(9);

        // Let's delete node with value 5 (second node)
        Node nodeToDelete = head.next;
        System.out.println("Original list:");
        printList(head);

        deleteNode(nodeToDelete);

        System.out.println("List after deleting node:");
        printList(head);
    }
}
