package practiceB2;

abstract class Employee{
	double basic,hra,med,total;
	String name, designation;
	abstract void calculateSalary();
	abstract void displayInfo();
}
class Manager extends Employee{

	@Override
	void calculateSalary() {
		basic = 20000;
		hra = basic * 0.40;
		med = basic * 0.15;
		total = basic + hra + med;
		
	}

	@Override
	void displayInfo() {
		name = "Mark";
		designation = "Manager";
		System.out.println("Name: "+name);
		System.out.println("Designation: "+designation);
		System.out.println("Total salary: "+total);
	}
}

class Programmer extends Employee{

	@Override
	void calculateSalary() {
		basic = 30000;
		hra = basic * 0.40;
		med = basic * 0.15;
		total = basic + hra + med;	
	}

	@Override
	void displayInfo() {
		name = "Smith";
		designation = "Programmer";
		System.out.println("Name: "+name);
		System.out.println("Designation: "+designation);
		System.out.println("Total salary: "+total);
	}
	
}

public class PracticeProblem2 {

	public static void main(String[] args) {
		Manager mng = new Manager();
		mng.calculateSalary();
		mng.displayInfo();
		Programmer prg = new Programmer();
		prg.calculateSalary();
		prg.displayInfo();

	}

}
