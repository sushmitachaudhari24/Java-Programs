import java.util.*;
class ProfitLoss
{
  private int cp,sp;
  public void acceptSPCP(int sp,int cp)
  {
    this.sp=sp;
    this.cp=cp;
  }
  public void show()
  {
	  if(sp>cp)
	  {
         System.out.println(" Profit of "+(sp-cp)+"Rupees");
	  }
	  else if(cp>sp)
	   {
	      System.out.println("Loss of "+(cp-sp)+" Rupees");
	  }
	  else{
		  System.out.println("No Profit No Loss//Both sp and cp are same");
	  }
  }
}
public class ProfitLossApp
{
	public static void main(String []args)
	{
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter Selling price And Cost price");
    	int sp=sc.nextInt();
    	int cp=sc.nextInt();
    	ProfitLoss pl=new ProfitLoss();
    	pl.acceptSPCP(sp,cp);
    	pl.show();
    }
}