package practiceB2;

class A{
	private int i,j;
	void showij()
	{
		System.out.println("Value of i and j: "+i+" "+j);
	}
	void setij(int x, int y)
	{
		i = x;
		j = y;
	}
	int geti()
	{
		return i;
	}
	int getj()
	{
		return j;
	}
}

class B extends A{
	int k;
	void sum()
	{
		System.out.println("Sum of i, j, and k: "+(geti()+getj()+k));
	}
}

public class SimpleInheritance {

	public static void main(String[] args) {
		B obj = new B();
		obj.setij(10, 20);
		//obj.i = 10;
		//obj.j = 20;
		obj.k = 50;
		obj.sum();
	}
}
