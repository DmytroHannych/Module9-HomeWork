package module9;

public class MyHashMap<K, V> {
    private   class Node<K, V> {
            K key;
            V value;
            Node<K, V> next;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
                next = null;
            }

            public K getKey() {
                return key;
            }

            public V getValue() {
                return value;
            }
        }
        private int size = 10;
        private int count = size*2;
        private   Node<K, V>[] table = new Node[size];;
         private int index;
         private int length = 0;



        public boolean equals(Object o) {
            Node<K, V> node = table[size];
            if (this == o) {
                return true;
            } else {
                if (o == null) {
                    return false;
                }
                MyHashMap<K, V> myHashMap = (MyHashMap<K, V>) o;
                return node.getKey() == myHashMap && node.getValue() == myHashMap;
            }
        }


        public int hashCode() {
            return this.hashCode();
        }

        public int size(){
            return length;
        }

        public Object remove(K key) {
            Node<K, V> firstRemove = null;
            index = key.hashCode() % size - 1;
            Node<K, V> secondRemove = table[index];
            if (secondRemove.getKey().equals(key)) {
                firstRemove = table[index];
                table[index] = null;
            }
            return firstRemove.getKey() + " = " + firstRemove.getValue();
        }
        public void put(K key, V value) {
            index = key.hashCode() % size - 1;

            if (table == null) {
                table = new Node[size];
                if (index == -1) {
                    index = key.hashCode() % size;
                }
            }
            if (length <= size && index >= 0) {
                Node<K, V> lineFirst = new Node<>(key, value);
                Node<K, V> lineSecond = table[index];

                if (table[index] == null) {
                    table[index] = lineFirst;
                    length++;
                } else while (lineSecond!= null){
                    if(lineSecond.getKey().equals(key)){
                        lineSecond.next = lineFirst;
                        table[index] = lineSecond.next;
                        break;
                    } else {
                        lineSecond.next = lineFirst;
                        break;
                    }
                }
            } else {
                Node<K,V>[] newCapacity = new Node[count];
                for (int i = 0; i < size/2; i++) {
                    if(table[i] == null){
                        table = newCapacity;
                        put(key,value);
                    } else{
                        newCapacity[i] = table[i];
                    }
                    table = newCapacity;
                    put(key, value);
                }
            }
        }
    public V get(K key) {
        V value = null;
        index = key.hashCode() % size - 1;
        Node<K, V> secondTable = table[index];
        while (secondTable != null) {
            if (secondTable.getKey().equals(key)) {
                value = secondTable.getValue();
                secondTable = secondTable.next;
            }
        }
        return value;
    }

    public Node<K, V>[] clear() {
        length = 0;
        return table = null;
    }

        @Override
        public String toString() {
            StringBuilder write = new StringBuilder();
            if (table == null) {
                write.append("{").append("}");
                return write.toString();
            }
            for (int i = 0; i < size; i++) {
                Node<K, V> secondTable = table[i];
                if (secondTable != null) {
                    write.append(secondTable.getKey()).append(" = ").append(secondTable.getValue()).append(", ");
                }
            }
            write.deleteCharAt(write.lastIndexOf(", "));
            String show = write.toString();
            return show.strip() ;
        }
    }



