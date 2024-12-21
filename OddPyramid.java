import java.util.*;
public class OddPyramid
{
  public static void main(String []args)
  {
     for(int i=1;i<=5;i++)
     {int k=i;
       for(int j=1;j<=9;j++)
       {
           if(j>=6-i && j<=4+i )
           {
             if(j<=5)
             {
				  System.out.print(k);
                 ++k;
			 }

			else if(j>5)
			 {--k;
				 System.out.print(k);

			 }
           }

           else{
            System.out.print(" ");

           }
       }
       System.out.println();
     }
  }
}