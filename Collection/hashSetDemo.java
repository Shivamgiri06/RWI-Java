import java.util.ArrayList;
import java.util.HashSet;

public class hashSetDemo {
    public static void main(String[] args) {
        HashSet<ArrayList> set = new HashSet<>();

        ArrayList<Integer> list1 = new ArrayList<>();

        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(2);
        list1.add(1);
        list2.add(5);
        list2.add(10);

        set.add(list1);
        set.add(list2);

        System.out.println(set.size());
    }
}
