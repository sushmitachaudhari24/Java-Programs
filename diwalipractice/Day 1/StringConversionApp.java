import java.util.*;
abstract class StringParent
{
  abstract void acceptString(String str);
}
class ConvertToUpper extends StringParent
{ char ch[];
 public void acceptString(String str)
 {
  ch=str.toCharArray();
  for(int i=0;i<ch.length;i++)
  {
    if(ch[i]>=97 && ch[i]<=122)
    {
       ch[i]=(char)((int)ch[i]-32);
	}
  }
  System.out.println("String into UpperCase "+String.valueOf(ch));
 }
}
class ConvertToLower extends StringParent
{char ch[];
 public void acceptString(String str)
 {
  ch=str.toCharArray();
for(int i=0;i<ch.length;i++)
  {
    if(ch[i]>=65 && ch[i]<=90)
    {
       ch[i]=(char)((int)ch[i]+32);
	}
  }
  System.out.println("String into LowerCase "+String.valueOf(ch));
 }
}
public class StringConversionApp
{
   public static void main(String []args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("1.ConvertToUpper\n2.ConvertToLower\nEnter from above");
     int choice=sc.nextInt();

      System.out.println("Enter A String");
           String str=sc.next();

     switch(choice)
     {
      case 1:ConvertToUpper cu=new ConvertToUpper();
               cu.acceptString(str);
                break;
      case 2:ConvertToLower cl=new ConvertToLower();
               cl.acceptString(str);
             break;
      default:System.out.println("Wrong choice");
     }
   }
}
