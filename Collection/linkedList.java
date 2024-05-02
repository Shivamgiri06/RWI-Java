//Implementation LinkedList

import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<String> L = new LinkedList<String>();

        L.add("A");
        L.add("B");
        L.addFirst("C");
        L.addLast("D");
        L.add(2, "E");

        System.out.println(L);

        L.remove("B");
        L.remove(3);
        L.removeFirst();
        L.removeLast();

        System.out.println(L);
    }
}
