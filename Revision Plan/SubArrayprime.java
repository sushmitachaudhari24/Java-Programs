import java.util.*;
public class SubArrayprime
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Array Elements");
    int a[]=new int[5];
    for(int i=0;i<a.length;i++)
    {
      a[i]=sc.nextInt();
    }
    for(int i=0;i<a.length;i++)
    {
       int temp=a[i];
       System.out.print("Prime Factors of "+a[i]+" -- [");
       for(int j=2;j<=temp;j++)
       {
          while(temp%j==0)
          {
            System.out.print(j+" ");
            temp=temp/j;
          }
       }
       System.out.print("]");
       System.out.println();
    }
  }
}