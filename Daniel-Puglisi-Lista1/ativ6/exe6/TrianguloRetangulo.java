package exe6;

public class TrianguloRetangulo extends Triangulo {

	public TrianguloRetangulo(double ladoA, double ladoB, double ladoC) {
		super(ladoA, ladoB, ladoC);
		
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
		TrianguloRetangulo tr1=new TrianguloRetangulo(6,8,3);
		System.out.println(tr1.toString());
		System.out.println(tr1.getArea(0));
	}

}
