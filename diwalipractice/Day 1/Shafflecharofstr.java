import java.util.*;
public class Shafflecharofstr
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter String ");
    String str=sc.nextLine();
    String strary[]=str.split(" ");
    System.out.println("Duplicate words from string are");
    for(int i=0;i<strary.length;i++)
    {
      for(int j=i+1;j<strary.length;j++)
      {
       if(strary[i].equalsIgnoreCase(strary[j]))
       {
        System.out.println(strary[i]);
       }
      }
    }
  }
}