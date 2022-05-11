package heranca2;

public class Lista {
	private No inicio=null;
	private int tam=0;
	
	
	
	
	public No getInicio() {
		return inicio;
	}

	public void setInicio(No inicio) {
		this.inicio = inicio;
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

	public void inserir_inicio(int x) {
		No no=new No();
		no.setData(x);
		no.setNext(inicio);
		inicio=no;
		tam++;
	}
	
	public void inserir_fim(int x) {
		No no=new No();
		no.setData(x);
		
		if(inicio==null) {
			no.setNext(null);
			inicio=no;
		}else {
			No local=inicio;
			while(local.getNext()!=null) {
				local=local.getNext();
			}
			local.setNext(no);
			no.setNext(null);
			
		}
		tam++;
	}
	
	public void inserir(int x, int i) {
		if(i<=0) {
			inserir_inicio(x);
		}else if(i>=tam) {
			inserir_fim(x);
		}else {
			No local=inicio;
			
			for(int j=0;j<i-1;j++) {
				local=local.getNext();
			}
			
			No no=new No();
			no.setData(x);
			no.setNext(local.getNext());
			local.setNext(no);
			tam++;
		}
	
	}
	
	public int retirar_inicio() {
		if(inicio==null) {
			return -1;
		}
		int data=inicio.getData();
		inicio=inicio.getNext();
		tam--;
		return data;
	}
	
	public int retirar_fim() {
		if(inicio==null) {
			return -1;
		}
		No local=inicio;
		while(local.getNext()!=null) {
			No aux=local;
			local=local.getNext();
			if(local.getNext()==null) {
				aux.setNext(null);
				tam--;
				return local.getData();
				
				
			}
		}
		inicio=null;
		tam--;
		return local.getData();
	}
	
	public int retirar(int i) {
		if(i<0 || i>= tam|| inicio==null) {
			return -1;
		}else if(i==0) {
			return retirar_inicio();
		}else if(i==tam-1) {
			return retirar_fim();
		}
		No local=inicio;
		for(int j=0;j<i-1;j++) {
			local=local.getNext();
			
		}
		int data=local.getNext().getData();
		local.setNext(local.getNext().getNext());
		tam--;
		return data;
	}
	
	public String imprime() {
		String show="(" +tam + ")";
		No local=inicio;
		
	
		while(local!=null) {
			show+=local.getData()+" ";
			local=local.getNext();
			
		}
		
		return show;
	}
	
	
	public static void main(String[]args) {
		Lista t=new Lista();
		System.out.println(t.imprime());
		
		t.inserir(3,0);
		System.out.println(t.imprime());
		t.inserir(0,0);//inserir inicio
		System.out.println(t.imprime());
		t.inserir(6,1);
		System.out.println(t.imprime());
		t.inserir(57,2);
		System.out.println(t.imprime());
		t.inserir(2, 4);//inserir fim
		System.out.println(t.imprime());
		
		t.retirar(0);//retirar inicio
		System.out.println(t.imprime());
		
		
		t.retirar(2);//retirar do meio
		System.out.println(t.imprime());
		
		while(t.retirar(t.tam-1)!=-1) {
			System.out.println(t.imprime());//retirar fim ate zerar
			
		}
		
		

		
		
	}
}
