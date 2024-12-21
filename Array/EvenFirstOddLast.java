import java.util.*;
public class EvenFirstOddLast
{
  public static void main(String []args)
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Array Elements");
     int a[]=new int[6];
     int b[]=new int[a.length];
     for(int i=0;i<a.length;i++)
     {
       a[i]=sc.nextInt();
     }
     int k=0;
     for(int i=0;i<a.length;i++)
     {
        if(a[i]%2==0)
        {
         b[k]=a[i];
         k++;
        }
     }
      for(int i=0;i<a.length;i++)
          {
             if(a[i]%2!=0)
             {
              b[k]=a[i];
              k++;
             }
     }
      for(int i=0;i<b.length;i++)
          {
            System.out.print(b[i]+"\t");
          }
  }
}