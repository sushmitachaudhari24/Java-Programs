import java.util.*;
public class EncryptString
{
 public static void main(String []args)
 {
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter a string");
     String str=sc.next();
     char ch[]=str.toCharArray();
     for(int i=0;i<ch.length;i++)
     {
        for(int j=i+1;j<ch.length;j++)
        {
          if(ch[i]>ch[j])
          {
            char t=ch[i];
            ch[i]=ch[j];
            ch[j]=t;
          }
        }
      }
      System.out.println(String.valueOf(ch));
      int count=1;
      StringBuffer nstr=new StringBuffer();
      for(int i=0;i<ch.length-1;i++)
      {

         if(ch[i]==ch[i+1])
         {
          count++;
         }
         else
         {
           nstr.append(ch[i]).append(count);
           count=1;
         }

      }
       nstr.append(ch[ch.length-1]).append(count);
      System.out.println("Encrypted String is......."+nstr);
 }

}