package practiceB2;

class Test{
	int a,b;
	Test(int i, int j)
	{
		a = i;
		b = j;
	}
	boolean equalTo(Test K)
	{
		if(K.a == a && K.b == b)
			return true;
		else
			return false;
	}
}

public class PassingObjectsAsArguments {

	public static void main(String[] args) {
		Test obj1 = new Test(10,20);
		Test obj2 = new Test(10,20);
		Test obj3 = new Test(100,200);
		boolean result1 = obj1.equalTo(obj3);
		if(result1)
			System.out.println("The values are same!");
		else
			System.out.println("Different values!");

	}

}
