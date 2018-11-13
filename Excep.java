import java.io.FileReader;
import java.io.File;


/*
 Checked exception -> checked at the  compile time 
 these are just can not be simply ignored 
*/


public class Excep {

// This throws FileNotFoundException 

public static void main(String[] args) throws Exception {
	// File file = new File("E://p.txt");
	// FileReader fr = new FileReader(file);
	Excep obj  = new Excep();
	obj.p();
	}	


	public  void 	p ()
	{
		int[] num =  {1,2,3,4};
		// this throws the ArrayIndexOutOfBoundsException
		System.out.println(num[5]);
	}
}