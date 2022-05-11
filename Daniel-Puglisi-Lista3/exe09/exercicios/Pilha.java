package exercicios;

import java.util.LinkedList;

public class Pilha {
	private LinkedList lista;
	private int topo;
		    
	public Pilha() {
		lista = new LinkedList();
		topo = 0;
	}

	public void push(Object x) {// empilha
		lista.add(topo, x);
		topo++;
	}

	public void pop() {// desempilha
		topo--;
		lista.remove(topo);
	}

	public Object top() {
		return lista.peekLast();
	}

	@Override
	public String toString() {
		return lista.toString();
	}

	public static void main(String[] args) {
		Pilha p = new Pilha();
		p.push(2.5);
		p.push(2);
		p.push('a');

		System.out.println(p.toString());

		p.pop();
		System.out.println("Pós pop");
		System.out.println(p.toString());
		System.out.println(p.top());// print topo
	}
}
