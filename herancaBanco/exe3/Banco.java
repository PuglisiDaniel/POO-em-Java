package application;

public class Banco {
	private Conta vetor[]	= new Conta[5];
	
	
	public void atualiza(Banco teste) {
		
		
		for(int i=0;i<5;i++) {
			if(teste.vetor[i]==null) {
				teste.vetor[i]=new Conta(0);
			}
			if(teste.vetor[i].getClass().getSimpleName().equals("ContaCorrente")){
				if(teste.vetor[i].getSaldo()==-1*((ContaCorrente) teste.vetor[i]).getLimite()) {
					System.out.println("Carta Enviada para dono da conta: "+ teste.vetor[i].getNumero());
				}
			
			}
			if(teste.vetor[i].getClass().getSimpleName().equals("ContaPoupanca")) {
				//add juros
				teste.vetor[i].debita(((ContaPoupanca) teste.vetor[0]).addJuro(teste.vetor[0].getSaldo(), ((ContaPoupanca) teste.vetor[0]).getJuros()));
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		Banco teste = new Banco();
		
		teste.vetor[0]=new ContaPoupanca(777, 0.02);
		teste.vetor[0].debita(25);
		
	
		teste.vetor[1]=new ContaCorrente(8888, 2000);
		teste.vetor[1].debita(100);
		teste.vetor[1].credita(2100);
		
		teste.vetor[2]=new Conta(5955);
		teste.vetor[2].debita(500);
		teste.vetor[2].credita(200);
		
		teste.vetor[3]=new ContaPoupanca(55421, 0.02);
		teste.vetor[3].debita(500);
		teste.vetor[3].credita(100);
		
		
		
		

		teste.atualiza(teste);
		
		for(int i=0;i<5;i++) {
			if(teste.vetor[i]!=null && teste.vetor[i].getNumero()!=0) {
				teste.vetor[i].imprime();
			}
			
		}
		
	
	}
}
