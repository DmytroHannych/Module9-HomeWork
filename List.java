package module9;

import java.util.Iterator;

public interface List <T> {
    public void add(T value);
    public boolean remove(int index);
    public void clear();
    public int size();
    public  T get (int index);


}
