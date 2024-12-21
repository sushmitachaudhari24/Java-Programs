import java.util.*;
interface StringTemplate
{
 void setString(String a);
 abstract int getResult();
}
class FindVowelCount implements StringTemplate
{
String str;
 public  void setString(String a)
 {
 str=a;
 }
 public int getResult()
 {int count=0;
  char ch[]=str.toCharArray();
  for(int i=0;i<ch.length;i++)
  {
	  if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' ||ch[i]=='u')
	  {
		  count++;
	  }
  }
  return count;
 }
}
class ExtractDigit implements StringTemplate
{
String str;
 public void setString(String a)
 {
 str=a;
 }
 public int getResult()
 {
   int sum=0;
   char ch[]=str.toCharArray();
     for(int i=0;i<ch.length;i++)
     {
   	  if(ch[i]>='0'&& ch[i]<='9')
   	  {
   		 sum=sum+(int)(ch[i]-48);
   	  }
     }
  return sum;
 }
}
class StringOperation
{
 void performOperation(StringTemplate t,String str)
 {
  t.setString(str);
  System.out.println("Result of Class Operation is ...."+t.getResult());
 }
}
public class StringLooseCouplingApp
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String ");
    String str=sc.next();

    System.out.println("1.FindVowelCount\n2.ExtractDigitSum\nEnter your choice");
    int ch=sc.nextInt();
    switch(ch)
    {
      case 1:  StringOperation so=new  StringOperation();
               so.performOperation(new FindVowelCount(),str);
               break;
      case 2:  StringOperation so1=new  StringOperation();
               so1.performOperation(new ExtractDigit(),str);
               break;
      default:System.out.println("Wrong Choice!!!");
    }
  }
}