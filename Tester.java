public class Tester {
    public static void main(String[] args) {
        NoNullArrayList<Integer> nlist = new NoNullArrayList<Integer>();
        nlist = new NoNullArrayList<Integer>(2);
        Integer[] list = new Integer[]{1, 5, null, 3};
        for(Integer i : list) {
            try{
                nlist.add(i);
                System.out.println("Adding " + i);
            } catch(IllegalArgumentException e) {
                System.out.println("Null skipped");
            }
        }
        for(Integer i : nlist) {
            System.out.print(i + " ");
        }
        System.out.println();

        OrderedArrayList<Integer> olist = new OrderedArrayList<Integer>();
        olist.add(50);
        olist.add(90);
        olist.add(120);
        olist.add(5434, 127);
        try {
            olist.set(2, null);
        } catch(IllegalArgumentException e) {
            System.out.println("Skipped null");
            e.printStackTrace();
        }

        olist.set(2, 12);

        try {
            olist.add(3, null);
        } catch(IllegalArgumentException e) {
            System.out.println("Skipped null");
            e.printStackTrace();
        }

        olist.add(3, 91);
        olist.add(2, 12);
        olist.add(90);
        olist.add(8, 120);
        for(Integer i : olist) {
            System.out.print(i + " ");
        }

        
    }
}
