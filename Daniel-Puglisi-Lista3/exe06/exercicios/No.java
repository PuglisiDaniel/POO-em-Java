package exercicios;

import java.util.ArrayList;

public class No {
	private int dado;
	private No proximo;
	
	
	
	public int getDado() {
		return dado;
	}



	public void setDado(int dado) {
		this.dado = dado;
	}



	public No getProximo() {
		return proximo;
	}



	public void setProximo(No proximo) {
		this.proximo = proximo;
	}


	public static void inserir(ArrayList<No> lista, int i, int x) {
		
		if(i>lista.size()|| i<0) {
			System.err.println("Posição Invalida");
		}
		else {
			No novo= new No();
			novo.dado=x;
			
			lista.add(i, novo);
		}
		
		
	}
	
	public static void remover(ArrayList<No> lista, int i) {
		if(i>lista.size()|| i<0) {
			System.err.println("Posição Invalida");
		}
		else {
			
			lista.remove(i);
			
		}
		
	}
	
	public static ArrayList<No> inverte(ArrayList<No> lista) {
		ArrayList<No> invertida=new ArrayList<No>();
		int j=0;
		for(int i = lista.size()-1;i>=0;i--) {
			
			invertida.add(j, lista.get(i));
			j++;
		}
		
		return invertida;
	}

	public static int soma(ArrayList<No> lista){
		int total=0;
		for(int i=0;i<lista.size();i++) {
			total=total+lista.get(i).dado;
		}
		return total;
	}
	
	public static boolean busca(ArrayList<No> lista, int x) {
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).dado==x) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[]args) {
		
		ArrayList<No> lis = new ArrayList<No>();
		No n1= new No();
		int i=0;
		
		inserir(lis, 0, 4);
		inserir(lis, 0, 2);
		inserir(lis, 1, 3);
		inserir(lis, 0, 1);
		
		for( i=0;i<lis.size();i++) {
			
			System.out.println(lis.get(i).dado);
		}
		
		remover(lis,0);
		remover(lis, 2);
		
		System.out.println("Pós remoção:\n");////
		for( i=0;i<lis.size();i++) {
			
			System.out.println(lis.get(i).dado);
		}
		
		System.out.println("Pós inversão");////
		
		for(i=0;i<inverte(lis).size();i++){
			System.out.println(inverte(lis).get(i).dado);
		}
		
		System.out.println("A soma dos inteiros do vetor eh: "+soma(lis));
		
		System.out.println(busca(lis,1));// retorna se numero pertence a lista
		inserir(lis,0,1);
		System.out.println(busca(lis,1));// retorna se numero pertence a lista
	}
}
