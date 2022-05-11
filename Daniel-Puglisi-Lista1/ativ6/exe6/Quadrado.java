package exe6;

public class Quadrado extends Retangulo {

	public Quadrado(double altura, double base) {
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
		Quadrado q1=new Quadrado(3,8);
		System.out.println(q1.toString("Q1"));
		System.out.println(q1.getArea(0));
	}
}
