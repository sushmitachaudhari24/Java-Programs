public class CommandLineArgs
{
  public static void main(String [] args)
  {
     System.out.println("Enter 2 Values");
     int a=Integer.parseInt(args[0]);
     int b=Integer.parseInt(args[1]);
      System.out.println("After Swapping 2 Values");
      a=a+b;
      b=a-b;
      a=a-b;
       System.out.println("A="+a+"\nB="+b);
  }
}