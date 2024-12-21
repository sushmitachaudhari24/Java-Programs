import java.util.*;
public class RotateAntiClockwiseArray
{
  public static void main(String []args)
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter array Elements to rotate clockwise");
     int a[]=new int[5];
     for(int i=0;i<a.length;i++)
     {
       a[i]=sc.nextInt();
     }
     System.out.println("Enter how many rotation do you want to rotate");
     int r=sc.nextInt();
     int temp;
     while(r!=0)
     {
      for(int i=a.length-1;i>0;i--)
      {
        temp=a[i];
        a[i]=a[i-1];
        a[i-1]=temp;
      }
      r--;
     }
       for(int i=0;i<a.length;i++)
       {
         System.out.print(a[i]+"\t");
       }

  }
}