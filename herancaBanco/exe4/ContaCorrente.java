package application;

public class ContaCorrente extends Conta {
	private double limite;

	
	
	public ContaCorrente(int a, double limite) {
		super(a);
		this.limite=limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
}
