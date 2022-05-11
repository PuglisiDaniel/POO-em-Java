package testeInterface;

import java.util.*;


public class Main implements CharSequence {
	public String teste;
	
	
	
	
	public Main(String teste) {
		this.teste = teste;
	}



	@Override
	public String toString() {
		
		String aux="";
		
		for(int i=teste.length()-1;i>=0;i--) {
			aux=aux+teste.charAt(i);
		}
		
		return aux;
	}



	@Override
	public char charAt(int index) {
		StringBuffer sb=new StringBuffer();
		sb.append(teste);
		sb.reverse();
		
		return sb.charAt(index);
	}

	

	@Override
	public int length() {
		
		
		return teste.length();
	}



	@Override
	public CharSequence subSequence(int start, int end) {
		
		String aux="";
		teste=toString();
		
		for(int i=end;i>=start;i--) {
			aux=aux+teste.charAt(i);
		}
		
		
		CharSequence n=new Main(aux);
		
		return n;
		
	}
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Main x=new Main(s.nextLine());
		
		

		System.out.println(x.toString());//mostra a palavra invertida
		
		System.out.println(x.length());//mostra o tamanho da palavra
		
		System.out.println(x.charAt(0));//mostra a primeira letra da palavra invertida
		
		System.out.println(x.subSequence(1, 4));//mostra a sequencia formada pela palavra invertida
																		//de acordo com os indices
		
		
		s.close();
		
		
	}
}
