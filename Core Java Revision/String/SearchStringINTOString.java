import java.util.*;
public class SearchStringINTOString
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string");
    String str=sc.nextLine();
    System.out.println("Enter string to search");
    String search=sc.next();
    int index=str.indexOf(search);
    if(index==-1)
    {
    System.out.println("Search is unsuccessFul");
    }
    else
    {
    System.out.println("Search is SuccessFull");
    }
  }
}