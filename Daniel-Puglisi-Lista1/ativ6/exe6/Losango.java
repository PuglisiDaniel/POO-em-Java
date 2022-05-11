package exe6;

public class Losango extends Paralelogramo{

	public Losango(double altura, double base) {
		super(altura, base);
		
	}



	@Override
	public double getArea(double a) {
		
		return super.getArea(a);
	}




	@Override
	public String toString(String name) {

		return super.toString(name);
	}



	public static void main(String[] args) {
		Losango l1=new Losango(5,8);
		System.out.println(l1.toString("L1"));
		System.out.println(l1.getArea(0));
	}

}