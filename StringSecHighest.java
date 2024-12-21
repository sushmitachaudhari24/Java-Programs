import java.util.*;
public class StringSecHighest
{
 public static void main(String []args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter String");
  String str=sc.nextLine();
  String word[]=str.split(" ");
  int max=word[0].length();
  int smax=word[0].length();
  String m=word[0],sm=word[0];
  for(int i=0;i<word.length;i++)
  {
      if(max < word[i].length())
    	{
    	   max=word[i].length();
    	   m=word[i];
        }
     else if(word[i].length()<max && (max==smax || word[i].length()>smax))
    	{
           smax=word[i].length();
           sm=word[i];
        }
  }
  System.out.println("Max="+max+"\nSecond Max="+smax);
    System.out.println("Max="+m+"\nSecond Max="+sm);
 }
}