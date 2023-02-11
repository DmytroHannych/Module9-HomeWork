package module9;

public class MyLinkedListTest {
    public static void main(String[] args) {
        List<String> string = new MyLinkedList<>();
        string.add("first");
        string.add("second");
        string.add("tree");
        System.out.println(string);
        System.out.println(string.size());
        System.out.println(string.get(1));
        string.remove(1);
        System.out.println(string);
        string.clear();
        System.out.println(string);
    }
}
