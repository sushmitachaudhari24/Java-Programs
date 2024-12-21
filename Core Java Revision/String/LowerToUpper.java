import java.util.*;
public class LowerToUpper
{
	public static void main(String []args)
	{
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a String ");
      String str=sc.next();
      char ch[]=str.toCharArray();
      for(int i=0;i<ch.length;i++)
      {
		  if(ch[i]>='a' && ch[i]<='z')
		  {
			  ch[i]=(char)((int)ch[i]-32);
		  }
	  }
	  System.out.println("Upper case String is..."+String.valueOf(ch));
	}
}