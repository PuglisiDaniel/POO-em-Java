package arquivo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CountCaracteres {

	public static void main(String[] args) {
			
		
			try {
				
			
				
				FileInputStream arq= new FileInputStream("C:\\Users\\T-Gamer\\eclipse-workspace\\arquivo\\src\\teste.txt");
				InputStreamReader input= new InputStreamReader(arq);
				BufferedReader br= new BufferedReader(input);
				String linha = new String();
				
				do {
					linha=br.readLine();
					if(linha!=null) {
						System.out.println(linha);
					}
					
				}while(linha!=null);
	
				
				input.close();
				
			}
			catch(Exception e) {
				System.err.println("erro");
				
			}
		
	}

}
