public class crossPattern
{
  public static void main(String []args)
  {
    for(int i=1;i<=11;i++)
    {int t=i,c=12-i;
		for(int j=1;j<=11;j++)
		{
           if(i<=6)
           {
			  if(j>=i && j<=12-i )
			  {
				  if((j%2!=0 && i%2!=0) || (j%2==0 && i%2==0))
			      {
					System.out.print(t);
					t++;
			      }
			      else
			       System.out.print(" ");
		      }
			  else{
				System.out.print(" ");
			      }
	       }
	       if(i>6)
	       {
			 if(j>=12-i  && j<=i)
			 {
				if((j%2!=0 && i%2!=0) || (j%2==0 && i%2==0))
			    {
				System.out.print(c);
					c++;
			    }
			    else
				 System.out.print(" ");
			 }
			 else{
				System.out.print(" ");
			}
		  }
	  }
		System.out.println();
	}
  }
}