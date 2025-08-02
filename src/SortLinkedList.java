public class SortLinkedList{
    public static void main(String ars[]){
        Node headA = new Node(1);
        headA.next = new Node(2);
        headA.next.next = new Node(3);
        headA.next.next.next = new Node(4);
        headA.next.next.next.next = new Node(5);

        Node headB = new Node(6);
        headB.next = new Node(7);
        headB.next.next = new Node(8);
        headB.next.next.next = new Node(9);
        headB.next.next.next.next = new Node(10);

        System.out.println("Before sorting:");
        printList(headA);
        printList(headB);

        headA = sortLinkedList(headA);
        headB = sortLinkedList(headB);

        System.out.println("After sorting:");
        printList(headA);
        printList(headB);
    }
    public static Node sortLinkedList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node mid = getMiddle(head);
        Node nextToMid = mid.next;

        mid.next = null;

        Node left = sortLinkedList(head);
        Node right = sortLinkedList(nextToMid);

        return merge(left, right);
    }
    public static Node getMiddle(Node head) {
        if (head == null) {
            return head;
        }

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    public static Node merge(Node left, Node right) {
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }

        if (left.value < right.value) {
            left.next = merge(left.next, right);
            return left;
        } else {
            right.next = merge(left, right.next);
            return right;
        }
    }
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}