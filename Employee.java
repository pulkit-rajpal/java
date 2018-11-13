import java.io.*;

// Static represent that we need not to create a  object for that  method  
// the method can be directly accessed by calling the function


public class Employee
{
	// visible to any child class 
	public String name;

	// visible to in this class only
	private  double salary;

	public  Employee(String empname)
	{
		name = empname;
	}

	public void setSalary(double  m)
	{
		salary =  m;
	}


	public void printdata()
	{
		System.out.println("Name   -> " + name);
		System.out.println("Salary -> "+ salary);
	}
	public static void main(String args[]) {
		
		Employee obj = new Employee("Pulkit");
		obj.setSalary(1000);
		obj.printdata();
	}	
}