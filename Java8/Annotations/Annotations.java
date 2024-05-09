class A
{
    public void showTheDataWhichBelongsToThisClass()
    {
        System.out.println("In A Show");
    }
}

class B extends A
{
    @Override // this is an annotation
    public void showTheDataWhichBelongsToThisClass()
    {
        System.out.println("In B show");
    }
}
public class Annotations {

    public static void main(String[] args) {
        
        B b = new B();
        b.showTheDataWhichBelongsToThisClass();
    }
    
}