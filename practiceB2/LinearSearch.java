package practiceB2;
import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		int N, K=50, flag=0;
		System.out.println("Enter the value of N: ");
		Scanner input = new Scanner(System.in);
		N = input.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++)
		{
			arr[i] = input.nextInt();
		}
		for(int i=0; i<N; i++)
		{
			if(K == arr[i])
			{
				System.out.println("Value found at position: "+i);
				flag = 1;
				break;
			}
		}
		if(flag == 0)
		{
			System.out.println("Value not found!");
		}
	}
}
