import java.io.*;
class ReadConsole {
public static  char c;
public static void main(String[] args) throws IOException{
	InputStreamReader cin = null;
	try {
		cin = new InputStreamReader(System.in);
	do 
	{
		System.out.println("Enter the charcter \'q\' to leave  ");
		c = (char ) cin.read();
	}while (c != 'q');
	}
	finally {
		if (cin != null)
		{
			cin.close();
		}
	}
}
}