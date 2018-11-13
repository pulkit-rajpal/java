import java.io.*;

class list_file {
	
public static void main(String[] args) {
	File file = null;
	String[] path;
	try
	{
		File all = new File("/media/pulkit/Data/java/java_tuts/");
		path   = all.list();
		for (String p : path) {
			System.out.println(p);
		}
	}
	catch (Exception e)
	{
		e.printStackTrace();
	}

}


}
