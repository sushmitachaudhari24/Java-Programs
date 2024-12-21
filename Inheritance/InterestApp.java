import java.util.*;
class Interest
{
  int time,pamt,rate;
    void setPRD(int pamt,int rate,int time)
    {
        this.pamt=pamt;
        this.rate=rate;
        this.time=time;
    }
}
class CalculateInterest extends Interest
{
  void calInterest()
  {
    float SI=(float)((pamt*rate*time)/100);

    System.out.println("GIVEN:\nPrinciple : "+pamt+"\nRateOfInterest : "+rate+"\nTime : "+time+"\nSimple Interest is: "+SI);
  }
}
public class InterestApp
{
  public static void main(String []args)
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter PrincipleAmount ,Rate of Interest, Time:");
     int pamt=sc.nextInt();
     int rate=sc.nextInt();
     int time=sc.nextInt();
     CalculateInterest c=new CalculateInterest();
     c.setPRD(pamt,rate,time);
     c.calInterest();
  }
}