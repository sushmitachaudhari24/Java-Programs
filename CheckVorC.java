import java.util.*;
public class CheckVorC
{
	public static void main(String x[])
	{
 char ch;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a charector");
 ch=sc.next().charAt(0);
 String result=(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')?" is Vowel":" is Consonent"; 
 System.out.println(result);
	}
} 