import java.util.*;
public class SearchArray
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Array Elements");
    int a[]=new int[5];
    for(int i=0;i<a.length;i++)
    {
      a[i]=sc.nextInt();
    }
    System.out.println("Enter a number to search");
    int sv=sc.nextInt();
    boolean f=false;
    for(int i=0;i<a.length;i++)
    {
     if(sv==a[i])
     {f=true;
      System.out.println("Search is Success");
      break;
     }
     else
     {
      f=false;
     }
    }
    if(f==false)
    {
     System.out.println("Value not found");
    }
  }
}