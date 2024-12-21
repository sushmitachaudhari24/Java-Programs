import java.util.*;
public class ArrayOccurance
{
 public static void main(String []args)
 {
   Scanner sc=new Scanner(System.in);
   int a[]=new int[10];
   System.out.println("Enter Array Elements");
   for(int i=0;i<a.length;i++)
   {
    a[i]=sc.nextInt();
   }
   for(int i=0;i<a.length;i++)
   {
    for(int j=i+1;j<a.length;j++)
    {
       if(a[i]>a[j])
       {
       int temp=a[i];
       a[i]=a[j];
       a[j]=temp;
       }
    }
   }
   int count=1;
     System.out.println(" ");
       for(int i=0;i<a.length;i++)
        {
           if(i==a.length-1)
               System.out.println(a[i]+ "----"+count+" times");
           else if(a[i]==a[i+1])
                count++;
           else
            {
              System.out.println(a[i]+ "----"+count+" times");
             count=1;
            }
     }
 }
}