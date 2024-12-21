import java.util.*;
import java.io.*;
public class SeperateDataofFIleintoFiles
{
  public static void main(String []args)throws Exception
  {
    FileReader f=new FileReader("C:\\Test\\JavaDemo\\Data.txt");
    FileWriter wd=new FileWriter("c:\\Test\\JavaDemo\\words.txt");
    BufferedWriter bw=new BufferedWriter(wd);
    FileWriter d=new FileWriter("c:\\Test\\JavaDemo\\digit.txt");
    FileWriter sp=new FileWriter("c:\\Test\\JavaDemo\\specialsymbol.txt");
    StringBuffer s=new StringBuffer();
    int data;
    while((data=f.read())!=-1)
    {
		s.append((char)data);
		//s.append(" ");

	}

	  String str[]=s.toString().split(" ");
	d.flush();
    wd.flush();
    sp.flush();
    //digit
	for(int i=0;i<s.length();i++)
	{
       if(s.charAt(i)>='0' && s.charAt(i)<='9')
	    {
	   			d.write(s.charAt(i));
		}
	}
//Special Symbol
    for(int i=0;i<s.length();i++)
	{
       if(!((s.charAt(i)>='0' && s.charAt(i)<='9') || (s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='a' && s.charAt(i)<='z')))
	    {
	   	 sp.write(s.charAt(i));
		}
	}
//Words
	 for(int i=0;i<str.length;i++)
	    {
			wd.write(str[i]+" ");
	    }
	    d.close();
	    wd.close();
	    sp.close();
  }
}

