import java.util.*;
public class FrountNextOfChar
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter String ");
    String str=sc.next();
    char ch[]=str.toCharArray();
    System.out.println("Enter a Charector to search");
    char ch1=sc.next().charAt(0);
    char f=' ',n=' ';
    for(int i=0;i<ch.length;i++)
    {
       if(i==0 && ch1==ch[i])
            {
              f=' ';
              n=ch[i+1];
              break;
            }
            if(i==ch.length-1 && ch1==ch[i])
            {
             f=ch[i-1];
             n=' ';
             break;




            }
         if(ch1==ch[i])
	     {
	      f=ch[i-1];
	      n=ch[i+1];
	      break;
	     }
    }
    System.out.println("Charector--->"+ch1+"\nBefore--->"+f+"\nAfter--->"+n);
  }
}