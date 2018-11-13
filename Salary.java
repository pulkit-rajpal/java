/*   Salary.java */


public class Salary extends Employe
{
	public double salary;
	public  Salary(String name, String address, int number , double salary)
	{
		super (name, address, number);
		setsalary(salary);	
	}


	public double setsalary(double newsal)

	{	
		if (newsal >= 0.0)
			
		{
			salary = newsal;
		}
		return salary;		
	}
	public double computepay()
	{
		System.out.println("computing pay for the " + getname());
		return salary/52;
	}
} 