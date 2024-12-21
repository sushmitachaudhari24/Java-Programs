import java.util.*;
abstract class Palindrome
{
 abstract void setString(String str);
 abstract void isPalindrome();
}
class CheckPalindrome extends Palindrome
{
	 char ch[],t;

 void setString(String str)//String.valueOf(ch);
 {
    ch=str.toCharArray();

 }

 void isPalindrome()
 {   boolean b=false;
  char ch1[]=new char[ch.length];
  for(int i=0;i<ch.length;i++)
 	 {
 		 ch1[i]=ch[i];
     }

	 for(int i=0,j=ch1.length-1;i<ch1.length/2;i++,j--)
	 {
        t=ch1[i];
        ch1[i]=ch1[j];
        ch1[j]=t;
	 }
	  //System.out.println(String.valueOf(ch1));
	   //System.out.println(String.valueOf(ch));
	 for(int i=0;i<ch.length;i++)
	 {
		 if(ch[i]==ch1[i])
		 {
			 b=true;
		 }
		 else
		 {
			 b=false;
			 break;
		 }

	 }
	 if(b==true)
	 {
      System.out.println((String.valueOf(ch))+" Is Palindrome String");
     }
     else
     {
	    System.out.println((String.valueOf(ch))+" Is  Not Palindrome String");
	 }
 }

}
public class PalindromeAbstractApp
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter A String : ");
    String str=sc.next();

    CheckPalindrome cp=new CheckPalindrome();
    cp.setString(str);
    cp.isPalindrome();

    }
}