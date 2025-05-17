package io.github.wkktoria.dsa.data_structures.linear.linked_list;

class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    LinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Time Complexity: O(1)
    void prepend(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Time Complexity: O(1)
    void append(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // Time Complexity: when removing first element O(1), otherwise O(n)
    void remove(T data) {
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

        Node<T> current = head;

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
        Node<T> current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    // Time Complexity: O(n)
    public void reverse() {
        if (head == null) {
            return;
        }

        Node<T> previous = null;
        Node<T> current = head;

        while (current != null) {
            Node<T> next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        head = previous;
    }

    // Time Complexity: O(n)
    public Node<T> getMiddleNode() {
        if (head == null) {
            throw new RuntimeException("Linked list is empty");
        }

        Node<T> slow = head;
        Node<T> fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
