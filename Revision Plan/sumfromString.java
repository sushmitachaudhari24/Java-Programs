import java.util.*;
public class sumfromString
{
   /* public static void main(String []args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a String");
       String str=sc.nextLine();
       char ch[]=str.toCharArray();
       int sum=0,num=0;
       for(int i=0;i<ch.length;i++)
       {
            if(ch[i]>='0' && ch[i]<='9')
            {
			      num=num*10+(int)(ch[i]-48);
			}
			else
			{
				sum=sum+num;
				num=0;
			}
	   }
	    sum=sum+num;
	   System.out.println("Sum of number is "+sum);
    }*/
    public static void main(String []args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a string");
       String str=sc.next();
       char ch[]=str.toCharArray();
       for(int i=0;i<ch.length;i++)
       {
          if(i%2==0)
          {
			 ch[i]=(char)(ch[i]-32);
		  }
	   }
	   System.out.println(String.valueOf(ch));
	}

}