package heranca2;

public class Fila extends Lista  {

	
	
	@Override
	public void inserir_fim(int x) {//enfilera
		
		super.inserir_fim(x);
	}

	@Override
	public int retirar_inicio() {//desenfilera
		
		return super.retirar_inicio();
	}

	public static void main(String[]args) {
		Fila f=new Fila();
		f.inserir_fim(5);
		f.inserir_fim(2);
		f.inserir_fim(2);
		f.inserir_fim(7);
		
		System.out.println(f.imprime());
		
		while(f.retirar_inicio()!=-1) {
			System.out.println(f.imprime());//desenfilera ate zerar
			
		}
		
	}
}
