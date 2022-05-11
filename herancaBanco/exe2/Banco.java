package application;

public class Banco {
	private Conta vetor[]	= new Conta[5];
	
	
	
	public static void main(String[] args) {
		Banco teste = new Banco();
		
		teste.vetor[0]=new ContaPoupanca(777, 0.02);
		teste.vetor[0].debita(25);
		//add juros
		teste.vetor[0].debita(((ContaPoupanca) teste.vetor[0]).addJuro(teste.vetor[0].getSaldo(), ((ContaPoupanca) teste.vetor[0]).getJuros()));
	
		teste.vetor[1]=new ContaCorrente(8888, 2000);
		teste.vetor[1].debita(100);
		
		teste.vetor[2]=new Conta(555);
		teste.vetor[2].debita(500);
		teste.vetor[2].credita(200);
		
		teste.vetor[0].imprime();
		teste.vetor[1].imprime();
		teste.vetor[2].imprime();

	}
	
}
