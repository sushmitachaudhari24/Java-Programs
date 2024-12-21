import java.io.*;
public class GetDrive
{
   public static void main(String [] args)
   {
     File f[]=File.listRoots();
     for(int i=0;i<f.length;i++)
     {
		 long ts=f[i].getTotalSpace();
		 long fs=f[i].getFreeSpace();
		 System.out.println(f[i]+" Total Space \t"+(ts/1073741824)+" Gb\nFree Space\t"+(   fs/1073741824)+"GB\nUsed Space\t"+((ts-fs)/1073741824)+"GB");
	 }
   }
}