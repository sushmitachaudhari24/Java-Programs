import java.util.*;
class Ward
{
	 private int wardid;
	 private String wardname;
	 private Voter vt[];

	 public void setWardid(int wid)
	 {
		 wardid=wid;
     }
     public int getwid()
     {
		 return wardid;
     }
     public void setWardName(String wname)
     {
		 wardname=wname;
	 }
	 String getWardname()
	 {
		 return wardname;
	}
  public void setvoter(Voter ...v)
  {
	 vt=v;
  }
  public Voter [] getvoter()
  	{
  		return vt;
	}
}

class Voter
{
   private int vid;
   private String vname;
   private int vage;

     public void setvid(int id)
     {
		 vid=id;
     }
     int getvid()
     {
		 return vid;
     }

     public void setvname(String name)
     {
		 vname=name;
	 }
	 String getvname()
	 {
		 return vname;
	 }

	 public void setage(int age)
	 {
		vage=age;
	}

	int getage()
	{
        return vage;
	}

}

class VotingMachine
{
	private Ward w[];
	private Voter v[];
   int a[]=new int[5];
   int c=0;
	public void steWards(Ward ...w)
	{
	   for(int i=0;i<w.length;i++)
	   {
		   System.out.println("WardId:"+w[i].getwid() +"\tWardName:"+w[i].getWardname());
		   System.out.println("----------------------------------------------------------------------------------");
		   System.out.println("----------------------------------------------------------------------------------");
		   v=w[i].getvoter();
		   System.out.println("VoterId\t\tVoterName\t\tAge");
		   for(int j=0;j<v.length;j++)
		   {
			   System.out.println(v[j].getvid()+"\t\t"+v[j].getvname()+"\t\t"+v[j].getage());
			   a[c]=v[j].getage();
			   c++;
		   }
		   System.out.println("----------------------------------------------------------------------------------");
	   }
	}

	public void showVotingCount()
	{int count=0;

		for(int i=0;i<a.length;i++)
		{
			if(a[i]>18)
			{
				count++;
			}
		}
		System.out.println("Total Voters are :"+count);

	}


}

public class VoterApp
{
	public static void main(String []args)
	{
		//Scanner sc=new Scanner(System.in);

		Voter v=new Voter();
		Ward w=new Ward();
		VotingMachine vm=new VotingMachine();

		w.setWardid(1);
		w.setWardName("Pandurang Nagar");

          v.setvid(2100);
	      v.setvname("Sushmita");
		  v.setage(22);

         Voter v1=new Voter();
           v1.setvid(2002);
		   v1.setvname("radha");
		   v1.setage(29);

    w.setvoter(v,v1);

	    Ward w1=new Ward();

		w1.setWardid(2);
		w1.setWardName("Pandu Nagar");
    Voter vv1=new Voter();
            vv1.setvid(2200);
   		   vv1.setvname("john");
		   vv1.setage(25);

		    Voter vv2=new Voter();
		               vv2.setvid(2300);
		      		   vv2.setvname("john");
		               vv2.setage(20);

		    Voter vv3=new Voter();
		               vv3.setvid(2300);
		      		   vv3.setvname("raha");
		               vv3.setage(19);

		    w1.setvoter(vv1,vv2,vv3);
		vm.steWards(w,w1);
		vm.showVotingCount();
	}
}
