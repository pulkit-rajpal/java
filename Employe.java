/* 
Polymorphism is the abiltiy of an object to take on many forms 
the most common use of this occurs when a parent class refrence 
is used to refer a child class object .
*/

// it also must have  Is-A relations 


/*
Below is the example of the Polymorphism  ->

public class Vegetarian {}
public class Animal {}\
public class Deer extends Animal implements Vegetarian {}  

*/



public class Employe 
{
	private  String name;
	private String address;
	private int number;
	public Employe (String name,String address, int number )
	{
		System.out.println("Constructing an Employee");
		this.name = name;
		this.address = address;
		this.number = number;
	}
	public void mailcheck()
	{
		System.out.println("Mailing a check to "+ this.name + " " + this.address);
	}
	public String toString()
	{
		return name + " " + address + " " + number;
	}

	public String getname()
	{
		return name;
	}

	public String getaddress()
	{
		return address;
	}
	public void setaddress(String a)
	{
		address  = a;
	}

	public int  getnumber()
	{
		return number;
	}


}

















