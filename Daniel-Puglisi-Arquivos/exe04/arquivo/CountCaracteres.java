package arquivo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCaracteres {
					
	public static void main(String[] args) throws IOException {
		
		Map<String,Integer>map=new HashMap<>();
		Scanner s = null;
		int aux = 0;
		String palavra=new String();
		try {
			s = new Scanner(new BufferedReader(new FileReader("C:\\Users\\T-Gamer\\eclipse-workspace\\arquivo\\src\\teste.txt")));
			while (s.hasNext()) {
				if (s.hasNextInt()==false) {
					palavra=s.next();
					
				} else {
					aux =s.nextInt();
					map.put(palavra, aux);
				}
			}
		} finally {
			s.close();
		}
		System.out.println(map.toString());
	}

	}