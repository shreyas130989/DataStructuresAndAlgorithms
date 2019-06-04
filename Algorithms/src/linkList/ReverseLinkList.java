package linkList;

public class ReverseLinkList {

    static class Node {
        int data;
        Node next;

        public Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        ReverseLinkList reverseLinkList = new ReverseLinkList();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        reverseLinkList.printList(head);
        Node reversedLinkList = reverseLinkList.reverseLinkedList(head);
        reverseLinkList.printList(reversedLinkList);
    }

    public Node reverseLinkedList(Node node) {
        if (node == null) {
            return null;
        }
        Node prev = null;
        Node current = node;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    public void printList(Node node) {
        System.out.println("LinkList values are\n");
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
}
