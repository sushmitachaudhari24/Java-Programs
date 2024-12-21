import java.util.*;
public class StringApp
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter A String:");//get string from user
     String str=sc.next();
     char ch[]=str.toCharArray();

     System.out.println("Enter A Charector to Search");//get Charector from user fo search
     char c=sc.next().charAt(0);
     char f=' ',l=' ';
     boolean b=true;
     for(int i=0;i<ch.length;i++)// logic to find Adjecent charrector
     {
	   if(i==0 && ch[i]==c)
	   {
          f=' ';
          l=ch[i+1];
          b=true;
          break;
	   }
	   if(i==ch.length-1 && ch[i]==c)
	   {
		   f=ch[i-1];
		   l=' ';
		   b=true;
		   break;
	   }
       if(ch[i]==c)
       {
        f=ch[i-1];
        l=ch[i+1];
        b=true;
        break;
       }
       else
       {
         b=false;

       }
     }
          if(b==false)
          {
			  System.out.println("Not Found");
		  }
		  else
		    System.out.println("first Letter----"+f+"  NextLetter----"+l);

  }
}