import java.util.*;
public class ExceptionApp
{
 public static void main(String []args)
 {
   Scanner sc=new Scanner(System.in);
   do{
      System.out.println("1.Arithmetic Exception");
      System.out.println("2.ArrayIndexoutofbound");
      System.out.println("3.NumberFormatException");
      System.out.println("4.InputMIsmatchException");
      System.out.println("5.NullPointerException\nEnter your choice");
      int choice=sc.nextInt();
      switch(choice)
      {
        case 1:try{
                    int a=5 ,div=0;
                    div=a/0;
                    System.out.println("div "+div);
                  }
                  catch(Exception e)
                  {
                  System.out.println("error..."+e);
                  }break;
        case 2:int a[]=new int[]{1,2,3,4,5};
                try{
                   System.out.println(a[a.length+1]);
                   System.out.println(a.length);
                }
                catch(Exception e)
		  {
		    System.out.println("error..."+e);
                  }break;
        case 3:System.out.println("Enter a string");
               String str=sc.next();
               try{
				   int a=Integer.parseInt(str);
				   System.out.println(a);
			   }
			   catch(Exception e){
				    System.out.println("error..."+e);
			   }break;

		case 4:try{
		       System.out.println("Enter Employee Id");
		       int eid=sc.nextInt();
		          }
		       catch(Exception e){
               System.out.println("error..."+e);
			   }break;
		default:System.out.println("You have Entered Wrong choice");

      }
     }while(true);

 }
}