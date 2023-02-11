package module9;

public class MyHashMap<K, V> {
    private class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = null;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }

    private Node<K, V>[] table = new Node[10];
    private int index;
    private int length = 0;

    public boolean equals(Object o) {
        Node<K, V> node = table[10];
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

    public void put(K key, V value) {
        index = key.hashCode() % table.length;
        if (length != table.length) {
            Node<K, V> lineFirst = new Node<>(key, value, null);
            Node<K, V> lineSecond = table[index];
            if (table[index] == null) {
                table[index] = lineFirst;
            } else {
                while (lineSecond != null) {
                    if (lineSecond.getKey().equals(key)) {
                        lineSecond.next = lineFirst;
                        table[index] = lineSecond.next;
                        break;
                    } else {
                        lineSecond.next = lineFirst;
                        break;
                    }
                }
            }
            length++;
        } else {
            resize(table.length * 2);
            put(key, value);
        }
    }

    private void resize(int i) {
        Node<K, V>[] newTable = new Node[i];
        System.arraycopy(table, 0, newTable, 0, length);
        table = newTable;
    }

    public int size() {
        return length;
    }

    public Object remove(K key) {
        Node<K, V> firstRemove = null;
        index = key.hashCode() % table.length;
        Node<K, V> secondRemove = table[index];
        if (secondRemove.getKey().equals(key)) {
            firstRemove = table[index];
            table[index] = null;
        }
        length--;
        return firstRemove.getKey() + " = " + firstRemove.getValue();
    }

    public V get(K key) {
        V value = null;
        index = key.hashCode() % table.length;
        Node<K, V> secondTable = table[index];
        while (secondTable != null) {
            if (secondTable.getKey().equals(key)) {
                value = secondTable.getValue();
                secondTable = secondTable.next;
            }
        }
        return value;
    }

    public void clear() {
        if (length == 0) {
            table = null;
        } else {
            length = 0;
            table = null;
        }
    }

    @Override
    public String toString() {
        StringBuilder write = new StringBuilder();
        if (table == null) {
            write.append("{").append("}");
            return write.toString();
        }
        for (int i = 0; i < table.length; i++) {
            Node<K, V> secondTable = table[i];
            if (secondTable != null) {
                write.append(secondTable.getKey()).append(" = ").append(secondTable.getValue()).append(", ");
            }
        }
        write.deleteCharAt(write.lastIndexOf(", "));
        String show = write.toString();
        return show.strip();
    }
}



