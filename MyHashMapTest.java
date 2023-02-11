package module9;

public class MyHashMapTest {
    public static void main(String[] args) {
        MyHashMap<Integer, String> myHashMap = new MyHashMap<>();
        for (int i = 0; i < 100; i++) {
            myHashMap.put(i, "" + i);
        }
        System.out.println(myHashMap);
        System.out.println("myHashMap.size() = " + myHashMap.size());
        System.out.println("myHashMap.get(1) = " + myHashMap.get(1));
        System.out.println("myHashMap.remove(1) = " + myHashMap.remove(1));
        System.out.println("myHashMap.size() = " + myHashMap.size());
        myHashMap.clear();
        System.out.println("myHashMap = " + myHashMap);
    }
}

