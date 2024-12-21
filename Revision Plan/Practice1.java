import java.util.*;
public class Practice1
{
	public static void main(String []args)
	{
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a charector");
		 char  ch=sc.next().charAt(0);
		 String result=(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')?"vowel":"consonant";
		 System.out.println(result);

	}
}