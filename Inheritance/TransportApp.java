import java.util.*;
class Vehicle
{
	protected String vmodel;
	protected String rnum;
	protected float speed;
	protected int fcapacity;
	protected int fconsume;
	protected int distance;
	protected float fneeded;

	  Vehicle(String vmodel,String rnum,int fcapacity,int fconsume)
	  {
         this.vmodel=vmodel;
         this.rnum=rnum;
         this.fcapacity=fcapacity;
         this.fconsume=fconsume;
	  }
	  void FuelNeeded(int distance)
	  {
          this.distance=distance;
          fneeded=(float)(fconsume/distance);
	  }
	  void distanceCovered(int time)
	  {
		  speed=(float)(distance/time);
	  }
	  void Display()
	  {
            System.out.println("Vehical Model: "+vmodel+"\nRegister Num: "+rnum+"\nSpeed :"+speed+"\nFuel Capacity: "+fcapacity+"\nFuel Needed:"+fneeded+"\nFuel Consumumtion: "+fconsume+"\nDistance: "+distance);

	  }
}
class Truck extends Vehicle
{
	int cargoWeightLimit;
	Truck(String vmodel,String rnum,int fcapacity,int fconsume,int cwl)
	{
		super(vmodel,rnum,fcapacity,fconsume);
		cargoWeightLimit=cwl;
	}
	void Display()
	{
		super.Display();
		System.out.println("Weight Limit :"+cargoWeightLimit);
	}
}
class Bus extends Vehicle
{
	int nop;
	Bus(String vmodel,String rnum,int fcapacity,int fconsume,int nop)
	{
		super(vmodel,rnum,fcapacity,fconsume);
		this.nop=nop;
	}
	void Display()
	{
		super.Display();
		System.out.println("Number of Passenger: "+nop);
	}
}
public class TransportApp
{
   public static void main(String []args)
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter Vehicle Model ,RegisterNumber ,Fuel Capacity,Fuel Consumtion and Distance and time");
	   String vmodel=sc.next();
	   String rnum=sc.next();
	   int fcapacity=sc.nextInt();
	   int fconsume=sc.nextInt();
	   int distance=sc.nextInt();
	   int time=sc.nextInt();

	   System.out.println("============================\nChoose Vehicals From below\n============================\n1.Truck\n2.Bus");
         int ch=sc.nextInt();
         switch(ch)
         {
			 case 1: System.out.println("Enter CargoWeightLimit");
			        int cwl=sc.nextInt();

			     Truck t=new Truck(vmodel,rnum,fcapacity,fconsume,cwl);
			      t.FuelNeeded(distance);
			      t.distanceCovered(time);
			      t.Display();
			     break;
			 case 2: System.out.println("Enter No of Passengers");
			        int nop=sc.nextInt();

			     Bus b=new Bus(vmodel,rnum,fcapacity,fconsume,nop);
			      b.FuelNeeded(distance);
			      b.distanceCovered(time);
			     b.Display();
			     break;
			 default:System.out.println("Invalid Choice !!!");
		 }
   }
}