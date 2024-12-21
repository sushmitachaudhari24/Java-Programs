public class Test3_1
{
  public static void main(String []args)
  {
    for(int i=1;i<=13;i++)
	  {
	    for(int j=1;j<=13;j++)
	    {
	      if(i<=7 && j<=6+i && j>=8-i)
	      {
	        System.out.print("*");
	      }
	       else if(i>=8 && j>=i-6 && j<=20-i)
	       {
             System.out.print("*");
		   }
	      else
	      {
	        System.out.print(" ");
	      }
	    }
	    System.out.println();
      }
  }
}
