package geometrico;

public class Quadrado {
	private double lado;

	
	
	public Quadrado(double lado) {
		this.lado = lado;
	}


	
	public void show() {
		System.out.printf("%.2f\n", lado);
	}
	

	
	public double area() {
		return lado * 2;
		
	}

	public void aumentar() {
		lado=lado+0.1;
		
	}
	
	public static void soma(double[] y) {
		double result=0;
		
		for(int i=0;i<10;i++) {
			result = result + y[i];
		}
		
		System.out.printf("\nA soma das areas eh: %.2f\n", result);
		
	}
	
	public static void main(String args[]) {
		
		Quadrado q[];
		q=new Quadrado[10];
		
		for(int i=0;i<10;i++) {
			
			q[i] = new Quadrado(Math.random());
		}
		

	
		System.out.printf("Area 1º quadrado = %.2f\n\n",  q[0].area());
		
		
		double espaco[]=new double[10];
		
		
		for(int i=0;i<10;i++) {
			espaco[i] = q[i].area();
			
		}
		
		for(int i=0;i<10;i++) {
			System.out.printf("Area do quadrado %d eh: %.2f\n", i+1, espaco[i]);
			
		}
		
		soma(espaco);
		
		q[0].aumentar();//aumentar area do primeiro quadrado
		
		System.out.printf("\nArea 1º quadrado = %.2f\n",  q[0].area());
		
		soma(espaco);
		
	}
}
