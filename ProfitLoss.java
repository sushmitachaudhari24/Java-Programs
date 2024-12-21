import java.util.*;
public class ProfitLoss
{
  public static void main(String []args)
  {
     int sp,cp;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Selling price and Cost price");
	 sp=sc.nextInt();
	 cp=sc.nextInt();
	 String result=(sp>cp)?"Profit":"Loss";
	 System.out.println(result);
  }
}