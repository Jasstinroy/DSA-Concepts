class LinkedList {
    // Node class representing each element in the linked list
    static class Node {
        int data;
        Node next;

        // Constructor to create a new node
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the list
    Node head;

    // Method to add a node at the end of the list
    public void addAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;  // If the list is empty, set head to the new node
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;  // Traverse to the last node
            }
            temp.next = newNode;  // Link the new node to the last node
        }
    }

    // Method to add a node at the beginning of the list
    public void addAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;  // Point new node to the current head
        head = newNode;       // Set new node as the new head
    }

    // Method to add a node at a given position
    public void addAtPosition(int data, int position) {
        if (position < 1) {
            System.out.println("Position should be greater than 0.");
            return;
        }

        Node newNode = new Node(data);

        // If adding at the beginning (position 1)
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        // Traverse to the node just before the desired position
        for (int i = 1; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        // If the position is greater than the number of nodes
        if (temp == null) {
            System.out.println("Position exceeds the length of the list.");
            return;
        }

        newNode.next = temp.next;  // Link the new node to the next node
        temp.next = newNode;       // Link the previous node to the new node
    }

    // Method to display the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Method to delete the first node containing the specified value
    public void delete(int value) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // If the head node contains the value
        if (head.data == value) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;  // Traverse to find the node to delete
        }

        // If the node is found, delete it
        if (temp.next != null) {
            temp.next = temp.next.next;
        } else {
            System.out.println("Value not found in the list.");
        }
    }

    // Method to search for a value in the list
    public boolean search(int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == value) {
                return true;
            }
            temp = temp.next;
        }
        return false;  // Return false if the value is not found
    }
    //Method to reverse a linkedlist
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        
        while (current != null) {
            next = current.next;  // Save next node
            current.next = prev;  // Reverse the link
            prev = current;       // Move prev and current one step forward
            current = next;
        }
        head = prev;  // Update head to the new first node
    }
    //Method to find the length of a linked list.
    public int length() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Add elements to the linked list
        list.addAtEnd(10);
        list.addAtEnd(20);
        list.addAtEnd(30);
        list.addAtEnd(40);

        System.out.println("Linked List after adding elements at the end:");
        list.display();

        // Add an element at the beginning
        list.addAtBeginning(5);
        System.out.println("Linked List after adding element at the beginning:");
        list.display();

        // Add an element at a specific position
        list.addAtPosition(25, 3);
        System.out.println("Linked List after adding element at position 3:");
        list.display();

        // Delete a node
        System.out.println("Deleting node with value 20:");
        list.delete(20);
        list.display();

        // Search for a value
        System.out.println("Searching for value 30: " + (list.search(30) ? "Found" : "Not Found"));
    }
}
