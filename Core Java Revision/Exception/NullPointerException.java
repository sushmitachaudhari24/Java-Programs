public class NullPointerException
{
  static int a[];
  public static void main(String []args)
  {
  try{
    a[0]=2;
    System.out.println(a[0]);
    }
    catch(Exception e)
    {
     System.out.println("Error is "+e);
    }
  }
}