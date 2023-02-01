package module9;

public class MyHashMapTest {
    public static void main(String[] args) {
        MyHashMap<Integer,String> myHashMap = new MyHashMap<>();
//        myHashMap.put(1,"Tomat");
//        myHashMap.put(2,"Bread");
//        myHashMap.put(3,"Cheeze");
//        myHashMap.put(4,"potatoes");
//        myHashMap.put(5,"water");
//        myHashMap.put(6,"Cheeze");
//        myHashMap.put(7,"potatoes");
//        myHashMap.put(8,"water");
//        myHashMap.put(9,"Cheeze");
//        myHashMap.put(10,"potatoes");
//        myHashMap.put(11,"water");
//        System.out.println(myHashMap);
//        System.out.println(myHashMap.get(1));
//        System.out.println("myHashMap.size() = " + myHashMap.size());
//        System.out.println(myHashMap.remove(3));
//        System.out.println(myHashMap);
//        myHashMap.clear();
//        System.out.println(myHashMap);
//        myHashMap.clear();
        for (int i = 0; i < 100; i++) {
            myHashMap.put(i, "" + i);
        }
        System.out.println(myHashMap);


//        System.out.println("size = " + myHashMap.size());
    }
}

