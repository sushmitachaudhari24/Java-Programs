class ArrSum
{int a[];
  void setValue(int arr[])
  {
   a=arr;
  }
}
class GetSum extends ArrSum
{
  int getArrSum()
  {int sum=0;
    for(int i=0;i<a.length;i++)
    {
     sum=sum+a[i];
    }
    return sum;
  }
}
public class ArrSumApp
{
 public static void main(String [] args)
 {
  GetSum g= new GetSum();
  g.setValue(new int[]{10,20,30,40,50});
  System.out.println("Sum of array "+g.getArrSum());
  }
}
