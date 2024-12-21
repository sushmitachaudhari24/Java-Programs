import java.io.*;
public class MergeTwoFiles
{
  public static void main(String []args)throws Exception
  {
    FileReader fr1=new FileReader("C:\\Test\\JavaDemo\\Even.txt");
    FileReader fr2=new FileReader("C:\\Test\\JavaDemo\\Odd.txt");
    FileWriter fw=new FileWriter("C:\\Test\\JavaDemo\\EvenOddWrite.txt",true);
    int data;
    fw.write("1st File");
    while((data=fr1.read())!=-1)
    {
     fw.write((char)data);
    }
    fw.write("2nd file");
     while((data=fr2.read())!=-1)
        {
         fw.write((char)data);
    }
    fr1.close();
    fr2.close();
    fw.close();
  }
}
