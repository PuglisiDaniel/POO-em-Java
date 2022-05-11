package piglatin;

import java.util.*;
import java.util.StringTokenizer;

public class Frases {
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Escreva uma frase em ingles\n");
		
		
		String frase=s.nextLine();
		
		
		StringTokenizer st= new StringTokenizer(frase, " ");
		StringBuffer sb=new StringBuffer();
		
		

		
		while(st.hasMoreTokens()) {
			String aux=st.nextToken();
			
			sb.append(aux+aux.charAt(0)+"ay"+" ");
			
			
		}
		
		for(int i=0;i<sb.length()-1;i++) {
			if(sb.charAt(i)==' ') {
				sb.deleteCharAt(i+1);
			}
			if(i==0) {
				sb.deleteCharAt(i);
			}
			
		}	
		s.close();
		System.out.println("\n"+sb);
	}
}
