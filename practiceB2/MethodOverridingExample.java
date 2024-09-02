package practiceB2;

class C{
	int i,j;
	C(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
	void show()
	{
		System.out.println("Value of i and j: "+i+" "+j);
	}
}

class D extends C{
	int k;
	D(int i, int j, int k)
	{
		super(i,j);
		this.k = k;
	}
	void show()
	{
		System.out.println("Value of k: "+k);
	}
}

public class MethodOverridingExample {

	public static void main(String[] args) {
		D obj = new D(10,20,30);
		obj.show();

	}

}
