import java.util.*;
public class SumOfDigitFromString
{
  public static void main(String []args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a String");
   String str=sc.next();
   char ch[]=str.toCharArray();
   int sum=0;
   for(int i=0;i<ch.length;i++)
   {
    if(ch[i]>='0' && ch[i]<='9')
    {
     sum=sum+(int)(ch[i]-'0');
    }
   }
   System.out.println("Sum of Digits from String "+sum);
  }
}