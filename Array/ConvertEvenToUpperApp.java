import java.util.*;
class ConvertEvenToUpper
{
	 char ch[];

     ConvertEvenToUpper(char ch[])
     {
		  this.ch=ch;
     }
     void Convert()
     {
		 for(int i=0;i<ch.length;i++)
		 {
             if(i%2==0)
             {
				 ch[i]=(char)(((int)ch[i])-32);
			 }
		 }
     }
     char [] getConvertedArray()
     {
		 return ch;
     }
}
public class ConvertEvenToUpperApp
{
   public static void main(String []args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a String");
      String str=sc.next();

      char ch[]=str.toCharArray();

       ConvertEvenToUpper cu=new ConvertEvenToUpper(ch);
       cu.Convert();
       System.out.print("Even Index charector In UpperCase :- ");
       System.out.print(cu.getConvertedArray());
       System.out.println();

   }
}