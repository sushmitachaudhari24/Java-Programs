import java.util.*;
public class StringAnagram
{
 public static void main(String []args)
 {
   Scanner sc=new Scanner(System.in);
 System.out.println("Enter two Strings");
 String s1=sc.next();
 String s2=sc.next();
 char ch1[]=s1.toCharArray();
 char ch2[]=s2.toCharArray();
 char t=' ';
 for(int i=0;i<ch1.length;i++)
 {
   for(int j=0;j<ch1.length;j++)
   {
     if(ch1[i]<ch1[j])
     {
      t=ch1[i];
      ch1[i]=ch1[j];
      ch1[j]=t;
     }
   }
 }
 System.out.println("String 1 "+String.valueOf(ch1));

for(int i=0;i<ch2.length;i++)
 {
   for(int j=0;j<ch2.length;j++)
   {
     if(ch2[i]<ch2[j])
     {
      t=ch2[i];
      ch2[i]=ch2[j];
      ch2[j]=t;
     }
   }
 }
 System.out.println("String 2 "+String.valueOf(ch2));

boolean b=false;
     if(ch1.length!=ch2.length)
     {
		 b=false;
	 }
	 else{
	  for(int i=0;i<ch1.length;i++)
	  {

			  if(ch1[i]!=ch2[i])
			  {
				 b=false;
				 break;
			  }
			  else
			  {b=true;
			  }

	  }

}
   if(b==false)
   System.out.println("Strings are not Anagram");
   else
    System.out.println("Strings are Anagram");

 }
}