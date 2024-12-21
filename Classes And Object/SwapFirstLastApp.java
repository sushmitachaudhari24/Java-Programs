import java.util.*;
 class SwapFirstLast
{
  int num;
  void getNum(int n)
  {
    num=n;
  }
   int swapdigit()
   {
     int pow=1,count=0,mid=0,f=0,l=0,temp,rem;
      temp=num;
      l=temp%10;
      while(temp!=0)
      {
		  rem=temp%10;
		  f=rem;
		  temp=temp/10;
      count++;
      }
       count=count-2;
       for(int i=0;i<count;i++)
       {
         pow=pow*10;
       }
       temp=num;
       temp=temp/10;
       mid=temp%pow;

       int swapnum=l*(pow*10)+mid*10+f*1;
      return swapnum;
   }
}
public class SwapFirstLastApp
{
   public static void main(String[]args)
   {
     Scanner sc=new  Scanner(System.in);
     System.out.println("Enter a number");
     int num=sc.nextInt();

     SwapFirstLast s=new SwapFirstLast();
     s.getNum(num);
    int swapnum=s.swapdigit();
      System.out.println("Number Before Swapping "+num+"\nNumber After Swapping "+swapnum);
   }
}