package module9;


import java.util.Arrays;
import java.util.Objects;

public class MyArrayList <T> implements List<T> {
    private int DEFAULT_CAPACITY =  10;

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
        Objects.checkIndex(index, counter);
        int size = 0;
        for (int i = 0; i < counter; i++) {
            if (i == index) {
                size++;
            }
            myArray[i] = myArray[size];
//            myArray[counter] = null;
               size++;

        }
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
        if(counter == 0){
            return "{}";
        }
        Object [] secondarray = new Object[counter];
        for (int i = 0; i < counter; i++) {
            if (myArray[i] != null) {
            secondarray[i] = myArray[i];
            }
        }

        return "MyArrayList{" +
                "myArray=" + Arrays.toString(secondarray) +
                '}';
    }
}



