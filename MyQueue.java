package module9;

import java.util.Arrays;

public class MyQueue<T> {
    private int сapacity = 10;
    private Object[] elements = new Object[сapacity];
    private int head = 0;
    private int end = 0;
    int counter = 0;
    public void add(Object value){
       if(сapacity == counter){
           System.out.printf("Queue is full");
       } else { elements[end] = (String) value;
           end++;
       }
       counter++;
    }

    public int size(){
       return counter;
    }

    public Object poll(){
        int size = 0;
        Object temp = elements[0];
//        if (head ==сapacity) {
//            head = 0;
//        }
        for (int i = 0; i < counter; i++) {
            if(i == head){
              size++;
            }
            elements[i] = elements[size];
            size++;
        }
        counter--;
        return temp;
   }

   public Object peek(){
        Object temp = elements[head];
       return temp;
   }

   public void clear(){
       for (int i = 0; i <= counter; i++)
           elements[i] = null;
       counter = 0;

   }
   @Override
    public String toString() {
        if(counter == 0){
            return "{}";
        }
        return "MyQueue{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }
}



