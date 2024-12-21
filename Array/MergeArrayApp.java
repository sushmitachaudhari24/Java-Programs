import java.util.*;
class MergeArray
{
  int a[],b[],c[];
  void acceptArray(int a1[],int b1[] ,int c[])
  {
    a=a1;
    b=b1;
    this.c=c;
  }
  void showArray()
  { int k=0;
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
    for(int j=0;j<c.length;j++)
    {
      System.out.print("\t"+c[j]);
    }
  }
}
public class MergeArrayApp
{
   public static void main(String []args)
   {  Scanner sc=new Scanner(System.in);
      int a[]=new int[]{10,20,30,40,50,60};
      int b[]=new int[]{70,80,90,100};
      int c[]=new int[10];
      MergeArray ma=new MergeArray();
      ma.acceptArray(a,b,c);
      ma.showArray();
   }
}