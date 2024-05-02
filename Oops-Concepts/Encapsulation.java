//Encapsulation

class Student {
    String name;
    int age;

    String getname() {
        return this.name;
    }

    int getage() {
        return this.age;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setage(int age) {
        this.age = age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Shivam";
        s1.age = 22;

        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}
