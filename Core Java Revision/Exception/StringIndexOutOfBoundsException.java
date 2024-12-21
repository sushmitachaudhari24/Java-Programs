public class StringIndexOutOfBoundsException
{
  public static void main(String []args)
  {
    String str="sushmita";
    char ch[]=str.toCharArray();
    try{
      System.out.println("Value of str[length-1] "+ch[ch.length+2]);
    }
    catch(Exception e)
    {
      System.out.println("Error is "+e); 
    }
  }
}