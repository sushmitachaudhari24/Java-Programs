public class ArrayIndexOutOfBoundsException
{
   public static void main(String []args)
   {
    int a[]=new int[]{1,2,3,4};
    try{
    System.out.println("Value of A[5] is "+a[5]);
    }
    catch(Exception e)
    {
     System.out.println("Error is "+e);
    }
    
   }
}