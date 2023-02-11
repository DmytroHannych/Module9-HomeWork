package module9;

import java.util.Arrays;

public class MyQueue<T> {
    private int сapacity = 2;
    private Object[] elements = new Object[сapacity];
    private int head = 0;
    private int end = 0;
    int counter = 0;

    public void add(T value) {
        if (counter == elements.length - 1)
            resize(elements.length * 2);
        elements[counter++] = value;
    }

    private void resize(int i) {
        Object[] newArray = new Object[i];
        System.arraycopy(elements, 0, newArray, 0, counter);
        elements = newArray;
    }

    public int size() {
        return counter;
    }

    public Object poll() {
        int size = 0;
        Object temp = elements[0];
        for (int i = 0; i < counter; i++) {
            if (i == head) {
                size++;
            }
            elements[i] = elements[size];
            size++;
        }
        counter--;
        return temp;
    }

    public Object peek() {
        Object temp = elements[head];
        return temp;
    }

    public void clear() {
        Object[] newElements = new Object[сapacity];
        counter = 0;
    }

    @Override
    public String toString() {
        if (counter == 0) {
            return "{}";
        }
        Object[] secondarray = new Object[counter];
        for (int i = 0; i < counter; i++) {
            if (elements[i] != null) {
                secondarray[i] = elements[i];
            }
        }
        return "MyQueue{" +
                "elements=" + Arrays.toString(secondarray) +
                '}';
    }
}



