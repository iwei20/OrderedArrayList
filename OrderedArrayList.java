public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
    public OrderedArrayList() {}
    public OrderedArrayList(int initialCapacity) {
        super(initialCapacity);
    }

    // Does not guarantee stability
    public boolean add(T element) {
        try{
            super.add(element);
            super.remove(size() - 1);   
        } catch(IllegalArgumentException e) {
            throw e;
        }

        int low = 0;
        int high = super.size() - 1;
        int index = -1;
        while(low < high && index == -1) {
            int mid = low + (high - low) / 2;
            if(element.compareTo(super.get(mid)) == 0) {
                index = mid;
            } else if(element.compareTo(super.get(mid)) == 1){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if(index == -1) index = low; 
        super.add(index, element);
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
