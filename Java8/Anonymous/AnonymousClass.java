interface NewInterface
{
    void show();
}

public class AnonymousClass {
    
    public static void main(String[] args) {
        
        NewInterface obj1 = new NewInterface() {
            
            public void show()
            {
                System.out.println("Inside the anonymous class 1");
            }
        };

        obj1.show();

        NewInterface obj2 = new NewInterface() {
            
            public void show()
            {
                System.out.println("Inside the anonymous class 2");
            }
        };

        obj2.show();
    }
}