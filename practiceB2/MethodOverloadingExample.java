package practiceB2;

public class MethodOverloadingExample {
	
	void test()
	{
		System.out.println("No arguments");
	}
	void test(int a)
	{
		System.out.println("a: "+a);
	}
	void test(int a, int b)
	{
		System.out.println("a: "+a+" b: "+b);
	}
	void test(double c)
	{
		System.out.println("c: "+c);
	}

	public static void main(String[] args) {
		MethodOverloadingExample obj = new MethodOverloadingExample();
		obj.test();
		obj.test(10);
		obj.test(10,20);
		obj.test(10.50);

	}

}
