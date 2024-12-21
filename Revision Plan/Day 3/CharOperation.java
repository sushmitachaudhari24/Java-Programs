import java.util.*;
interface CharOperator
{
  void setCharArr(char[] ch);

  abstract char[] getArrResult();
}
class ConvertToUpper implements CharOperator
{char ch[];
	public void setCharArr(char[] ch)
	{this.ch=ch;
	}
    public char [] getArrResult()
    {
		for(int i=0;i<ch.length;i++)
		{

				 ch[i]=(char)((int)ch[i]-32);

		}
		return ch;
    }
}
class ChangeAlterNateChar implements CharOperator
{char ch[];
	public void setCharArr(char[] ch)
	{
		 this.ch=ch;
	}
   public char [] getArrResult()
    {
    for(int i=0;i<ch.length;i++)
			{
				if(i%2==0)
				{
	              ch[i]=(char)((int)ch[i]-32);
			    }
	     	}
		return ch;
    }
}
public class CharOperation
{
  public static void main(String []args)
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a string");
     String str=sc.next();
     char c[]=str.toCharArray();
     /*char c[]=new char[20];
     System.out.println("Enter A String");
     for(int i=0;i<c.length;i++)
     {
		 c[i]=sc.next().charAt(0);
	 }*/
     System.out.println("**********MENU**********\n1.Convert To Upper\n2.ChangeAlterNateCharector\n************************");
     System.out.println("Enter Your Choice");
      int ch=sc.nextInt();

      switch(ch)
      {
       case 1:ConvertToUpper cu=new ConvertToUpper();
              cu.setCharArr(c);
              c=cu.getArrResult();
               System.out.println(String.valueOf(c));
       break;
       case 2:ChangeAlterNateChar ca=new ChangeAlterNateChar();
              ca.setCharArr(c);
              c=ca.getArrResult();
               System.out.println(String.valueOf(c));
       break;
       default:System.out.println("Wrong choice");
      }


  }
}