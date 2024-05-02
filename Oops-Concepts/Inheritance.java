//Inheritance

class Shape {
    public void area() {
        System.out.println("Display Area of Shape: ");
    }
}

//Single Level Inheritance
class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println("Area of Triangle: ");
    }
}

//Multi Level Inheritance
class EquilateralTriangle extends Triangle {
    public void area(int l, int h) {
        int area = (1/2*l*h);
        System.out.println(area);
    }
}

//Hierarchical Inheritance
class Circle extends Shape {
    public void area(int r) {
        double area = 3.14*r*r;
        System.out.println(area);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Circle a1 = new Circle();
        a1.area();
        a1.area(4);
    }
}