import java.util.*;
class FindMax
{
  int a[];
  void setArr(int a[])
  {
  this.a=a;
  }
  int getMax()
  {
  int max=a[0];
    for(int i=0;i<a.length;i++)
    {
       if(a[i]>max)
       {
       max=a[i];
       }
    }
    return max;
  }
}
public class FindArrayMax
{
 public static void main(String args[])
 {
  FindMax m= new FindMax();
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Array Elements");
  int a[]=new int[5];
  for(int i=0;i<a.length;i++)
  {
   a[i]=sc.nextInt();
  }
  m.setArr(a);
  System.out.println("Max is"+m.getMax());
 }
}