import java.util.*;
public class Isogram
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Array Elements");
    int a[]=new int[5];
    for(int i=0;i<a.length;i++)
    {
      a[i]=sc.nextInt();
    }
    boolean b=false;
     for(int i=0;i<a.length;i++)
     {
        for(int j=i+1;j<a.length;j++)
        {
         if(a[i]==a[j])
         {
           b=true;
         }
        }
     }
     if(b==true)
     {
      System.out.println("Not a Isogram array");
     }
     else
       System.out.println("  It is isogram array");
  }
}