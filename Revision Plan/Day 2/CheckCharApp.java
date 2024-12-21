import java.util.*;
class CheckChar
{
 char ch;
 void setChar(char ch)
 {
    this.ch=ch;
 }
 boolean checkChar()
 {
   if(((ch>='a' && ch<='z') ||(ch>='A' && ch<='Z'))||(ch>=0 && ch<=9))
   {
     return true;
   }
   else
   {
    return false;
   }
 }
}
public class CheckCharApp
{
  public static void main(String []args)
  {
    CheckChar c=new CheckChar();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a charector");
    char ch=sc.next().charAt(0);
    c.setChar(ch);
    if((c.checkChar())==true)
          System.out.println(" Is Alphabet Or Digit");
    else
       System.out.println("Is Special Symbol");
  }
}