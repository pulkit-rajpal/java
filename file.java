import java.io.*;
// A stream may be defined as the sequence of the data

//InPutStream - read the data from the file 
//OutPutStream - write the data to the destination folder 
// byte - 8 bit bytes  stream 


class CopyFile {
	public static void main(String[] args) throws IOException{
		FileInputStream in =  null;
		FileOutputStream out =  null;
		try
		{
			// Here we can also use the FileReader for reading the data 
			// and FileWriter for writing the data 
			// which reads the two bytes of the data for the input file stream and 
			// then write the 2-byte ouput stream  
			in =  new FileInputStream("input.txt");
			out =  new FileOutputStream("output.txt");
			int c;
			while ((c = in.read()) != -1)
			{
				out.write(c);
			}
		}
		finally{
			if(in != null)
			{
				in.close();
			}
			if (out != null)
			{
				out.close();
			}

		}
		
		
	}
}

