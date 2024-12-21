import java.util.*;
public class FibbonacciSeries
{
    public static void main(String []args)
    {
      // int a=0,b=1;
       Scanner sc=new Scanner(System.in);//0 1 1

       System.out.println("Enter a number");
       int n=sc.nextInt();
       int arr[]=new int[n];
       arr[0]=1;
       arr[1]=1;
     //  System.out.println(a); //0 1
       int sum=0;

       for(int i=2;i<n;i++)//1
       {  arr[i]=arr[i-1]+arr[i-2];//0+1

       }
       for(int i=0;i<arr.length;i++)
       {
          System.out.println(i+"-------->"+arr[i]);
	   }
    }
}