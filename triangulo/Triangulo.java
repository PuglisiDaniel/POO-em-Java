package geometrico;


public class Triangulo {
	private int ladoA;//altura
	private int ladoB;//base
	private int ladoC;
	
	public Triangulo(int ladoA, int ladoB, int ladoC) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}

	public int getLadoA() {
		return ladoA;
	}

	public void setLadoA(int ladoA) {
		this.ladoA = ladoA;
	}

	public int getLadoB() {
		return ladoB;
	}

	public void setLadoB(int ladoB) {
		this.ladoB = ladoB;
	}

	public int getLadoC() {
		return ladoC;
	}

	public void setLadoC(int ladoC) {
		this.ladoC = ladoC;
	}
	

	
	public String area(){
		
		int res= (ladoA * ladoB) /2;
		
		return "Area do triangulo: "+res;
	}
	public String mostra() {
		return  "Lado A do tringulo:" +ladoA
				+"\nLado B do triangulo:" +ladoB
				+"\nLado C do triangulo:" +ladoC;
	}
	
	public static void main(String[] args) {
	
		Triangulo t1 = new Triangulo(5,4,7);
		System.out.println(t1.mostra());
		
		System.out.println(t1.area());
		
		
	}
	
	

}


