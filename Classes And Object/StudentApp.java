 import java.util.*;
class Student
{
   private int id;
   private String name;
   private int m[];

   public void setId(int id)
   {
    this.id=id;
   }
   public int getId()
   {
    return id;
   }
   public void setName(String name)
   {
     this.name=name;
   }
   public String getName()
   {
     return name;
   }
   public void setMarks(int marks[])
   {
      m=marks;
   }
   public int [] getMarks()
   {
     return m;
   }

}
class FindPer
{
  private Student s;
  int m[];
  public void setStudent( Student stud)
  {
     s=stud;
  }
  public void ShowStudent()
  {
     m=s.getMarks();
    System.out.println(s.getId()+"\t"+s.getName());
    for(int i=0;i<m.length;i++)
    { System.out.print(m[i]+" ");
    }
  }

  public void getPer()
  {
	  int sum=0;
	  for(int i=0;i<m.length;i++)
	  {
         sum=sum+m[i];
 	  }
 	  int per=sum/6;
 	  System.out.println("Percentage"+per);
  }

}
public class StudentApp
{
   public static void main(String []args)
   {
      Student p=new Student();
	         FindPer f=new FindPer();
	         int a[]=new int[6];
	         Scanner sc=new Scanner(System.in);
	         System.out.println("Enter array Elements");
	         for(int i=0;i<a.length;i++)
	         {
               a[i]=sc.nextInt();
			 }
	         p.setId(1);
	         p.setName("ABDS");
	         p.setMarks(a);
	         f.setStudent(p);
        f.ShowStudent();
        f.getPer();
   }
}