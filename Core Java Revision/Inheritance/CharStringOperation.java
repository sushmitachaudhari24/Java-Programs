interface CharOperator
{
 void setCharArr(char ch[]);

 abstract void getArrResult();
}
class ConvertToUpper implements CharOperator
{char ch[];
 public void setCharArr(char ch[])
 {
	this.ch=ch;
 }
 public void getArrResult()
 {
  	 for(int i=0;i<ch.length;i++)
  	 {
		 if(ch[i]>='a' && ch[i]<='z')
		 {
			 ch[i]=(char)((int)ch[i]-32);
		 }
	 }
	 System.out.println(String.valueOf(ch));
 }
}
class ChangeAlternateChar implements CharOperator
{ char ch[];
 public void setCharArr(char ch[])
 {
  	 this.ch=ch;
 }
 public void getArrResult()
 {
	 for(int i=0;i<ch.length;i++)
	 {
		 if(i%2==0)
		 {
          if(ch[i]>='a' && ch[i]<='z')
		   {
		    ch[i]=(char)((int)ch[i]-32);
		   }
		 }
		 if(i%2!=0)
		 {
		    if(ch[i]>='A' && ch[i]<='Z')
		 	{
		 	 ch[i]=(char)((int)ch[i]+32);
		    }
		 }
	 }
	  System.out.println(String.valueOf(ch));
 }
}
public class CharStringOperation
{
  public static void main(String []args)
  {
	  String str="HelloDearSushmita";
	  char ch[]=str.toCharArray();
    ConvertToUpper cu=new ConvertToUpper();
    cu.setCharArr(ch);
    cu.getArrResult();
    ChangeAlternateChar ca=new ChangeAlternateChar();
    ca.setCharArr(ch);
    ca.getArrResult();
  }
}