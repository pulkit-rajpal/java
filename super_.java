import java.io.*;



 class Animal 
{
	public void move()
	{
		System.out.println("Animal can moe !!");
	}
}

  class Dog extends Animal{
	public void move()
{
super.move();
System.out.println("Dog can Walk and move !!");
}
}

public class super_{
	public static void main(String[] args) {
		Animal  a = new Dog();
		a.move();
	}
}

