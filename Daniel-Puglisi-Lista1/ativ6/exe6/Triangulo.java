package exe6;

public class Triangulo extends Figura{
	private double ladoA;//altura
	private double ladoB;//base
	private double ladoC;
	
	
	
	public Triangulo(double ladoA, double ladoB, double ladoC) {
		super();
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}

	
	
	@Override
	public double getArea(double a) {
		a=(ladoA*ladoB)/2;
		return super.getArea(a);
	}



	@Override
	public String toString(String name) {
		return super.toString(name);
	}



	public static void main(String[] args) {
		Triangulo t1=new Triangulo(3,8,2);
		System.out.println(t1.toString("T1"));
		System.out.println(t1.getArea(0));
	}

}
