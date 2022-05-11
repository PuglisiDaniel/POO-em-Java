package aula14;

public class Continua {
	
	
	public Continua() {
		
	}


	public void lanca()throws Novo {
		throw new Novo("erro");// nao possivel realizar sem o throw
	}
	
	public void lanca2() {
		
	}

	public static void main(String []args) {
		Continua p= null;

		try {
			p.lanca2();
		
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}
