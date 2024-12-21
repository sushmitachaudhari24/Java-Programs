import java.util.*;
public class LCMofNumber
{
  public static void main(String []args)
  {int hcf=0,lcm=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter two numbers to calculate there LCM");
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    for(int i=1;i<n1 && i<n2;i++)
    { if(n1%i==0 && n2%i==0)
       {
        System.out.println(i);
        hcf=i;
       }
    }
    lcm=(n1*n2)/hcf;
    System.out.println("Number 1="+n1+"\nNumber 2="+n2+"\n Highest Common Factor "+hcf+"\n Least Common Factor "+lcm);
  }
}