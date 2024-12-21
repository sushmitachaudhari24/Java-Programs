import java .io.*;
public class PrintDriveSpace
{
  public static void main(String []args)
  {
   File f[]=File.listRoots();
   System.out.println("Drives\tTotal Space\tFree Space\tOccupied Space");
   for(int i=0;i<f.length;i++)
   {
     long totalspace=f[i].getTotalSpace();
     long freespace=f[i].getFreeSpace();
     long tsp=totalspace/1073741824;
     long fsp=freespace/1073741824;
     long osp=tsp-fsp;
     System.out.println(f[i]+"\t\t"+tsp+"GB\t\t"+fsp+"GB\t\t"+osp);
   }
  }
}