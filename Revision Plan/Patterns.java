public class Patterns
{
  public static void main(String []args)
  {int k=3,r=1,m=0;
    for(int i=1;i<=8;i++)
    {  r=1;

       for(int j=1;j<=7;j++)
       {
		    m=0;
		    if(i<=4)
           {
		         if(j<=i )
		         {
		   			  if(j%2==0)
		   			  {
						  System.out.print("*");
					  }
					  else
					  {System.out.print(r);
     		   			  r++;
		   			  }
		   	     }
		   	     else{
		   			 System.out.print(" ");
		             }
	         }
	    m=m+2;
	   }
	   System.out.println();

    }
  }
}