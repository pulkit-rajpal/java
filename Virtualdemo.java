import java.io.*;


// we can acces any class and create an instance of that classs
public class Virtualdemo 
{
	public static void main(String [ ] args) {
		Salary s = new Salary("pulkit", "17/cs27", 4, 3600.00);
		Employe e = new Salary("pulkit", "17/cs27", 4, 3600.00);
		System.out.println("Calling the mailcheck using the Salary refrence ");
		s.mailcheck();
		System.out.println("Calling the mailcheck  using the refernce of the Employe ");
		s.mailcheck();
	}

}