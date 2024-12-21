import java.util.*;
 abstract class ArrOper
{ public int a[],b[],c[];
  public void setArr(int a[],int b[],int c[])
  {
    this.a=a;
    this.b=b;
    this.c=c;
  }
  abstract int []getresultantarray();

}
class InterSection extends ArrOper
{
    int [] getresultantarray()
  {
	    int k=0;
       for(int i=0;i<a.length;i++)
       {
		  for(int j=0;j<b.length;j++)
		  {
			   if(b[j]==a[i])
			   {
				   c[k]=b[j];
				   k++;
			   }
		  }
	   }
     return c;
  }
}
class Union extends ArrOper
{
  int [] getresultantarray()
  {
    int k=0;
    for(int i=0;i<a.length;i++)
    {
      c[k]=a[i];
      k++;
	}
	for(int i=0;i<a.length;i++)
	{  boolean f=false;
		for(int j=0;j<b.length;j++)
		{
			 if(c[j]==b[i])
			 {
               f=true;
			 }

		}
		 if(f!=true)
		 {
		     c[k]=b[i];
		      k++;
		 }
	}
	 return c;
  }
}
public class UnionIntersectApp
{
   public static void main(String []args)
   {
     Scanner sc=new Scanner(System.in);
     int a[]=new int[5];
     int b[]=new int[5];
     int c[]=new int[10];
     System.out.println("Enter array 1 elements");
     for(int i=0;i<a.length;i++)
     {
      a[i]=sc.nextInt();
     }
      System.out.println("Enter array 2 elements");
          for(int i=0;i<b.length;i++)
          {
           b[i]=sc.nextInt();
          }

          InterSection is=new InterSection();
          is.setArr(a,b,c);
           c=is.getresultantarray();

           System.out.print("\nInterSection array\n");
	            for(int i=0;i<c.length;i++)
	            {
					if(c[i]!=0)
	             System.out.print(c[i]+"\t");
                }



            Union u=new Union();
		    u.setArr(a,b,c);
	       c=u.getresultantarray();
		   System.out.print("\n\nUnion array\n");
		   for(int i=0;i<c.length;i++)
		   {
			   if(c[i]!=0)
			 System.out.print(c[i]+"\t");
           }
   }
}