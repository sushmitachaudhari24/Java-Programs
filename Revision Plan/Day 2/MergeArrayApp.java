import java.util.*;
class MergeArray
{
 int a[],b[];
 public void MergeTwoArray(int a[],int b[])
 {
  this.a=a;
  this.b=b;
 }
 public int [] getMergeArray()
 {
   int c[]=new int[a.length+b.length];
   int k=0;
   for(int i=0;i<a.length;i++)
   {
    c[k]=a[i];
    k++;
   }
      for(int i=0;i<b.length;i++)
      {
       c[k]=b[i];
       k++;
      }
      return c;
 }
}
public class MergeArrayApp
{
  public static void main(String [] args)
  {
    int a[]=new int[]{1,2,3,4,5};
    int b[]=new int[]{6,7,8,9,10};
    MergeArray m=new MergeArray();
    m.MergeTwoArray(a,b);
    int c[]=m.getMergeArray();
    System.out.println("Merged Array is \n");
    for(int i=0;i<c.length;i++)
    {
     System.out.print("\t"+c[i]);
    }
  }
}