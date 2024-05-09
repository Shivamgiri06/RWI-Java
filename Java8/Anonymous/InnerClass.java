/*
1) Class inside a class is known as inner class
2) We cannot create a object of inner class directly by saying "InnerClass obj = new InnerClass();", this will give error
3) If we declared inner class as 'static' then we create its object,
4)  otherwise we have to refer object for creating inner class object.
5) We never declared outer class as 'static class'*/

class firstClass
{
    int age;

    public void show()
    {
        System.out.println("Age must be greater than or equal to 18 for voting");
    }

    class secondClass
    {
        public void insecondClass()
        {
            System.out.println("Inside the Second Class");
        }
    }

}

public class InnerClass {

    public static void main(String[] args) {
        
        firstClass a = new firstClass();
        a.show();

        //B b = new B(); // here we got an error called "B cannot be resolved to a type".

        // if not declared our inner class as static then this is the method for creating the object of inner class
        firstClass.secondClass b = a.new secondClass(); 
        b.insecondClass();

        // if we declared our inner class as static then this is the way to create object of inner class
        // B b = new B();
        // b.inB();

    }
    
}