import java.util.*;
public class OddNumberCube
{
  public static void main(String []args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a limit");
   int limit=sc.nextInt();
   for(int i=1;i<=limit;i++)
   {int p=1;
     if(i%2!=0)
     {
       for(int j=1;j<=3;j++)
       {
        p=p*i;
       }
       System.out.print(p+"\t");
     }

   }
  }
}