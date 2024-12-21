import java.util.*;
class Per
{
     int per,total;
     void calper(int s[])
    {
         for(int i=0;i<s.length;i++)
         {
         total=total+s[i];
         }
         per=total/(s.length);

    }
}
class CSE extends Per
{
      int i;
      String n,a,y;
        CSE(String name,int id,String Add,String Year)
        {
             i=id;
             n=name;
             a=Add;
             y=Year;

        }
          void showCSEPer()
          {
              System.out.println(i+" "+n+" "+a+" "+y+" "+per);
		  }

}
class ETC extends Per
{
     int i;
      String n,a,y;
     ETC(String name,int id,String Add,String Year)
        {
             i=id;
             n=name;
             a=Add;
             y=Year;
        }
        void showETCPer()
        {
           System.out.println(i+" "+n+" "+a+" "+y+" "+per);
		}
}

public class ResultApp
{
   public static void main(String []args)
   {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[6];
         int id;
         String name,add,year;
		System.out.println("=====================================\nChoose here Your Option\n=====================================\n1.CSE\n2.ETC");
		 System.out.println("Enter Id ,Name, Address and Year");
		int ch=sc.nextInt();
         id=sc.nextInt();
         name=sc.next();
         add=sc.next();
         year=sc.next();
          System.out.println("Enter Marks of 6 Subject:");
		  				        for(int i=0;i<a.length;i++)
		  				        {
		  				          a[i]=sc.nextInt();
						        }


		switch(ch)
		{
             case 1:

                    CSE c=new CSE(name,id,add,year);
                    c.calper(a);
		            c.showCSEPer();
		            break;


		     case 2:
                    ETC e=new ETC(name,id,add,year);
		            e.calper(a);
		            e.showETCPer();
		            break;
		     default:System.out.println("You have Entered Wrong choice!!!!");
		}
   }
}