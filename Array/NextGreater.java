import java.util.*;
public class NextGreater
{
   public static void main(String [] args)
   {
     Scanner  sc=new Scanner(System.in);
     int a[]=new int[5];
      int b[]=new int[5];
     System.out.println("Enter 5 Elements of an Array");
      for(int i=0;i<a.length;i++)
      {
        a[i]=sc.nextInt();
      }
      for(int i=0;i<a.length;i++)
      {
         for(int j=i+1;j<a.length;j++)
         {
            if(a[j]>a[i])
            {
              b[i]=a[j];
              break;
            }

            if(a[j]<a[i])
            {
				b[i]=-1;
			}

         }
      }
      b[b.length-1]=-1;

      for(int i=0;i<a.length;i++)
      {

          System.out.println(" Next Greater for "+a[i]+" is ------->"+b[i]);
      }

   }
}