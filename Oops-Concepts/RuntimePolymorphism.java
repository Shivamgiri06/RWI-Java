// Java Program for Method Overriding

class Parent {
	void Print()
	{
		System.out.println("Parent Class");
	}
}

class subclass1 extends Parent {
	void Print() { System.out.println("subclass1"); }
}

class subclass2 extends Parent {
	void Print()
	{
		System.out.println("subclass2");
	}
}

class RuntimePolymorphism {
	public static void main(String[] args)
	{
		Parent a;

		a = new subclass1();
		a.Print();

		a = new subclass2();
		a.Print();
	}
}
