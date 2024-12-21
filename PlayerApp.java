import java.util.*;
class Player
{
   int jno;
  String name;
  int run;
  int matches;
    public void setid(int jno)//store id
    {
     this.jno=jno;
    }
    public int getid()//return id
    {
     return jno;
    }
    public void setname(String name)//storename
    {
     this.name=name;
    }
    public String getname()//getname
    {
     return name;
    }
    public void setrun(int run)//store run
    {
      this.run=run;
    }
    public int getrun()//return run
    {
     return run;
    }
    public void setmatch(int match)//store matches
    {
     this.matches=match;
    }
    public int getmatch()
    {
     return matches;
    }
}
public class PlayerApp
{
   public static void main(String []args)
   {
     Scanner sc=new Scanner(System.in);
     Player p[]=new Player[3];//array of player
     Player t;
     System.out.println(" Enter 5 Records of Player");
     for(int i=0;i<p.length;i++)//get input data for using array of object and passing to class through setter mathod
     {
       p[i]=new Player();// object memory for each position
       System.out.println("Enter JurseyNo Player Name Run Matches");
        int jid=sc.nextInt();
        p[i].setid(jid);
        String name=sc.next();
        p[i].setname(name);
        int run=sc.nextInt();
        p[i].setrun(run);
        int match=sc.nextInt();
        p[i].setmatch(match);
     }
     System.out.println("1.Display\n2.Delete \nEnter your choice");
     int ch=sc.nextInt();
     switch(ch)                     // switch case for choice of operation
     {
       case 1: System.out.println("Records of Players is\n JersyId\t\tPlayerName\t\tRun_Record\t\t Matches");
       for(int i=0;i<p.length;i++)
       {
         System.out.println((i+1)+"."+p[i].getid()+"\t\t"+p[i].getname()+"\t\t"+p[i].getrun()+"\t\t"+p[i].getmatch());
       }break;
       case 2:System.out.println("Enter a Id to delete Record");
              int did=sc.nextInt();
                  boolean bl=true;
                  int c=0;
              for(int i=0;i<p.length;i++)
              {
				   if((p[i].getid())==did)
				   {
					   //  p[i]=p[i+1];
					    for(int k=i;k<p.length-1;k++)
					    {
							 p[k]=p[k+1];
						}
					     c++;
					     bl=true;
					     break;
				   }
                    else
                    {
						bl=false;
					}
			  }
			  if(bl==false)
			  {System.out.println("Not Found");}
			  else
              {



				  System.out.println("Records of Players  in ascending order is\n JersyId\t\tPlayerName\t\tRun_Record\t\t Matches");
			         for(int i=0;i<p.length-c;i++)//ascending sorting using matches record
			         {
						 for(int j=i+1;j<p.length-c;j++)
						 {
							 if(p[i].getmatch() > p[j].getmatch())
							 {
                               t=p[i];
                               p[i]=p[j];
                               p[j]=t;
							 }
						 }
                     }
                      for(int i=0;i<p.length-c;i++)
			         {
                        System.out.println((i+1)+"."+p[i].getid()+"\t\t"+p[i].getname()+"\t\t"+p[i].getrun()+"\t\t"+p[i].getmatch());
				     }
               }      break;

   // case 3: System.out.println("Records by Ascending order matches");
       default:System.out.println("Invalid Choice!!!");
     }

   }
}