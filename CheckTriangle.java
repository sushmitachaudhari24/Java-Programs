import java.util.*;
public class CheckTriangle
{
   public static void main(String []args)
    {
	  int a1,a2,a3;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter three Angles of tringle");
      a1=sc.nextInt();
      a2=sc.nextInt();
      a3=sc.nextInt();
      String result=(a1==a2 && a2==a3 && a1==a3)?"Triangle is Equilateral":(a1!=a2 && a2!=a3 && a1!=a3)?"Triangle is Scalen":"Triangle is Isoscales";
      System.out.println(result); 	  
    }	
}