package aula14;

public class Continua {
	
	
	public Continua() {
		
	}


	public void lanca()throws Novo {
		throw new Novo("erro");// nao possivel realizar sem o throw
	}

	public static void main(String []args) {
		Continua p= new Continua();

		try {
			p.lanca();
		
		}
		catch(Novo e) {
			System.out.println(e.getX());
		}
		
	}
	
}
