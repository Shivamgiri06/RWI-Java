import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class A {

    int pid;
    String Name;
    String price;
    String brand;

    public A(int pid, String name, String price, String brand) {
        this.pid = pid;
        this.Name = name;
        this.price = price;
        this.brand = brand;
    }

}

public class ProductStream {

    public static void main(String[] args) {
        List<A> productList = new ArrayList<A>();
      
        productList.add(new A(1, "Men Printed Silm Fit Tshirt", "₹1499", "xyz"));
        productList.add(new A(2, "floral print Shirt", "₹1599", "xyz"));
        productList.add(new A(3, "Round neck Sweater", "₹2299", "xyz"));
        productList.add(new A(4, "Simple White Shirt for Men", "₹1999", "xyz"));
        productList.add(new A(5, "Checked Shirt for Men", "₹2199", "xyz"));
        
        List<Integer>statelist=productList.stream()
                .filter(p->p.pid>3).map(m->m.pid)
                .collect(Collectors.toList());

		System.out.println(statelist);

    }
}