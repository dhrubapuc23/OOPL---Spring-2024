package practiceB2;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		int N;
		System.out.println("Enter the value of N: ");
		Scanner input = new Scanner(System.in);
		N = input.nextInt();
		int[] arr = new int[N+1];
		for(int i=0; i<N; i++)
		{
			arr[i] = input.nextInt();
		}
		
		for(int i=0; i<N; i++)
		{
			for(int j=0; j<=N-2; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
		}
		System.out.println("Sorted Arrays: ");
		for(int i=0; i<N; i++)
		{
			System.out.println(arr[i]);
		}
		

	}

}
