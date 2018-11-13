class Freshjuice {

enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }
FreshJuiceSize size;
}

// the name of the file is on the name of the public class
public class FreshJuiceTest 

{
public static void main(String []args)
{
	Freshjuice juice = new Freshjuice();
	juice.size = Freshjuice.FreshJuiceSize.MEDIUM;
	System.out.println("Size is :->" + juice.size);

}


}