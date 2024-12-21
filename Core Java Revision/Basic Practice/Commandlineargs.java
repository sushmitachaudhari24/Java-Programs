import java.util.*;
public class Commandlineargs
{
  public static void main(String []args)
  {
   int a=Integer.parseInt(args[0]);
   int b=Integer.parseInt(args[1]);
    System.out.println("Value is a..."+a+"\nb..."+b);
   a=a+b;
   b=a-b;
   a=a-b;
   System.out.println("Value is a..."+a+"\nb..."+b);
  }
}