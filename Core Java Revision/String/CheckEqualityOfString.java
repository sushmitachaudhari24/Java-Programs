import java.util.*;
public class CheckEqualityOfString
{
 public static void main(String []args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter two Strings");
   String str1=sc.next();
   String str2=sc.next();
   char ch1[]=str1.toCharArray();
   char ch2[]=str2.toCharArray();
   if(ch1.length!=ch2.length)
   {
    if(ch1.length>ch2.length)
    {
     System.out.println("First String is Greater");
    }
    else
    {
     System.out.println("Second String is Greater");
    }
   }
   else
   {boolean b=false;
    for(int i=0;i<ch1.length;i++)
    {
     if(ch1[i]==ch2[i])
     {
      b=true;
     }
     else
     {
      b=false;
      break;
     }
    }
    if(b==false)
    {
      System.out.println("Strings are not equal");
    }
    else
    {
      System.out.println("Strings are equal");
    }
   }
 }
}