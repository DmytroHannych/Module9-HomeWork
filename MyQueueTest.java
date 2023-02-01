package module9;

public class MyQueueTest {

    public static void main(String[] args) {
        MyQueue<String> string = new MyQueue<>();
        string.add("first");
        string.add("second");
        string.add("tree");
        string.add("tree");
        string.add("tree");
        System.out.println(string);
        System.out.println(string.size());
        System.out.println(string.peek());
        System.out.println(string.poll());
        System.out.println(string);
        string.clear();
        System.out.println(string);
    }
}
