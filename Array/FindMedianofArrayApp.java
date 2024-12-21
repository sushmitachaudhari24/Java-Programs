import java.util.*;
class FindMedianofArray
{
  int a[],a1[],c[],i,j,temp;
   void setarr(int a[],int a1[],int c[])
   {
   this.a=a;
   this.a1=a1;
   this.c=c;
   }
   void mergemid()
   {
        int k=0,sum=0;
        for(i=0;i<a.length;i++)
        {
          c[k]=a[i];
          k++;
          sum=sum+a[i];
        }
        for(i=0;i<a1.length;i++)
        {
        c[k]=a1[i];
        k++;
        sum=sum+a1[i];
        }
        System.out.println("Median is "+(sum/c.length));

   }
}
public class FindMedianofArrayApp
{
  public static void main(String []args)
  {
	  Scanner sc=new Scanner(System.in);

	  System.out.println("Enter how many elements do you want to insert");
	  int s1=sc.nextInt();
	  System.out.println("Enter Array 1 Elements");
	  int a[]=new int[s1];
	  for(int i=0;i<a.length;i++)
	  {
		  a[i]=sc.nextInt();
	  }
	  System.out.println("Enter how many elements do you want to insert");
	   int s2=sc.nextInt();
	    System.out.println("Enter Array 1 Elements");
	  int a1[]=new int[s2];
	   for(int i=0;i<a1.length;i++)
	  	  {
	  		  a1[i]=sc.nextInt();
	  }
	  int c[]=new int[s1+s2];
	   FindMedianofArray m=new FindMedianofArray();
	   m.setarr(a,a1,c);
	   m.mergemid();
  }
}