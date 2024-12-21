import java.util.*;
public class ReverseWordsOfString
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string ");
    String str=sc.nextLine();
    String words[]=str.split(" ");
    StringBuffer sb=new StringBuffer();
    for(String word:words)
    {
      String s="";
          for(int i=(word.length()-1);i>=0;i--)
		  {
			  s=s+word.charAt(i);
		  }
		s=s+" ";
		 sb.append(s);

	  }


    System.out.println("String after reverse words ..... "+sb);
  }
}