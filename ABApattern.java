public class ABApattern
{
  public static void main(String []args)
  {
    int ch;
    int k=0;
    for(int i=1;i<=5;i++)
    {ch=65;
      for(int j=1;j<=9;j++)
      {
        if(j<=(i+k))            //0+2
        {

             if(i>j)
             {System.out.print((char)ch);
				 ++ch;
			 }
              if(i==j)
              {
                System.out.print((char)ch);
			  }
			 if(j>i)
			 {
				  --ch;
				  System.out.print((char)ch);

			 }
        }
        else
         { System.out.print(" ");}

      }
       k=k+1;
      System.out.println();
    }
  }
}