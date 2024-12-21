import java.io.*;
public class CreateFolder
{
  public static void main(String []args)
  {
    File f=new File("C:\\Test\\JavaDemo");
  //  boolean b=f.mkdir(); //This statemante make folder
    boolean be=f.exists();
    if(be)
    {
     System.out.println("Folder Exist");
    }
    else
    {
         boolean b=f.mkdir(); //This statemante make folder
	       if(b)
	       {
	        System.out.println("Folder Created");
	       }
	       else
	       {
	        System.out.println("Something Wrong");
    }
    }
  }
}