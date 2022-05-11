package arquivo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class CountCaracteres {
					
	public static void main(String[] args) throws IOException {
		
		try {
			Map<String,Integer>map=new HashMap<>();
			
			map.put("teste", 3);
			map.put("umaPalavra", 1);
			map.put("outraPalavra", 10);
		
			FileOutputStream out= new FileOutputStream("Saida.txt");
			PrintWriter pr= new PrintWriter(out);
			for(Map.Entry<String, Integer>entry : map.entrySet()) {
				pr.println(entry.getKey()+" "+entry.getValue());
			}
			
			pr.close();
			out.close();
			
			
		}
		catch(Exception e) {
			System.err.println("Erro");
		}
		
		
		
		
	}
	
}