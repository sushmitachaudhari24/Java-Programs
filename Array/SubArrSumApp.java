import java.util.*;
class SubArrSum
{
     int a[],sum1,sum;
     SubArrSum(int a[],int sumval)
     {
     this.a=a;
     sum=sumval;
     }

     void findSubArr()
     {
         /* for(int i=0;i<a.length;i++)
          {
			   for(int j=0;j<=a.length-2;j++)
			   {
                  if(((a[i]+a[j])==sum ) && i!=j)
                  {
                     System.out.println(+i+" "+j+"--->"+a[i]+"    "+a[j]);
				  }
			   }
		  }*/
		   for(int i=0;i<a.length;i++)
		  		     {sum1=a[i];
		  		       for(int j=i+1;j<a.length;j++)
		  		       {
		  		        sum1=sum1+a[j];
		  		        if(sum==sum1)
		  		        {
		  		          System.out.print("\n["+i+"-"+j+"]\t{");
		  		          for(int k=i;k<=j;k++)
		  		          {
		  		            System.out.print(a[k]+" ");
		  		          }
		  		          System.out.print("}");
		  		        }

		  		       }
		  		     }
     System.out.println();
     }
}
public class SubArrSumApp
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Array Values");
    int a[]=new int[5];
    for(int i=0;i<a.length;i++)
    {
      a[i]=sc.nextInt();
    }
    System.out.println("Enter Sum: ");
    int sum=sc.nextInt();
    SubArrSum sa=new SubArrSum(a,sum);
    sa.findSubArr();
  }
}