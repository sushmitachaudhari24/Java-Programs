class Cube implements Cloneable {
		private int no;

		public void setNo(int no) {
			this.no = no;
		}

		public void showCube() {
			System.out.printf("Cube is %d\n", no * no * no);
		}
		public Cube getClone() throws CloneNotSupportedException{
			Object obj=this.clone();
			Cube c=(Cube)obj;
			return c;
		}
	}
	public class CloneApp
	{
	  public static void main(String []args)throws Exception
	  {
	   Cube c1 =new Cube();
	   c1.setNo(10);
	   Cube c2=c1.getClone();
	   c2.setNo(5);
	   c1.showCube();
	   System.out.println("c1...."+System.identityHashCode(c1));
	     System.out.println("c2...."+System.identityHashCode(c2));
	  }
	}
