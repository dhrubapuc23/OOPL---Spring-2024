package practiceB2;
import java.util.Scanner;
public class PrimeNumber {
	
	 boolean isPrime(int num)
	{
		int flag = 0;
		for(int i=2;i<num;i++)
		{
			if(num % i == 0)
			{
				flag = 1;
				break;
			}
		}
		if(flag == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PrimeNumber k = new PrimeNumber();
		int a = input.nextInt();
		boolean result = k.isPrime(a);
		if(result)
		{
			System.out.println(a+" is a prime number");
		}
		else
		{
			System.out.println(a+" is not a prime number");
		}
	}

}








