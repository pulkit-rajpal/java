class Calculation 

{
	int z;
	public void substract (int x, int y)
	{
		z = x -  y;
		System.out.println("The result is " + z);
	}
	public void addition (int x, int y)
	{
		z = x + y;
		System.out.println("The result is " + z);
	}
}


class my_calc extends Calculation
{

	public void multiply  (int x, int y)
	{
		z = x *y;
		System.out.println("The result is " + z);
	}

public static void main(String[] args) {
	my_calc p = new my_calc();
	p.substract(1,2);
	p.addition(1,2);
	p.multiply(1,2);
}	

}