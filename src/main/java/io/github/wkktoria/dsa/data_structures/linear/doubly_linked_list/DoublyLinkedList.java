package io.github.wkktoria.dsa.data_structures.linear.doubly_linked_list;

public class DoublyLinkedList<T> {
    Node<T> head;
    Node<T> tail;

    DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Time Complexity: O(1)
    void prepend(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    // Time Complexity: O(n)
    void append(T data) {
        Node<T> newNode = new Node<>(data);

        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Time Complexity: O(n)
    void delete(T key) {
        Node<T> current = head;

        while (current != null) {
            if (current.data == key) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }

                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
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
}