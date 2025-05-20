package io.github.wkktoria.dsa.data_structures.linear.doubly_linked_list;

class Node<T> {
    T data;
    Node<T> prev;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
