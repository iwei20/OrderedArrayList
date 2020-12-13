public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
    public OrderedArrayList() {}
    public OrderedArrayList(int initialCapacity) {
        super(initialCapacity);
    }

    public boolean add(T element) {
        try{
            super.add(element);
            super.remove(size() - 1);   
        } catch(IllegalArgumentException e) {
            throw e;
        }

        int l = 0, r = super.size();
        while(l < r) {
            int m = l + (r-l)/2;
            if(super.get(m).compareTo(element) > 0 ) {
                r = m;
            } else {
                l = m + 1;
            }
        }

        super.add(r, element);
        return true;
    }

    public void add(int index, T element) {
        add(element);
    }

    public T set(int index, T element) {
        T result = super.remove(index);
        try{
            add(element);
        } catch(IllegalArgumentException e) {
            super.add(index, result);
            throw e;
        }
        return result;
    }
}
