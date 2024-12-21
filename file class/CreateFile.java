import java.io.*;
public class CreateFile
{
  public static void main(String []args) throws IOException
  {
    File f=new File("C:\\Test\\JavaDemo\\abc.txt");
    boolean b=f.createNewFile();
    if(b)
    {
     System.out.println("File Created SuccessFully");
    }
    else
    {
     System.out.println("Some problem is there...");
    }
  }
}