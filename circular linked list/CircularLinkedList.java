class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList1 {
    private Node last;

    public CircularLinkedList1() {
        last = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (last == null) {
            newNode.next = newNode;
            last = newNode;
        } else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
    }

    public void display() {
        if (last == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = last.next;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != last.next);
        System.out.println();
    }

    public void delete(int key) {
        if (last == null) return;

        Node curr = last.next, prev = last;
        do {
            if (curr.data == key) {
                if (curr == last.next && curr == last) {
                    last = null;
                } else {
                    prev.next = curr.next;
                    if (curr == last) last = prev;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != last.next);
    }
}

public class CircularLinkedList {
    public static void main(String[] args) {
        CircularLinkedList1 list = new CircularLinkedList1();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display(); // Output: 10 20 30

        list.delete(20);
        list.display(); // Output: 10 30
    }
}
