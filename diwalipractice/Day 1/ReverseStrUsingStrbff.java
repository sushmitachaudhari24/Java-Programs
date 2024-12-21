import java.util.*;
public class ReverseStrUsingStrbff
{
  public static void main(String []args)
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter A String ");
     String str=sc.next();
     StringBuffer sb=new StringBuffer(str);
//1.reverse
     sb.reverse();
     System.out.println("String After Reverse..."+sb);
  //2.
    sb.delete(4,8);
    System.out.println("String after delete..."+sb);
    //3.Capacity
    System.out.println("Capacity of String is..."+sb.capacity());//initially 16
    //4.Uppercase
    ((String)sb).toUpperCase();
    System.out.println("String In UpperCase...."+sb);
  }
}