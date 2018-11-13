import java.util.*;
import java.text.*;


/* 	SimpleDateFormat is a concrete class fro formatting and parsing dates 
	in a local sensitive mannner  
*/


public class date1{
	public static void main(String[] args) {
		Date dnew = new Date( );
		SimpleDateFormat ft  = new SimpleDateFormat("E yyyy.MM.dd 'at' hh.mm.ss a zzz");
		System.out.println("Current Date" + ft.format(dnew));
	}
}