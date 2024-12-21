import java.util.*;
class ArrayFeqCount
{
   private int a[];

  public void setIntarray(int ch[])
  {
      a=ch;
  }
  public void countFeqcount()
  {
     int b[];
     int temp,count=1;
     for(int i=0;i<a.length;i++)
     {
        for(int j=i+1;j<a.length;j++)
        {
          if(a[i]>a[j])
          {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
          }
        }
     }
      for(int i=0;i<a.length;i++)
      {

            if(i!=a.length-1 && a[i]==a[i+1])
            {
               count++;
               // break;
            }
            else
            {
             System.out.println("Count of"+a[i]+" is "+count);
             count=1;
            }
      }
  }
}
public class ArrayFeqCountApp
{
  public static void main(String []args)
  {
      Scanner sc=new Scanner(System.in);
       ArrayFeqCount ac= new ArrayFeqCount();
      System.out.println("Enter Array Elements");
      int a[]=new int[]{10,20,10,20,30,50,10,20,40};
      //for(int i=0;i<a.length;i++)
      //{
     //   a[i]=sc.nextInt();
      //}
      ac.setIntarray(a);
      ac.countFeqcount();
  }
}