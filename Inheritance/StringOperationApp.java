import java.util.*;
abstract class StringOperation
{
  abstract void performOperation(String x);
}
class ConvertToUpper extends StringOperation
{
   void performOperation(String x)
   {
      char ch[]=x.toCharArray();
      for(int i=0;i<ch.length;i++)
      {
		  if(ch[i]>='a' && ch[i]<='z')
		  {
			  ch[i]=(char)(((int)ch[i])-32);
		  }
	  }
	  System.out.println("String in Uppercase: "+(String.valueOf(ch)));
   }
}
class MaxRepetativeChar extends StringOperation
{
  void performOperation(String x)
  { char ch[]=x.toCharArray();
  int count=0;
     for(int i=0;i<ch.length;i++)
     {   count=0;
		 for(int j=i+1;j<ch.length;j++)
		 {
            if(ch[i]==ch[j])
            {
				count++;
			}
		 }

		 if(count>=ch.length/2 || count>=2 || count>=1)
		 {
			 System.out.println("Max Repeatative char is : "+ch[i]);
			 break;
		 }
	 }

  }
}
class WordReverse extends StringOperation
{
  void performOperation(String x)
  {
	  char ch[]=x.toCharArray();
	  for(int i=0,j=ch.length-1;i<(ch.length/2);i++,j--)
	  {
		  char c=ch[i];
		     ch[i]=ch[j];
		     ch[j]=c;
	  }
	  System.out.println("String in Reverse is.."+String.valueOf(ch));
  }
}
public class StringOperationApp
{
    public static void main(String []args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a String:");
       String str=sc.nextLine();
           System.out.println("Enter Your Choice Here: \n=====================\n1.Convert To UpperCase\n2.Find Max Repeatative Char \n3.Word Reverse\n=====================");
           int ch=sc.nextInt();
           switch(ch)
           {
             case 1:ConvertToUpper c=new ConvertToUpper();
                    c.performOperation(str);
                    break;
             case 2:MaxRepetativeChar m=new MaxRepetativeChar();
                    m.performOperation(str);
                    break;
             case 3:WordReverse w=new WordReverse();
                    w.performOperation(str);
                    break;
             default: System.out.println("SORRY!!! You Have Entered Wrong Choice.");
		   }
    }
}