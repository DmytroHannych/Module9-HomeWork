package module9;


import java.util.Arrays;
import java.util.Objects;

public class MyArrayList <T> implements List<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private final int CUT_RATE = 4;
    private Object[] myArray = new Object[DEFAULT_CAPACITY];
    private int counter = 0;
    @Override
    public void add(T value) {
        if(counter == myArray.length-1)
            resize(myArray.length*2);
            myArray[counter++] = value;

    }

    private void resize(int i) {
        Object[] newArray = new Object[i];
        System.arraycopy(myArray, 0, newArray, 0, counter);
        myArray = newArray;
    }

    @Override
    public boolean remove(int index) {
        for (int i = index; i< counter; i++)
            myArray[i] = myArray[i+1];
        myArray[counter] = null;
        counter--;
        return true;
    }

    @Override
    public void clear() {
        for (int i = 0; i < counter; i++)
            myArray[i] = null;
        counter = 0;
    }

    @Override
    public int size() {
        return counter;
    }

    @Override
    public T get(int index) {
        Objects.checkIndex(index, counter);
        return (T) myArray[index];
    }


    @Override
    public String toString() {
        return "MyArrayList{" +
                "myArray=" + Arrays.toString(myArray) +
                '}';
    }
}



