package exercicios;

import java.util.Random;

public class Gerador {
	private int tamanho;
	private double vetor[];
	
	
	public Gerador(int tamanho) {
		Random gera = new Random();
		this.tamanho = tamanho;
		vetor= new double[tamanho];

		for(int i=0; i<tamanho;i++) {
			vetor[i]=gera.nextDouble();
		}
	}


	public static void main(String[] args) {
		
		
		Gerador g=new Gerador(4);
		
		for(int i=0; i<g.tamanho;i++) {
			System.out.printf("%.2f\n",g.vetor[i]);
		}
		
	
		

	}

}
