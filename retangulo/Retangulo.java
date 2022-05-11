package geometrico;

public class Retangulo {
	private int base;
	private int altura;
	
	
	public Retangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public String area() {
		int res=base*altura;
		
		return "Area do retangulo: "+res;
	}
	public String perimetro() {
		int res=2*(base+altura);
		
		return "Perimetro do retangulo: "+res;
	}
	
	public String relacao() {
		return "A relacao entre base e altura do retangulo eh a area";
	}
	public String quadrado() {
		if(base==altura) {
			return "Eh um quadrado";
		}
		else {
			return "Nao eh um quadrado";
		}
	}
	
	public String imprime() {
		return "Base: "+base
				+"\nAltura: "+altura;
		
	}
	
	
	public static void main(String args[]) {
		
		Retangulo r1= new Retangulo(5,5);
		
		System.out.println(r1.imprime());
		System.out.println(r1.area());
		System.out.println(r1.perimetro());
		System.out.println(r1.quadrado());
		System.out.println(r1.relacao());
		
	}
}
