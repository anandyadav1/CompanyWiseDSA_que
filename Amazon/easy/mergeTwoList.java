package easy;

// package Amazon;

class Node {
    int v;
    Node next;

    Node(int v) {
        this.v = v;
    }
}

public class mergeTwoList {
    public static Node merge1(Node head1, Node head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }

        Node ans = head1;
        while (head1 != null && head2 != null) {
            Node curr = head1;
            while (head1 != null && head1.v <= head2.v) {
                curr = head1;
                head1 = head1.next;
            }
            curr.next = head2;

            Node temp = head1;
            head1 = head2;
            head2 = temp;
        }
        return ans;
    }

    // or

    public static Node merge2(Node head1, Node head2) {
        if (head1 == null)
            return head2;
        if (head2 == null)
            return head1;

        Node dummy = new Node(-1);
        Node current = dummy;

        while (head1 != null && head2 != null) {
            if (head1.v < head2.v) {
                current.next = head1;
                head1 = head1.next;
            } else {
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }
        if (head1 != null) {
            current.next = head1;
        } else {
            current.next = head2;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 4, 5, 9, 10, 12, 14};
        int b[] = { 1, 3, 4, 5, 6, 7, 8, 16, 18, 20, 22, 25, 27, 29};
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
        // Node head=merge1(head1,head2);
        Node head = merge2(head1, head2);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.v);
            if (temp.next != null)
                System.out.print("->");
            temp = temp.next;
        }
    }
}
