import java.io.*;
public class CompareTwoFiles
{
  public static void main(String []args)throws Exception
  {
    FileReader fr1=new FileReader("C:\\Test\\JavaDemo\\Even.txt");
    FileReader fr2=new FileReader("c:\\Test\\JavaDemo\\Odd.txt");
    int data1,data2;
    String str1="",str2="";
    while((data1=fr1.read())!=-1)
    {
     str1=""+((char)data1);
    }
     while((data2=fr2.read())!=-1)
        {
         str2=""+((char)data2);
        }

        if((str1.compareTo(str2))==0)
        {
          System.out.println("Files Are Equal");
        }
        else
        {
			System.out.println("Files Are Not Equals");
		}
		fr1.close();
		fr2.close();
  }
}