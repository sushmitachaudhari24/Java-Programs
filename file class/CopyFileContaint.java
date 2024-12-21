import java.io.*;
public class CopyFileContaint
{
  public static void main(String []args)throws Exception
  {
     FileReader fr1=new FileReader("C:\\Test\\JavaDemo\\Even.txt");
        FileWriter fw2=new FileWriter("c:\\Test\\JavaDemo\\EvenCopy.txt",true);
        int data1;

        while((data1=fr1.read())!=-1)
        {
         fw2.write((char)data1);

        }

        fw2.close();
        fr1.close();
  }
}