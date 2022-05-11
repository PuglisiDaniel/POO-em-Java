package aula14;

public class Novo extends Exception {
	private String x;


	public Novo(String string) {
		this.x=string;
	}


	public String getX() {
		return x;
	}


	public static void main(String[]args) throws Novo {
		int n=2;
	
		try {
			int[] test = new int[5];
			n=6;
			if(n>=5) {
				throw new Novo("Erro");
			}
			
		
		}
		catch(Novo e) {
			System.out.println(e.x.toString());
			
		}
		
	}
}
