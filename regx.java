import java.util.regex.Matcher;
import java.util.regex.Pattern;


// default class is visible to the packages only 
// public class is visible to the world



class RegxMatcher 
{
	public static void main(String[] args) {
	String line = "this is the great pulkit rajpal ! okay ?!";
	String pattern = "(.*)(\\d+)(.*)";
	Pattern p = Pattern.compile(line);	
	Matcher m = p.matcher(pattern);

	if (m.find( ))
	{
		System.out.println("Found Value"+ m.group(0));
		System.out.println("Found Value"+ m.group(1));
		System.out.println("Found Value"+ m.group(2));
	}
	else 
	{
		System.out.println("NOT FOUND");
	}

	}
}