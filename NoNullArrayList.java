import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T> {

    public NoNullArrayList() {}
    public NoNullArrayList(int initialCapacity) {
        super(initialCapacity);
    }

    public T set(int index, T element) {
        if(element == null) throw new IllegalArgumentException("Null is an illegal element");
        return super.set(index, element);
    }

    public boolean add(T element) {
        if(element == null) throw new IllegalArgumentException("Null is an illegal element");
        return super.add(element);
    }

    public void add(int index, T element) {
        if(element == null) throw new IllegalArgumentException("Null is an illegal aelement");
        super.add(index, element);
    }
}