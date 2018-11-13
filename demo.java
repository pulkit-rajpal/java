import java.io.*;


class outer_class {
	int num;
	private class inner_demo 
	{
		public void print()
		{
			System.out.println("This is the inner class");
		}

	}

	void display_inner()
	{
		inner_demo  d = new inner_demo();
		d.print();
	}

}


public class demo {
	public static void main(String[] args) {
		outer_class a = new outer_class();
		a.display_inner();
	}
}