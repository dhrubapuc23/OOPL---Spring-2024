package practiceB2;

public class ExceptionHandlingExample2 {
	
	public static void checkOdd(int n)
	{
		if(n % 2 == 1)
			throw new IllegalArgumentException(n+ " is odd");
	}

	public static void main(String[] args) {
		
		try {
			checkOdd(10);
			System.out.println("Number is even");
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e);
		}

	}

}
