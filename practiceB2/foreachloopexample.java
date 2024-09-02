package practiceB2;

public class foreachloopexample {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50,60};
		int sum = 0;
		/*for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}*/
		for(int i : arr)
		{
			sum = sum + i;
		}
		
		System.out.println("The sum is: "+sum);
	}

}
