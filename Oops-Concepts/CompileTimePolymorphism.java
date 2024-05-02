// Java Program for Method overloading
// By using Different Types of Arguments

class Helper {
	static int Multiply(int a, int b)
	{
		return a * b;
	}

	static double Multiply(double a, double b)
	{
		return a * b;
	}
}

class CompileTimePolymorphism {
	public static void main(String[] args)
	{
		System.out.println(Helper.Multiply(2, 4));
		System.out.println(Helper.Multiply(5.5, 6.3));
	}
}
