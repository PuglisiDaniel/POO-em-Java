package geometrico;

public class Contador {
	public int cont;

	public Contador(int cont) {
		this.cont = cont;
	}
	
	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}

	public String atual() {
		return "o valor atual do contador eh: " +cont;
	}
	
	public int add1() {
		return cont++;
	}
	
	public int addP(int x) {
		return cont=cont+x;
	}
	
	
	public int del1() {
		return cont--;
	}
	
	public int delP(int x) {
		return cont=cont-x;
	}
	
	
	public static void main(String args[]) {
		
		Contador cont1= new Contador(0);
		System.out.println(cont1.atual());
		cont1.add1();
		cont1.add1();
		cont1.add1();
		System.out.println(cont1.atual());
		cont1.addP(4);
		System.out.println(cont1.atual());
		cont1.del1();
		System.out.println(cont1.atual());
		cont1.delP(6);
		System.out.println(cont1.atual());
		
	}
}
