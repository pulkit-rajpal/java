public class str {
		public static void main(String[] args) {
		String fs;
		String palindrome = "My name is pulkit Rajpal";	
		int len = palindrome.length();
		// printf() and format() for formatted numbers
		System.out.printf("the length of the string is %d", len);
		fs = String.format("the length of  the string is %d", len);
		System.out.println(fs);
	}
}