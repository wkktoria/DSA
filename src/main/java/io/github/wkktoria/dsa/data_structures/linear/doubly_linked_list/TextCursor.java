package io.github.wkktoria.dsa.data_structures.linear.doubly_linked_list;

public class TextCursor<T> extends DoublyLinkedList<T> {
    private Node<T> cursor;

    public TextCursor() {
        super();
        this.cursor = this.head;
    }

    public void moveCursorForward() {
        if (cursor != null && cursor.next != null) {
            cursor = cursor.next;
        }
    }

    public void moveCursorBackward() {
        if (cursor != null && cursor.prev != null) {
            cursor = cursor.prev;
        }
    }

    @Override
    void prepend(T data) {
        super.prepend(data);

        if (cursor == null) {
            cursor = head;
        }
    }

    @Override
    void append(T data) {
        super.append(data);

        if (cursor == null) {
            cursor = tail;
        }
    }

    @Override
    void print() {
        Node<T> current = head;

        while (current != null) {
            if (current == cursor) {
                System.out.print("[" + current.data + "] ");
            } else {
                System.out.print(current.data + " ");
            }

            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        TextCursor<Character> textCursor = new TextCursor<>();

        textCursor.append('h');
        textCursor.append('e');
        textCursor.append('l');
        textCursor.append('l');
        textCursor.append('o');

        textCursor.print();

        textCursor.moveCursorForward();
        textCursor.print();

        textCursor.moveCursorForward();
        textCursor.print();

        textCursor.moveCursorBackward();
        textCursor.print();

        textCursor.delete('l');
        textCursor.print();
    }
}
