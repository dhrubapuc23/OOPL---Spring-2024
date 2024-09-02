package practiceB2;

public class OuterClass {
	void test()
	{
		System.out.println("This is from outer class");
	}
	
	void test3()
	{
		innerclass cls2 = new innerclass();
		cls2.test2();
	}
	
	class innerclass{
		void test2()
		{
			System.out.println("This is from inner class");
		}
	}

	public static void main(String[] args) {
		OuterClass cls1 = new OuterClass();
		cls1.test();
		cls1.test3();
	}
}
