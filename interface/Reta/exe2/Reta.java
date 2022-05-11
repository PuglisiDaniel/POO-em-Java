package exe2;

public class Reta implements Relacao {
	private int pontoA;
	private int pontoB;
	private int tam;
	
	public Reta(int pontoA, int pontoB) {
		this.pontoA = pontoA;
		this.pontoB = pontoB;
		tam=pontoB-pontoA;
	}
	
	
	public int getPontoA() {
		return pontoA;
	}

	public void setPontoA(int pontoA) {
		this.pontoA = pontoA;
	}

	public int getPontoB() {
		return pontoB;
	}

	public void setPontoB(int pontoB) {
		this.pontoB = pontoB;
	}

	
	
	@Override
	public boolean maiorQue(Object b) {
		if(tam>(int)b) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public boolean menorQue(Object b) {
		if(tam<(int)b) {
			return true;
		}else {
			return false;
		}
		
	}
	@Override
	public boolean igualA(Object b) {
		if(tam==(int)b) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[]args) {
		Reta r1=new Reta(1,3);//tam=2
		Reta r2=new Reta(1,7);//tam=6
		Reta r3=new Reta(2,4);//tam=2
		
		System.out.println(r2.maiorQue(r1.tam));//compara r2>r1?
		
		System.out.println(r3.menorQue(r2.tam));//compara r3<r2?
		
		System.out.println(r1.maiorQue(r3.tam));//compara r1>r3??
		
		System.out.println(r1.menorQue(r3.tam));//compara r1r3??
		
		System.out.println(r1.igualA(r3.tam));//compara r1==r3??
		
		
		
		
	}
	
}
