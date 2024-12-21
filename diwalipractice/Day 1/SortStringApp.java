import java.util.*;
interface StringInterface
{
 void acceptString(String str);
}
 class SortString implements StringInterface
{

 public void acceptString(String str)
 {
  char ch[]=str.toCharArray();
   for(int i=0;i<ch.length;i++)
   {
    for(int j=i+1;j<ch.length;j++)
    {
      if(ch[i]>ch[j])
      {
       char temp=ch[i];
       ch[i]=ch[j];
       ch[j]=temp;
      }
    }
   }
   System.out.println("String after sorting "+String.valueOf(ch));
 }
}
public class SortStringApp
{
 public static void main(String []args)
 {
   StringInterface si=null;
   si=new SortString();
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a string ");
   String str=sc.next();
   si.acceptString(str);
 }
}