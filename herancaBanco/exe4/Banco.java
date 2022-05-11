package application;

import java.util.*;

public class Banco {
	private Conta vetor[]	= new Conta[5];
	
	
	public void atualiza(Banco teste) {
		
		
		for(int i=0;i<5;i++) {
			if(teste.vetor[i]==null) {
				teste.vetor[i]=new Conta(0);
			}
			if(teste.vetor[i].getClass().getSimpleName().equals("ContaCorrente")){
				if(teste.vetor[i].getSaldo()==-1*((ContaCorrente) teste.vetor[i]).getLimite()) {
					System.out.println("Carta Enviada para dono da conta: "+ teste.vetor[i].getNumero()+"\n");
				}
			
			}
			if(teste.vetor[i].getClass().getSimpleName().equals("ContaPoupanca")) {
				//add juros
				teste.vetor[i].debita(((ContaPoupanca) teste.vetor[0]).addJuro(teste.vetor[0].getSaldo(), ((ContaPoupanca) teste.vetor[0]).getJuros()));
			}
		}
		
	}
	
	public void abrir(Banco teste) {
		
		System.out.println("\nQual tipo de conta deseja abrir: \n1-Conta Poupanca\n2-Conta Corrente\n");
		
		Scanner l=new Scanner(System.in);
		String tipo=l.nextLine();
		
		 if(tipo.equals("1")) {
			 for(int i=0;i<5;i++) {
				 if(teste.vetor[i]==null) {
					 teste.vetor[i]=new ContaPoupanca(5553,0.02);
					 System.out.printf("Foi criada sua nova conta, numero: %d com juros de  %.1f por cento\n",
							 teste.vetor[i].getNumero(), 100*((ContaPoupanca) teste.vetor[i]).getJuros());
					 l.close();
					 break;
				 }
			 }
			 
		 }else if(tipo.equals("2")) {
		
			 for(int i=0;i<5;i++) {
				 if(teste.vetor[i]==null) {
					 teste.vetor[i]=new ContaCorrente(5553,1000);
					 System.out.printf("Foi criada sua nova conta, numero: %d com limite de  R$%.2f \n",
							 teste.vetor[i].getNumero(), ((ContaCorrente)teste.vetor[i]).getLimite());
					 l.close();
					 break;
				 }

			 }
		 }
	}
	
	public void fechar(Banco teste, int i) {
		System.err.println("A conta de numero: "+teste.vetor[i].getNumero() + " foi encerrada\n");
		teste.vetor[i]=null;
	}
	
	public void dividendos(Banco teste) {
		for(int i=0;i<5;i++) {
			if(teste.vetor[i]==null) {
				teste.vetor[i]=new Conta(0);
			}
			if(teste.vetor[i].getClass().getSimpleName().equals("ContaPoupanca")) {
				teste.vetor[i].debita(((ContaPoupanca) teste.vetor[0]).addJuro(teste.vetor[0].getSaldo(), ((ContaPoupanca) teste.vetor[0]).getJuros()));

			}
		}
	}
	
	
	public static void main(String[] args) {
		Banco teste = new Banco();
		
		/// exemplos de clientes ja cadastrados
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
		
		
		System.out.println("\n Liste de Contas\n");
		
		for(int i=0;i<5;i++) {
			if(teste.vetor[i]!=null && teste.vetor[i].getNumero()!=0) {
				teste.vetor[i].imprime();
			}
			
		}
		
		System.out.println("\n //Apos atualizacao//\n");
		teste.atualiza(teste);
		
		
		
		for(int i=0;i<5;i++) {
			if(teste.vetor[i]!=null && teste.vetor[i].getNumero()!=0) {
				teste.vetor[i].imprime();
			}
			
		}
		System.out.println("\n //Apos fechamento de conta//\n");
		teste.fechar(teste, 2);
		
		
		
		for(int i=0;i<5;i++) {
			if(teste.vetor[i]!=null && teste.vetor[i].getNumero()!=0) {
				teste.vetor[i].imprime();
			}
			
		}
		
		teste.abrir(teste);
		
		System.out.println("\n //Apos abertura de nova conta//\n");
		for(int i=0;i<5;i++) {
			if(teste.vetor[i]!=null && teste.vetor[i].getNumero()!=0) {
				teste.vetor[i].imprime();
			}
			
		}
		
		System.out.println("\n //Apos dividendos//\n");
		teste.dividendos(teste);
		
		for(int i=0;i<5;i++) {
			if(teste.vetor[i]!=null && teste.vetor[i].getNumero()!=0) {
				teste.vetor[i].imprime();
			}
			
		}
		
		
	}
}
