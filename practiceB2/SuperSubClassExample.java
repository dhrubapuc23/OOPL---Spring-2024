package practiceB2;

class SuperClass{
	int i,j;
	void showij()
	{
		System.out.println("i: "+i+" j: "+j);
	}
}

class SubClass extends SuperClass{
	int k;
	void showijk()
	{
		System.out.println("i: "+i);
		System.out.println("j: "+j);
		System.out.println("k: "+k);
	}
}

public class SuperSubClassExample{
	
	public static void main(String[] args) {
		SuperClass a = new SuperClass();
		a.i = 10;
		a.j = 20;
		a.showij();
		SubClass b = new SubClass();
		b.i= 40;
		b.j = 50;
		b.k = 30;
		b.showijk();

	}

}
