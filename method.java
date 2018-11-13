class min
{
 public static void main(String[] args) {
 	System.out.println(minfunc(1221,221));

 }
 public static int minfunc (int n1 , int n2)
 {
 	int min;
 	if (n1 > n2)
 	{
 		min  = n2 ;
 	}
 	else { min = n1; }
 	return min;
 } 
}