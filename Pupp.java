import java.io.*;
public class Pupp {
	int puppyAge;

	public  Pupp(String name)
	{
		System.out.println("Name choosen is" + name);
	}  
	
	public void setAge(int age)
	{
		puppyAge = age;
	}
	
	public int getAge ( )
	{
		System.out.println("Age of the puppy is  " + puppyAge);
		return puppyAge;
	}


public static void main(String []args)
{
	Pupp mypuppy = new Pupp("pulkit");
	mypuppy.setAge(2);
	mypuppy.getAge();
	System.out.print("Age of the puppy is 	" +mypuppy.puppyAge);
	System.out.print("\n");
}
}
