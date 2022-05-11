package exe6;

public class Retangulo extends Figura {
	private double altura;
	private double base;
	
	
	public Retangulo(double altura, double base) {
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
		Retangulo r1=new Retangulo(3,2);
		System.out.println(r1.toString("R1"));
		System.out.println(r1.getArea(0));
	}
	
}
