package module9;

public class MyHashMapTest {
    public static void main(String[] args) {
        MyHashMap<Integer,String> myHashMap = new MyHashMap<>();
        myHashMap.put(1,"Tomat");
        myHashMap.put(2,"Bread");
        myHashMap.put(3,"Cheeze");
        myHashMap.put(4,"potatoes");
        myHashMap.put(5,"water");
        System.out.println(myHashMap);
        System.out.println(myHashMap.get(1));
        System.out.println("myHashMap.size() = " + myHashMap.size());
        System.out.println(myHashMap.remove(3));
        System.out.println(myHashMap);
        myHashMap.clear();
        System.out.println(myHashMap);



    }
}
