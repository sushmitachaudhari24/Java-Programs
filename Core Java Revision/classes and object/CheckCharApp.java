import java.util.*;
class Checkcharector
{ char c;
  public void setchar(char ch)
  {
   c=ch;
  }
  public boolean checkchar()
  {
   if((c>='A' && c<='Z')|| (c>='a' && c<='z') )
   {
     return true;
   }
   else if(c>='0' && c<='9')
   {
    return false;
   }
   else
   {
    return true;
   }
  }
}
public class CheckCharApp
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a charector");
    char c=sc.next().charAt(0);
    Checkcharector cc=new Checkcharector();
    cc.setchar(c);
    System.out.println("If Charector is alphabet or spetial symbol then 'true'\nif charector is digit then 'false' ");
    System.out.println(cc.checkchar());
  }
}