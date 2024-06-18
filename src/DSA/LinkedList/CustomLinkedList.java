package DSA.LinkedList;

public class CustomLinkedList {

    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.show();

    }

}

class LinkList {
    Node head;

    public void add(int data) {

        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n=n.next;
            }
            n.next = node;
        }

    }

    public void show() {
        Node node = head;
        do {
            System.out.println(node.data);
            node = node.next;
        } while (node.next != null);
        System.out.println(node.data);
    }

    private static class Node {
        int data;
        Node next;

    }
}