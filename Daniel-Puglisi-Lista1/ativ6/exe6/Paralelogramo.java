package exe6;

public class Paralelogramo extends Figura {
	private double altura;
	private double base;
	
	
	
	

	public Paralelogramo(double altura, double base) {
		super();
		this.altura = altura;
		this.base = base;
	}





	@Override
	public double getArea(double a) {
		a=base*altura;
		return super.getArea(a);
	}





	@Override
	public String toString(String name) {
		
		return super.toString(name);
	}





	public static void main(String[] args) {
		Paralelogramo p1=new Paralelogramo(2,2);
		System.out.println(p1.toString("P1"));
		System.out.println(p1.getArea(0));
	}
}
