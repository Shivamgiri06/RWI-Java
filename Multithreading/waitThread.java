class GunFight {
    private int bullets = 40;

    synchronized public void fire (int bulletsToBeFired) {
        for (int j = 0; j <= bulletsToBeFired; j++) {
            if (bullets == 0) {
                System.out.println(j+" bullets fired and "+bullets+" remains");
                System.out.println("Invoking the wait() method");

                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Continuing the fire after reloading");
            }
            bullets--;
        }
        System.out.println("The firing process is complete");
    }

    synchronized public void reload() {
        System.out.println("Reloading the magazine and resuming the thread using notify()");
        bullets += 40;
        notify();
    }
}

public class waitThread {
    public static void main(String[] args) {
        GunFight gf = new GunFight();

        new Thread() {
            public void run() {gf.fire(60);}
        }.start();

        new Thread() {
            public void run() {gf.reload();}
        }.start();
    }
}
