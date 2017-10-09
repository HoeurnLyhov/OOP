package Oriented;

class Myoriented{
	int z;
	public void Addition(int x,int y){
		z = x + y;
		System.out.println("The addition is "+ z);
	}
/*	public void Substraction(int x,int y){
		z = x - y;
		System.out.println("The substraction is "+ z);
	}
*/
}

public class OrientedTest extends Myoriented{
	int z;
	public void Multiply(int x,int y){
		z = x * y;
		System.out.println("The Multiply is "+z);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 20;
		OrientedTest e = new OrientedTest();
		Myoriented s = new Myoriented();
		s.Addition(a,b);
//		s.Multiply(a,b);
		e.Addition(a,b);
		e.Multiply(a,b);
		

	}

}
