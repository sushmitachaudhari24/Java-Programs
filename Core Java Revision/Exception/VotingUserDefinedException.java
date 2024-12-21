import java.util.*;
class VoterException extends ArithmeticException
{   public String getErrorMessage()
	{
		return"you are not eligible for voting ";
	}
}
class VotingMachine
{      void verifyAge(int age)
	{      if(age<18)
		{         VoterException ve = new VoterException();
			throw ve;
		}
		else {
			System.out.println("you are eligible voter ");
		}
	}
}
public class VotingException
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