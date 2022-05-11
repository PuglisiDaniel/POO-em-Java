package exercicios;

import java.util.ArrayList;

public class Funcionario {
	private String sobreNome;
	private String nome;
	private Double salarioHora;
	private int anosNaEmpresa;
	
	
	
	public Funcionario(String sobreNome, String nome, Double salarioHora, int anosNaEmpresa) {
		this.sobreNome = sobreNome;
		this.nome = nome;
		this.salarioHora = salarioHora;
		this.anosNaEmpresa = anosNaEmpresa;
	}
	
	
	


	public String getSobreNome() {
		return sobreNome;
	}





	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}





	public String getNome() {
		return nome;
	}





	public void setNome(String nome) {
		this.nome = nome;
	}





	public Double getSalarioHora() {
		return salarioHora;
	}





	public void setSalarioHora(Double salarioHora) {
		this.salarioHora = salarioHora;
	}





	public int getAnosNaEmpresa() {
		return anosNaEmpresa;
	}





	public void setAnosNaEmpresa(int anosNaEmpresa) {
		this.anosNaEmpresa = anosNaEmpresa;
	}


	public static void imprime(ArrayList<Funcionario> f, int x) {
		ArrayList<Funcionario>lf2= new ArrayList<Funcionario>();
		for(int i=0;i<f.size();i++) {
			if(f.get(i).anosNaEmpresa>=x) {
				lf2.add(f.get(i));
			}
		}
		
		for(int i =0; i<lf2.size();i++) {
			System.out.println("Funcionario: "+lf2.get(i).nome+" "
								+lf2.get(i).sobreNome+"\nSalário Hora: R$"
								+lf2.get(i).salarioHora+"\n");
		}
		
	}


	public static void main(String[] args) {
		
		Funcionario f1=new Funcionario("Silva", "Pedro", 12.5, 3);
		Funcionario f2=new Funcionario("Santos", "Jair", 14.5, 1);
		Funcionario f3=new Funcionario("Silva", "Ana", 10.2, 5);
		Funcionario f4=new Funcionario("Trump", "Donald", 8.0, 2);
		
		ArrayList<Funcionario>lf1= new ArrayList<Funcionario>();
		
		lf1.add(f1);
		lf1.add(f2);
		lf1.add(f3);
		lf1.add(f4);
		
		
		imprime(lf1,3);// teste com 3 anos
		
		System.out.println("\n//////////////\n");
		
		imprime(lf1,4);//teste 4 anos
		
	}

}
