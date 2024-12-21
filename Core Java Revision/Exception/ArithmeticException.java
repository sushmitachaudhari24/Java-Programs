public class ArithmeticException
{
 public static void main(String []args)
 {
   try{
      int div=5/0;
      System.out.println("Division is "+div);
   }
   catch(Exception e)
   {
     System.out.println("Error is "+e);
   }
 }
}