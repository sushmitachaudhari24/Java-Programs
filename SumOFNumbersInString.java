import java.util.*;
public class SumOFNumbersInString
{
 public static void main(String []args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a String");
  String str=sc.nextLine();
  char ch[]=str.toCharArray();
  int num=0,sum=0;
  for(int i=0;i<ch.length;i++)
  {
    if(ch[i]>=48 && ch[i]<=57)
    {
     num=num*10+(int)(ch[i]-48);
    }
    else
    {
    sum=sum+num;
    num=0;
    }
   }
   sum=sum+num;
  System.out.println("Sum="+sum);
 }
}