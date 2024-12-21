import java.util.*;

class Employee{
	
int id,tothr,otime,sal;
String name;

public void setId(int id){
	this.id=id;
}

int getId(){
	return id;
}

public void setTothr(int tothr)
{
	this.tothr=tothr;
}

public int getTothr(){
	return tothr;
}

public void setOtime(int otime)
{
	this.otime=otime;
}

public int getOtime()
{
	return otime;
}

public void setSal(int sal)
{
	this.sal=sal;
}

public int getSal(){
	return sal;
}

public void setName(String name)
{
	this.name=name;
}

public String getName(){
	return name;
	

}
	
	

	
}

class Overtime {
	Employee ee[];
	public void setEmployee(Employee emp[])
	{
		ee=emp;
	
	System.out.println("All Employees Data ");
	System.out.println("Emp_ID\t\tEmp_Name\t\tTot_hrs\t\tOver_time\t\tSalary");
	System.out.println("======================================================================================================");
		for(int i=0;i<ee.length;i++)
		{
		System.out.println(ee[i].getId()+"\t\t"+ee[i].getName()+"\t\t\t"+ee[i].getTothr()+"\t\t\t"+ee[i].getOtime()+"\t\t"+ee[i].getSal());
		System.out.println("__________________________________________________________________________________________________");
		}
	}

	public void calovertime(){
	
		int tot=0,g_tot,rot=0;
	System.out.println("All Employees Data After Adding Overtime Salary ");
	System.out.println("Emp_ID\t\tEmp_Name\t\tTot_hrs\t\tOver_time\tSalary\t\tOt_Salary\tRemain_OT\tG_Salary");
	System.out.println("=========================================================================================================================================");
		for(int i=0;i<ee.length;i++)
		{
			tot=0;
			g_tot=0;
			
			if((ee[i].getTothr() + ee[i].getOtime()) >=40)
			{
				tot=(ee[i].getTothr() + ee[i].getOtime())-40;
				rot=50 * tot;
				g_tot=rot + ee[i].getSal();
			
			}
			System.out.println(ee[i].getId()+"\t\t"+ee[i].getName()+"\t\t\t"+ee[i].getTothr()+"\t\t"+ee[i].getOtime()+"\t\t"+ee[i].getSal()+"\t\t"+tot+"\t\t"+rot+"\t"+g_tot);
		System.out.println("______________________________________________________________________________________________________________________________________");
		}
	
	}
}

public class EmployeeOvertimeApp{
public static void main (String x[])
{
Scanner s1=new Scanner(System.in);

Employee e[]=new Employee[5];

int i;
	for(i=0;i<e.length;i++)
	{
	
	e[i]=new Employee();
	
	int eid,ethr,eotm,esal;
	String nm;
	
	System.out.println("enter the Employee Id,Total hours , Over time , Salary and Name :");
	eid=s1.nextInt();
	ethr=s1.nextInt();
	eotm=s1.nextInt();
	esal=s1.nextInt();
	s1.nextLine();
	nm=s1.nextLine();
	
	e[i].setId(eid);
	e[i].setTothr(ethr);
	e[i].setOtime(eotm);
	e[i].setSal(esal);
	e[i].setName(nm);
	}

Overtime o=new Overtime();
o.setEmployee(e);
o.calovertime();


}
}
