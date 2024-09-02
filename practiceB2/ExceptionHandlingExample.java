package practiceB2;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		int arr[] = {1};
		int d = 0;
		try {
			int r = a/d;
			arr[50] = 99;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by zero exception");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println("finally block");
		}
		

	}

}
