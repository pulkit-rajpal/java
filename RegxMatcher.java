import java.util.regex.Matcher;
import java.util.regex.Pattern;


// default class is visible to the packages only 
// public class is visible to the world



class RegxMatcher 
{
	public static void main(String[] args) {
	String line = "This order was placed for QT3000! OK?";
	String pattern = "(.*)(\\d+)(.*)";
	// first we careate a pattern object 
	// then compile it and then  matcher the line which you want the 
	// by calling the method  matcher which return the matcher object
	Pattern p = Pattern.compile(pattern);	
	Matcher m = p.matcher(line);

	if (m.find( ))
	{
		System.out.println("Found Value : "+ m.group(0));
		System.out.println("Found Value : "+ m.group(1));
		System.out.println("Found Value : "+ m.group(2));
	}
	else 
	{
		System.out.println("NOT FOUND");
	}

	}
}