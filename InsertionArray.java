import java.util.*;
class InsertValueOnIndex
{int a[],index,val;
 InsertValueOnIndex(int a[],int index,int val)
 {
  this.a=a;
  this.index=index;
  this.val=val;
 }
 public void mInsertValueOnIndex()
 {
  for(int i=a.length-1;i>=index;i--)
  {
   a[i]=a[i-1];
  }
  a[index]=val;
 }
 int []getResultantArray()
 {
  return a;
 }
}
public class InsertionArray
{
 public static void main(String []args)
 {
   Scanner sc=new Scanner(System.in);
   int a[]=new int[10];
   System.out.println("Enter Array Elements");
   for(int i=0;i<a.length-1;i++)
   {
    a[i]=sc.nextInt();
   }
   System.out.println("Enter index and Value to insert");
   int ind=sc.nextInt();
   int val=sc.nextInt();
   InsertValueOnIndex ia=new InsertValueOnIndex(a,ind,val);
      ia.mInsertValueOnIndex();
   a=ia.getResultantArray();
    System.out.println("Resultant Array Elements");
      for(int i=0;i<a.length;i++)
      {
       System.out.print(a[i]+"\t");
      }
 }
}