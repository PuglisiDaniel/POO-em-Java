package application;

import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class Pedido {
	private Bebida beber;
	private Pizza comer;
	private Cliente consta;
	
	public Bebida getBeber() {
		return beber;
	}
	public void setBeber(Bebida beber) {
		this.beber = beber;
	}
	public Pizza getComer() {
		return comer;
	}
	public void setComer(Pizza comer) {
		this.comer = comer;
	}
	public Cliente getConsta() {
		return consta;
	}
	public void setConsta(Cliente consta) {
		this.consta = consta;
	}
	
	
	public static void main(String[] args) {
		Pedido order =new Pedido();
		
		Cliente c1 = new Cliente();
		
		
		c1.setCpf("41593384");
		c1.setEndereco("rua mt loka");//cadastrando um possivel cliente
		c1.setNome("Alberto");
		c1.setTelefone("40028922");
		
		order.setConsta(c1);
		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("entre com o seu telefone: ");
		String tel=sc.nextLine();
	
		double vPizza=0, vBebida=0;
				
		if(tel.equals(c1.getTelefone())) { //comparacao de telefone com algum presente no banco de dados

			System.out.println("Cliente ja cadastrado");
			
			
		}else {
			System.out.println("Entre com seus dados");
			
			c1.setTelefone(tel);
			System.out.println("Nome:");
			String nome2=sc.nextLine();
			c1.setNome(nome2);
			System.out.println("Endereco:");
			String end2=sc.nextLine();
			c1.setEndereco(end2);
			System.out.println("CPF:");
			String cpf2=sc.nextLine();
			c1.setCpf(cpf2);
		
		}
		
		
		
		System.out.printf(" O cliente %s\n CPF: %s\n endereco: %s\n telefonoe: %s\n Realizou o pedido", 
					c1.getNome(),c1.getCpf(), c1.getEndereco(), c1.getTelefone());
		sc.close();

				
	}
	
}
