package exercicios;

import java.util.LinkedList;

public class Fila {
	private LinkedList lista;
	private int tam;
	
	public Fila() {
		lista=new LinkedList();
		tam=0;
	}
	
	public void enfileira(Object x) {
		lista.addLast(x);
		tam++;
	}
	
	public void desenfileira() {
		if(vazio()==true) {
			System.err.println("Fila vazia nao é possível desenfileirar");
		}else {
			lista.removeFirst();
			tam--;
		}
		
	}
	
	public boolean vazio() {
		if(tam==0) {
			return true;
		}else {
			return false;
		}
	}

	public String toString() {
		return lista.toString();
	}
	public static void main(String[] args) {
		Fila f=new Fila();
		f.enfileira(4);
		f.enfileira(2.5);
		f.enfileira(1);
		f.enfileira('H');
		f.enfileira("Hugo");
		
		System.out.println(f.toString());
		
		f.desenfileira();
		f.desenfileira();
		System.out.println(f.toString());
		
		System.out.println(f.vazio());
		f.desenfileira();
		f.desenfileira();
		f.desenfileira();
		System.out.println(f.vazio());
		f.desenfileira();
		
	}

}
