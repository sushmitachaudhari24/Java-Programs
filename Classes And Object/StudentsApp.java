import java.util.*;
class Student
{
 private int rollno;
 private int per;
 private String sname;

 public void setid(int rno)
 {
  rollno=rno;
 }
 public int getid()
 {
  return rollno;
 }
 public void setname(String name)
 {
  sname=name;
 }
 public String getname()
 {
 return sname;
 }
 public void setper(int p)
 {
  per=p;
 }
 public int getper()
 {
 return per;
 }
}

public class StudentsApp
{
   public static void main(String []args)
   {

        Student s[]=new Student[3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<s.length;i++)
        {
         s[i]=new Student();
          System.out.println("Enter Roll no, name,Percentage");
          int rno=sc.nextInt();
          String name=sc.next();
          int per=sc.nextInt();
          s[i].setid(rno);
          s[i].setname(name);
          s[i].setper(per);
        }
        System.out.println("---------------------------------------------------------\n\tRecords Are\n---------------------------------------------------------");
         System.out.println("Roll_No\tName\tPercentage");
        for(int i=0;i<s.length;i++)
        {
          System.out.println(s[i].getid()+"\t"+s[i].getname()+"\t"+s[i].getper());
		}
            System.out.println("---------------------------------------------------------");
            System.out.println("\tEnter Student_RollNo to Search Record");
            int sid=sc.nextInt();
            Boolean f=true;
            for(int i=0;i<s.length;i++)
            {
				 if(sid==s[i].getid())
				 {
					   System.out.println(s[i].getid()+"\t"+s[i].getname()+"\t"+s[i].getper());
				 }
				 else{
					 f=false;
				 }
			}
			System.out.println("---------------------------------------------------------");
			if(f==false)
			{
              System.out.println("Student Record Not Found");
			}
   }
}