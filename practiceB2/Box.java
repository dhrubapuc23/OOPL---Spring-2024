package practiceB2;

public class Box {
	double height;
	double width;
	double depth;
	
	Box(double height, double width, double depth)
	{
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	Box()
	{
		height = -1;
		width = -1;
		depth = -1;
	}
	
	public void calculateVolume()
	{
		double volume = height * width * depth;
		System.out.println(volume);
	}
	
	/*void setDim(double h, double w, double d)
	{
		height = h;
		width = w;
		depth = d;
	}*/

	public static void main(String[] args) {
		Box mybox1 = new Box(10,20,30);
		Box mybox2 = new Box(40,50,60);
		//mybox2.setDim(10, 20, 30);
		mybox2.calculateVolume();

	}

}
