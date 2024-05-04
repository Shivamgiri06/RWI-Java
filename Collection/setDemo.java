import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class setDemo {
    public static void main(String[] args) {
        //List1
        Set<Integer> a = new HashSet<Integer>();
        a.addAll(Arrays.asList(new Integer[] {1, 4, 5, 7, 10, 11, 0}));

        //List2
        Set<Integer> b = new HashSet<Integer>();
        b.addAll(Arrays.asList(new Integer[] {2, 4, 6, 8, 10, 12, 0}));

        //Union of the two sets
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.println("Union of the two sets: "+union);

        //Intersection of the two sets
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.println("Intersection od the two sets: "+intersection);

        
    }
}
