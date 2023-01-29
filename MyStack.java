package module9;
import java.util.Arrays;
import java.util.Objects;

public class MyStack<T> {
    private int maxSize = 0;
    private Object[] array = new Object[maxSize];
    private int size = 0;

    public void push(Object value)
    {
        Object[] tempArray = array;

        if (size == maxSize)
        {

            array = new Object[++maxSize];
        }

        for (int i = 0; i < array.length; i++)
        {
            array[i] = i==0 ? value : tempArray[i-1];
        }
        size++;
    }

    public void remove(int index)
    {
        Object[] tempArray = array;
        array = new Object[--maxSize];

        for (int i = 0; i < array.length; i++)
        {
            array[i] = i < index ? tempArray[i] : tempArray[i + 1];
        }

    }
    public void clear()
    {
        maxSize = 0;
        array = new Object[maxSize];
    }
    public int size()
    {
        size = 0;
        for (Object item: array) {
            size++;
        }
        return size;
    }

    public T Peek()
    {
            return (T) array[0];
    }

    public T Pop()
    {
        var temp = array[0];
        remove(0);
        return (T)temp;
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}

