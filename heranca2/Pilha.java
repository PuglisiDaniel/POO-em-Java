package heranca2;

public class Pilha extends Lista {

	
	
	@Override
	public void inserir_inicio(int x) {//empilha
		
		super.inserir_inicio(x);
	}

	@Override
	public int retirar_inicio() {//desempilha
		
		return super.retirar_inicio();
	}

	public static void main(String[] args) {
		Pilha p=new Pilha();
		
		p.inserir_inicio(5);
		p.inserir_inicio(1);
		p.inserir_inicio(2);
		p.inserir_inicio(3);
		System.out.println(p.imprime());

		p.retirar_inicio();
		System.out.println(p.imprime());
		
		
		while(p.retirar_inicio()!=-1) {
			System.out.println(p.imprime());//desempilha ate zerar
			
		}
	}
}
