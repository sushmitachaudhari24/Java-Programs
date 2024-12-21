import java.util.*;
public class StringApp
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String");
    String str=sc.nextLine();

    System.out.println("Choose from below \n1.Reverse a String \n2.Inserting Charectors \n3.Appending String\n4.Deleting Charectors from String\n5.Replace a substring\n6.Check cpacity,Ensure cpacity of string Buffer Class\n\nENTER..");
    int choice=sc.nextInt();
    switch(choice)
    {
      case 1:
           char ch[]=str.toCharArray();
           for(int i=0,j=ch.length-1;i<ch.length/2;i++,j--)
           {
			   char c=ch[i];
			   ch[i]=ch[j];
			   ch[j]=c;
		   }
         System.out.println("Reverse String is "+String.valueOf(ch));
         break;

      case 2:
            char ch1[]=str.toCharArray();
                int str1=ch1.length;
              char ch2[]=new char[str1+1];
            System.out.println("Enter index ond charector to insert");
            int ind=sc.nextInt();
            char chs=sc.next().charAt(0);
            for(int i=0;i<ind;i++)
            {
			   ch2[i]=ch1[i];
			}
             ch2[ind]=chs;
            for(int i=ind;i<str1;i++)
            {
				ch2[i+1]=ch1[i];
			}

			System.out.println("Inserted char String is  "+String.valueOf(ch2)+" ");
			break;
	   case 3:
	   System.out.println("Enter String 2");
	     String str2=sc.next();
	     String str3=str+str2;
	     System.out.println("Append string is..."+str3);
	     break;

	   case 4:
	        System.out.println("Enter charector to delete  from string");
	        char sch=sc.next().charAt(0);
	        char chr[]=str.toCharArray();
	        int index=-1;
	        for(int i=0;i<chr.length;i++)
	        {   if(sch==chr[i])
	             {
					for(int j=i+1;j<chr.length;j++)
					{
						 if(chr[i]==chr[j])
						 {
							 chr[j]='*';
						 }
					}
			     }
			}
			int c1=0;
			for(int i=0;i<chr.length;i++)
			{
				if(chr[i]==sch)
				{
					c1++;
					for(int k=i;k<chr.length-1;k++)
					{
						chr[k]=chr[k+1];
					}
				}
			}
			chr[chr.length-1]=' ';
			if(c1==0)
			{
				System.out.println("Data not found");
				for(int i=0;i<chr.length;i++)
				{
					System.out.println("="+chr[i]);
				}
			}
			else
			{
				String s2=null;
				System.out.println("Data found");
				System.out.println("String is "+String.valueOf(chr));
			}
			break;

	  case 5:
             System.out.println("Enter String to search  and string to replace");
             String ss=sc.next();
             String srep=sc.next();
             int sindex=str.indexOf(ss);
             String leftstr="",rightstr="";
             for(int i=0;i<str.length();i++)
             {
				 if(i<sindex)
				 {
					 leftstr=leftstr+(str.charAt(i));
				 }
				 if(i>=(sindex+ss.length()))
				 {
					 rightstr=rightstr+(str.charAt(i));
				 }

			 }
			 str="";
			 str=leftstr+srep+rightstr;
			 System.out.println("left "+leftstr+"\n right "+rightstr);
			 System.out.println("new String After Replace is..."+(str));
			 break;

	 case 6:
           StringBuffer sb=new StringBuffer(str);
           int count=0;
            System.out.println("Capacity of string buffer class is "+sb.capacity()+"\nBefore Ensure Capacity"+sb.capacity());
          sb.ensureCapacity(20);
          System.out.println("After Ensure Capacity "+sb.capacity());
          break;

     default:System.out.println("Sorry!! You have Enter wrong choice");

    }

  }
}