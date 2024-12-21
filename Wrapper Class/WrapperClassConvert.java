import java.util.*;
public class WrapperClassConvert
{
  public static void main(String []args)
  {
     Scanner sc=new Scanner(System.in);
    //1
    /*System.out.println("Enter a String");
     String str=sc.next();
     int n=Integer.parseInt(str);

     int sum=0;
     while(n!=0)
     {
		 int rem=n%10;
		 sum=sum+rem;
		 n=n/10;
	 }
	 System.out.println("Sum of digits "+sum);
	 */
 //2
    /* System.out.println("Enter fahrenhite value to calculate celcius");
      String str=sc.next();
       double f=Double.parseDouble(str);
      double c=(f-32)*5/9;
      System.out.println("Celcius is "+c);*/
   //3
     /* System.out.println("Enter Three String values");
      String str1=sc.next();
      String str2=sc.next();
      String str3=sc.next();
      int a=Integer.parseInt(str1);
      int b=Integer.parseInt(str2);
      int c=Integer.parseInt(str3);

      if(a>b && b>c)
      {
		  System.out.println("A is greater "+a);
	  }
	  else if(b>a && b>c)
	  {
		  System.out.println("B is greater "+b);
	  }
	  else{
		  System.out.println("C is greater "+c);
	  }
       */
   //4
      /* System.out.println("Enter a String");
       String str1=sc.next();
       int n=Integer.parseInt(str1);
       if(n%2==0)
       {
		   System.out.println("Number is Even");
	   }
	   else
	   {
		   System.out.println("Number is Odd");
	   }
	   */
     //5
	  /* System.out.println("Enter String Array Values");
	   String str[]=new String[5];
	     boolean b[]=new boolean[str.length];
	   for(int i=0;i<str.length;i++)
	   {
          str[i]=sc.next();
          b[i]=Boolean.parseBoolean(str[i]);
	   }
	   int count=0;

	   for(int i=0;i<b.length;i++)
	   {
		   if(b[i]==true)
		   {
			   count++;
		   }
	   }
	   System.out.println(" Total true values are "+count);
     */
//6
   /*  System.out.println("Enter a Charector");
     String str=sc.next();
     char c=str.charAt(0);
     System.out.println(c+"<---ASCII value is--->"+(int)c);
    */

   // first and  last reverse
   /*      System.out.println("Enter a String ");
       String str=sc.next();
        int n=Integer.parseInt(str);//12345
       int l=n%10;//last//5---1234
        n=n/10;//cut the last digit 1234
        int temp=n;
        int mid=0,count=0,f=0;
        while(n!=0)
        {
		 int rem=n%10;
		 count++;//4
		  f=rem;
		 n=n/10;


	    }//l=5,f=1 m=234   52341
         mid=temp%(int)(Math.pow(10,(count-1)));

         int rev=l*((int)(Math.pow(10,count)))+(mid*10)+f;

	    System.out.println("Reverse of number is "+rev);
      */

      //7
       /*  System.out.println("Enter a String ");
	         String str=sc.next();
        int n=Integer.parseInt(str);
        int rev=0;
        while(n!=0)
        {
			int rem=n%10;
		    rev=rev*10+rem;
		    n=n/10;
		}
			System.out.println("Reverse Number is "+rev);
          */

       //8
       /*      System.out.println("Enter two String ");
		         String str1=sc.next();
		         String str2=sc.next();
        int n=Integer.parseInt(str1);
        int m=Integer.parseInt(str2);
        if(n>m)
        {
			System.out.println(n+" is greater");
		}
		else
		   System.out.println(m+" is greater");
		   */

		//9
		 /*  System.out.println("Enter a String ");
		       String str=sc.next();
        int n=Integer.parseInt(str);
        System.out.println("SquareRoot of "+n+" is "+Math.sqrt(n));
        */

        //10
        int a=0,b=0;
           System.out.println("Enter 1 String ");
		       String str1=sc.next();
		       boolean b1=Boolean.parseBoolean(str1);
              System.out.println("Enter 2 String ");
		          String str2=sc.next();
            boolean b2=Boolean.parseBoolean(str2);

            if(b1==true && b2==true)
            {
				a=1;
				b=1;
			}
			 if(b1==false && b2==false)
			{
				a=0;
				b=0;
			}
			if(b1==false && b2==true)
			{
				a=0;
				b=1;
			}
			if(b1==true && b2==false)
			{
				a=1;
				b=0;
			}
			System.out.println(a+" "+b+" Addition is "+(a+b));
	}
}