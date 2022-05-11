package aula14;

public class Continua {
	
	
	public Continua() {
		
	}


	public void lanca()throws Novo {
		throw new Novo("erro");// nao possivel realizar sem o throw
	}
	
	public void lanca2() {
		
	}
	
	public void g() throws Novo {
		throw new Novo("erro1");
	}
	
	public void f() {
		try {
			g();
		}
		catch(Novo e) {
			throw new NullPointerException("Erro 2");
		}
	}

	public static void main(String []args) {
		Continua p= new Continua();

		try {
			p.g();
		
		}
		catch(Novo e) {
			System.out.println(e.getX());
		}
		
		finally {
			p.f();
		}
		
	}
	
}
