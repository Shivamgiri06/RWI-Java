abstract class Vehicle {
    public void display() {
        System.out.println("Types Of Vechicle");
    }
}

class Bus extends Vehicle {
    public void start() {
        System.out.println("Bus is Starting....");
    }

    public void stop() {
        System.out.println("Bus is Stopping....");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Bus b1 = new Bus();
        b1.display();
        b1.start();
        b1.stop();
    }
}