package application;

public class ContaPoupanca extends Conta{
	private double juros;
	
	public ContaPoupanca(int a, double juros) {
		super(a);
		this.juros=juros;
	}
	
						//c=saldo   i=juros
	public  double addJuro(double c, double i) {
		
		double j=c*i;
		
		
		return j;	
		
	}


	public double getJuros() {
		return juros;
	}


	public void setJuros(double juros) {
		this.juros = juros;
	}
	
	
	public static void main(String[]args) {
		ContaPoupanca ana=new ContaPoupanca(55423, 0.02);
		ContaPoupanca joao=new ContaPoupanca(55433, 0.02);
		ContaPoupanca pedro=new ContaPoupanca(67429, 0.02);
		
		ana.debita(50);
		joao.debita(50.00);
		pedro.debita(200.25);
		
		ana.credita(25);
		pedro.credita(190);
		
		
		
		ana.debita(ana.addJuro(ana.getSaldo(), ana.getJuros()));
		
		System.out.println();
		
		ana.imprime();
		joao.imprime();
		pedro.imprime();
		
		
	}
}
