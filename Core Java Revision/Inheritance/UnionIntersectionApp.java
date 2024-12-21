import java.util.*;
abstract class ArrAbs
{ int a[],b[];
int c[];
  void setArray(int a1[],int a2[] ,int a3[])
  {
   a=a1;
   b=a2;
   c=a3;
  }
  abstract void getResultantArray();
}
class Intersection extends ArrAbs
{
  public void getResultantArray()
  {int k=0;
     for(int i=0;i<a.length;i++)
     {
       for(int j=0;j<b.length;j++)
       {
        if(a[i]==b[j])
        {
         c[k]=a[i];
         k++;
        }
       }
     }
     System.out.println("Intersection array");
     for(int i=0;i<c.length;i++)
     {
      System.out.print("\t"+c[i]);
     }
  }
}
class Union extends ArrAbs
{
public void getResultantArray()
  {int k=0;
       for(int i=0;i<a.length;i++)
       {
         c[k]=a[i];
         k++;
       }
      for(int i=0;i<a.length;i++)
      {
              boolean f=false;
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
   System.out.println("Union array");
       for(int i=0;i<c.length;i++)
       {
        System.out.print("\t"+c[i]);
     }
  }
}
public class UnionIntersectionApp
{
   public static void main(String []args)
   { int a[]=new int[]{1,2,4,5,3};
      int b[]=new int[]{2,4,7,6,8};
      int c[]=new int[a.length+b.length];
      Intersection is=new Intersection();
      is.setArray(a,b,c);
      is.getResultantArray();
       Union u=new Union();
       u.setArray(a,b,c);
       u.getResultantArray();
   }
}