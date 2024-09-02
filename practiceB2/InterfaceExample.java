package practiceB2;

interface Employee2{
	abstract void info();
	abstract void task();
	abstract void calculateSalary();
	abstract void displayInfo();
}

class Developer implements Employee2{
	@Override
	public void info() {
		System.out.println("This is from developer class");		
	}

	@Override
	public void task() {
		System.out.println("Software Development");	
	}

	@Override
	public void calculateSalary() {
		System.out.println("Salary for developer");
		
	}

	@Override
	public void displayInfo() {
		System.out.println("Info for developer");
		
	}
}

class Manager implements Employee2{

	@Override
	public void info() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void task() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceExample {

	public static void main(String[] args) {
		Developer obj = new Developer();
		obj.info();
		obj.task();

	}

}
