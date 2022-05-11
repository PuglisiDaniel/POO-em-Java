package aula14;

public class LancaObj {

	public static void main(String[]args) throws Exception{
		
		try {
			int[] test = new int[5];
			test[5]=9;
			
		}
		catch(Exception e) {
			throw new Exception("Erro");
		}
		
		finally {
			System.out.println("Check");
		}
		
	}
}
