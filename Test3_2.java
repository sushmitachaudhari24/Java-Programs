public class Test3_2
{
 public static void main(String []args)
 {int k;
   for(int i=1;i<=5;i++)
   { k=i;
    int m=i;
     for(int j=1;j<=9;j++)
     {
        if(j>=6-i && j<=4+i)
        {
          if(j<=5)
          {

            System.out.print(k);
            k--;
		  }
		  if(j>=6)
		  {
			  System.out.print(m);
			  m--;
		  }


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