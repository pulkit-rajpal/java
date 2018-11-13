
// importing the packages 
// which gives the compiler a categorization of where to look at the class files

import java.io.*;



public class var 
{

	public  void age()
	{
		int age=0;
		age = age + 7;
		System.out.println("Age is "+ age);
	}

	public static void main(String args[])
	{
		var  p = new var();
		p.age();

	}
}