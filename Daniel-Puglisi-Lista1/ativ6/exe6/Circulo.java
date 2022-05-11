package exe6;

public class Circulo extends Figura{
	private double raio;
	

	public Circulo(double raio) {
		this.raio = raio;
	}

	
	@Override
	public double getArea(double a) {
		
		return super.getArea(Math.PI*Math.pow(a, 2));
	}


	@Override
	public String toString(String name) {
		return super.toString(name);
	}


	public static void main(String[] args) {
		Circulo c1=new Circulo(4);
		System.out.println(c1.toString("C1"));
		System.out.println(c1.getArea(c1.raio));
	}
}
