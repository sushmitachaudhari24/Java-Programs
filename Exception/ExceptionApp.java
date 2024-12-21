import java.util.*;
public class ExceptionApp
{static int arr1[];
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("1.ArrayIndexOutOfBoundException\n2.StringIndexOutOfBoundException\n3.ArithmeticException\n4.NullPointerException\n5.NumberFormatException\n6.InputMistchmatchException\n7.ClassNotFoundException\nEnter your choice");
    int ch=sc.nextInt();
    switch(ch)
    {
		case 1:int a[]=new int[3];
		            a[0]=1;
		            a[1]=2;
		            a[2]=3;
		      try{
				  System.out.println("Value of"+(a.length+1)+"  "+a[a.length+1]);
			     }
			    catch(ArrayIndexOutOfBoundsException arb)
			    {
					System.out.println("Illigal You want to access index that not present");
					System.out.println(arb);
				}
                   System.out.println("Array values are ");
                   for(int i=0;i<a.length;i++)
                   {
					   System.out.print(a[i]+" ");
				   }
		     break;

		case 2:System.out.println("Enter a string ");
		       String str=sc.next();
		        try{
                   System.out.println("Charector from string "+str.charAt((str.length()+2)));
				}
				catch(StringIndexOutOfBoundsException se)
				{
					System.out.println("You are tying to access Out of rangeCharector of string"+"\t");
					System.out.println(se);
				}
		      break;
		case 3: System.out.println("Enter two numbers");
    			int n1=sc.nextInt();
   				 int n2=sc.nextInt();
  			  try
 			   {
  			   int div=n1/n2;
  			   System.out.println("Division is "+div);
  			   }
   				catch(ArithmeticException ae)
   				 {
  			 	 System.out.println("second value is Zero so..Divide by zero Exception occured");
  				  System.out.println(ae);
 				   }
  				  System.out.println("This is Arithmatic calculation");
					break;
		case 4: try{
			System.out.println("Enter array[0] value");
			         arr1[0]=sc.nextInt();
		            System.out.println("array "+arr1);
				   }
				catch(NullPointerException np)
				{
					System.out.println("Error is "+np);
				}
		      break;
		case 5:
		        System.out.println("Enter a String");
		       String str1=sc.next();
		       try
		       {
				   int num=Integer.parseInt(str1);
				   System.out.println(num);
			   }
			   catch(NumberFormatException ne)
			   {
				   System.out.println("Conversion error "+ne);
			   }

		      break;
		case 6:try{
		    System.out.println("Enter Id of Employee");
		      int id=sc.nextInt();
		      System.out.println(" Id of Employee "+id);}
		      catch(InputMismatchException im)
		      {
				  System.out.println("Input Error : "+im);
			  }
		    break;
		case 7: try{

			        Class.forName("Geeks");
		          }
		          catch(ClassNotFoundException cs)
		          {
					  System.out.println(cs);
				  }
		    break;
		default:System.out.println("You have Entered invalid choice");
	}

  }
}