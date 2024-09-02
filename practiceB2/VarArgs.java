package practiceB2;

public class VarArgs {
	
	static void test(int ... v)
	{
		System.out.print("Number of arguments: "+v.length+" Content: ");
		
		for(int x: v)
		{
			System.out.print(x+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		test(10);
		test(10,20);
		test(10,20,30);
		test();

	}

}
