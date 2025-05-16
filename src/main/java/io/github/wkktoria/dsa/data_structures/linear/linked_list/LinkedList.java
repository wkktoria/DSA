package io.github.wkktoria.dsa.data_structures.linear.linked_list;

class LinkedList {
    private Node head;
    private Node tail;

    LinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Time Complexity: O(1)
    void prepend(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Time Complexity: O(1)
    void append(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // Time Complexity: when removing first element O(1), otherwise O(n)
    void remove(String data) {
        if (head == null) {
            return;
        }

        // Removing first element of the list
        if (head.data == data) {
            head = head.next;

            if (head == null) {
                tail = null;
            }

            return;
        }

        Node current = head;

        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;

                if (current.next == null) {
                    tail = current;
                }

                return;
            }

            current = current.next;
        }
    }

    // Time Complexity: O(n)
    void print() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }
}
