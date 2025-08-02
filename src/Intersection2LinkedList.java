class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}
public class Intersection2LinkedList{
    public static void main(String ars[]){
        Node headA = new Node(1);
        headA.next = new Node(2);
        headA.next.next = new Node(3);
        headA.next.next.next = new Node(4);

        Node headB = new Node(5);
        headB.next = new Node(6);
        headB.next.next = headA.next; 

        Node intersectionNode = getIntersectionNode(headA, headB);
        if (intersectionNode != null) {
            System.out.println("Intersection at node with value: " + intersectionNode.value);
        } else {
            System.out.println("No intersection found.");
        }
    }
    public static Node getIntersectionNode(Node headA, Node headB) {
        if (headA == null || headB == null) {
            return null;
        }

        Node a = headA;
        Node b = headB;

        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }

        return a;
    }
}