import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

class A{
    int sid;
    String Name;
    String rollNo;
    String address;
    public A(int sid, String name, String rollNo, String address) {
        this.sid = sid;
        this.Name = name;
        this.rollNo = rollNo;
        this.address = address;
    }

}

public class StreamAPI {
    public static void main(String[] args) {
        List<A> studentList = new ArrayList<A>();
        studentList.add(new A(1, "Shivam", "RWI445", "Gurgaon"));
        studentList.add(new A(2, "Ankur", "RWI545", "Raipur"));
        studentList.add(new A(3, "Ankit", "RWI245", "Gkp"));
        studentList.add(new A(4, "Sakshi", "RWI345", "Raipur"));
        studentList.add(new A(5, "Raj", "RWI124", "Indore"));

        List<Integer> statelist = studentList.stream()
                .filter(p -> p.sid > 3)//Filering
                .map(m -> m.sid).//fetching
                        collect(Collectors.toList());
        System.out.println(statelist);
    }
}