import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T> {
    public T set(int index, T element) {
        if(element == null) throw new IllegalArgumentException("Null is an illegal argument");
        return super.set(index, element);
    }
}