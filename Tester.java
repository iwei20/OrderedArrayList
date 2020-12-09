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
    }
}
