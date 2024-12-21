import java.util.*;
class VoterException extends Exception
{   public String getErrorMessage()
	{
		return"you are not eligible for voting ";
	}
}
class VotingMachine
{      void verifyAge(int age)
	{      if(age<18)
		{         VoterException e = new VoterException();
			throw e;
		}
		else {
			System.out.println("you are eligible voter ");
		}
	}
}
public class Sample
{      public static void main(String x[])
	{        try{
			VotingMachine vm = new VotingMachine();
			vm.verifyAge(10);
		}
	  catch(VoterException ex)
	  {
		  System.out.println("Error :"+ex.getErrorMessage());
	  }

   }
}