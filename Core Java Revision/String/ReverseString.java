import java.util.*;
public class ReverseString
{
   public static void main(String []args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a String");
     String str=sc.next();
     char ch[]=str.toCharArray();
     for(int i=0,j=ch.length-1;i<ch.length/2;i++,j--)
     {
       char temp=ch[i];
       ch[i]=ch[j];
       ch[j]=temp;
     }
     System.out.println("Reverse String is "+String.valueOf(ch));
   }
}