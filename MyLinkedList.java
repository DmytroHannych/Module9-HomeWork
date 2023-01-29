package module9;

import java.util.Objects;

public class MyLinkedList <T> implements List<T> {


    static class Node<T> {
        T element;
        Node<T> next;
          Node<T> prev;

        public Node(T element) {
            this.element = element;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "element=" + element +
                    '}';
        }
    }
    private int size;
    transient Node<T> first;
    transient Node<T> last;


    @Override
    public void add(T value) {
        Node newNode = new Node(value);
        if (first == null) {
            newNode.next = null;
            newNode.prev = null;
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            newNode.prev = last;
            last = newNode;
        }
        size++;
    }

    @Override
    public boolean remove(int index) {

        Node current = first;

        if (index == 0) {
            size--;
            first = current.next;
            return true;
        }

        Node temp = null;
        for (int i = 1; i <= index; i++) {
            temp = current;
            current = current.next;
        }

        temp.next = current.next;
        size--;
        return false;
    }

    @Override
    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int index) {
        Node result = first;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }
        return (T) result.element;
    }

    @Override
    public String toString() {
        StringBuilder write = new StringBuilder();
        Node<T> node = first;
        if (node == null) {
            write.append(" null");
        } else while (node != null) {
            write.append(node.element).append(" ");
            node = node.next;
        }
        return write.toString();
    }

}




