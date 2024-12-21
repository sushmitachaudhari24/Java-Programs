import java.util.*;
public class ArmstrongN
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int num=sc.nextInt();
    int i,temp=0,rem=0,count=0,sum,p;
     System.out.println("Armstrong numbers");
    for(i=1;i<num;i++)
    {  count=0;
      temp=i;//153
         while(temp!=0)
         {
           temp=temp/10;
           count++;//3
         }
         temp=i;//153
         sum=0;
         while(temp!=0)
         {
           rem=temp%10;//3//5
           p=1;
           for(int j=0;j<count;j++)
           {
            p=p*rem;//27
           }
           sum=sum+p;//27+
           temp=temp/10;//15
         }
         if(sum==i)
         {
         System.out.println(i);
	     }
    }
  }
}