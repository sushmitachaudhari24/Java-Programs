import java.io.*;
public class ReadDigitandSaperate
{
  public static void main(String []args) throws Exception
  {
    FileReader fr=new FileReader("C:\\Test\\JavaDemo\\abc.txt");
    FileWriter ev=new FileWriter("C:\\Test\\JavaDemo\\Even.txt",true);
    BufferedWriter evbw=new BufferedWriter(ev);
    FileWriter od=new FileWriter("C:\\Test\\JavaDemo\\Odd.txt",true);
    BufferedWriter odbw=new BufferedWriter(od);
    FileWriter prm=new FileWriter("C:\\Test\\JavaDemo\\Prime.txt",true);
    BufferedWriter prmbw=new BufferedWriter(prm);
        StringBuffer sb=new StringBuffer();
    int data;

    while((data=fr.read())!=-1)
    {
        sb.append((char)data);
    }
  	System.out.println("Total String  "+sb);
  evbw.write("Even Numbers ");
odbw.write("Odd Numbers ");
prmbw.write("Prime Numbers ");

    int num=0;
    for(int i=0;i<sb.length();i++)
    {
		if(sb.charAt(i)>='0' && sb.charAt(i)<='9')
		{
			num=num*10+(sb.charAt(i)-48);
		}
		else
		{
			if(num!=0)
			{
				if(num%2==0)
				{
					System.out.println("Number is even "+num);
					evbw.newLine();
					evbw.write(String.valueOf(" "+num));
				}
				if(num%2!=0)
				{
					System.out.println("Number is odd "+num);
					 odbw.newLine();
					odbw.write(String.valueOf(" "+num));
				}
				if(num!=0)
				{
					  int count=0;
					   for(int k=1;k<=num;k++)
					   {
					    if(num%k==0)
					    {
					    count++;
					    }
					   }
					   if(count==2)
					   {
					     System.out.println("Number is Prime "+num);
					       prmbw.newLine();
					     prmbw.write(String.valueOf(" "+num));

                       }
				}
			}
           num=0;
		}
	}
	  evbw.close();
	    odbw.close();
    prmbw.close();
	ev.close();
	od.close();
	prm.close();

  }
}
