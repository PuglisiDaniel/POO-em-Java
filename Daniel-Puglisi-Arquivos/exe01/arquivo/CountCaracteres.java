package arquivo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CountCaracteres {

	public static void main(String[] args) {
			
		
			try {
				
				Scanner s= new Scanner(System.in);
				char caractere;
				System.out.println("Entre como o caractere que deseja buscar");
				caractere = s.next().charAt(0);
				int conta=0;
				
				FileInputStream arq= new FileInputStream("C:\\Users\\T-Gamer\\eclipse-workspace\\arquivo\\src\\teste.txt");
				InputStreamReader input= new InputStreamReader(arq);
				BufferedReader br= new BufferedReader(input);
				String linha = new String();
				String frase = new String();
				
				do {
					linha=br.readLine();
					if(linha!=null) {
						frase=frase+linha;
					}
					
				}while(linha!=null);
				
	
				for(int i=0;i<frase.length();i++) {
					if(frase.charAt(i)==caractere) {
						conta++;
					}
				}
	
				System.out.println("O caractere '"+caractere+"' Aparece "+conta+" vez(s)");
				input.close();
				
			}
			catch(Exception e) {
				System.err.println("erro");
				
			}
		
	}

}
