public class PalindromePattern
{
 public static void main(String []args)
 {
   for(int i=1;i<=4;i++)
   {int a=i,b=0;
    for(int j=1;j<=7;j++)
    {
       if(j>=5-i && j<=3+i)
       {
         if(j<=4)
         {

          System.out.print(a);
           a--;
          b=a;
          b++;
		 }
		 else
		 {b++;
			System.out.print(b);
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