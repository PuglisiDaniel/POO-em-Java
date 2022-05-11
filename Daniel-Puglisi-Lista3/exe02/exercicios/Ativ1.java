package exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ativ1 {
	
	
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		
		ArrayList<Double> org=new ArrayList<Double>();
		int i=0;
		double soma=0;
		while(i<100){
			double aux= sc.nextDouble();
			if(aux==0) {
				break;
			}
			org.add(aux);
			soma=soma+org.get(i);
			i++;	
		}
		
		System.out.println("A media eh:" + soma/i);
		
		
	}

	
}
