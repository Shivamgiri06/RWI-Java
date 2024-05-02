class threading1 extends Thread {
    public void run() {
        System.out.println("Thread is running!");
    }
}

class threading2 extends Thread {
    public void run() {
        System.out.println("Thread is not running!");
    }
}

public class multithreading {
    public static void main(String[] args) {
        threading1 th = new threading1();
        th.start();
        threading2 th2 = new threading2();
        th2.start();
    }
}