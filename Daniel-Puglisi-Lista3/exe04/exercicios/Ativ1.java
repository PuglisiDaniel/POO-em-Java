package exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ativ1 {
	
	
	public static int maior(ArrayList<Integer> x) {
		return Collections.max(x);
	}
	
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		
		ArrayList<Integer> org=new ArrayList<Integer>();
		int i=0;
		while(i<100){
			int aux= sc.nextInt();
			if(aux==0) {
				break;
			}
			org.add(aux);
			i++;	
		}
		
		System.out.println("O maior inteiro do vetor eh: "+maior(org));
	
		
		
	}

	
}
