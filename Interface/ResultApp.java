import java.util.*;
interface Per
{
  void calPer(int s[]);
}
class CSE implements Per
{
   int id;
   String name;
  CSE(int id,String name)
  {
   this.id=id;
   this.name=name;
  }
  public void calPer(int m[])
   {
       int total=0;
       for(int i=0;i<m.length;i++)
       {
        total=total+m[i];
       }
       System.out.println("Stud_Id : "+id+"\nStud_Name : "+name+"\nTotalMarks : "+total+"\nPercentage : "+(total/m.length));
   }
}
class ETC implements Per
{
   int id;
   String name;
  ETC(int id,String name)
  {
    this.id=id;
    this.name=name;
  }
  public void calPer(int m[])
     { int total=0;
        for(int i=0;i<m.length;i++)
          {
               total=total+m[i];
          }
            System.out.println("Stud_Id : "+id+"\nStud_Name : "+name+"\nTotalMarks : "+total+"\nPercentage : "+(total/m.length));
     }
}
public class ResultApp
{
 public static void main(String []args)
 {
    Scanner sc=new Scanner(System.in);
    System.out.println("Choose from Below\n==================\n1.CSE\n2.ETC\n==================\n...Enter...");
    int ch=sc.nextInt();
    int a[]=new int[6];
    System.out.println("Enter Id ,Name ,Five Subject Marks");
     int id=sc.nextInt();
     String name=sc.next();
     for(int i=0;i<a.length;i++)
     {
		 a[i]=sc.nextInt();
	 }
    switch(ch)
    {
     case 1:Per c=new CSE(id,name);
             c.calPer(a);
             break;
     case 2:Per e=new ETC(id,name);
             e.calPer(a);
             break;
     default:System.out.println("You have Entered Wrong Choice");
    }
 }
}