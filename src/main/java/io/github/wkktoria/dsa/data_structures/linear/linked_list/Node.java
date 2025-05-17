package io.github.wkktoria.dsa.data_structures.linear.linked_list;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}
