package arquivo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Copia {

	static void copy(File arq, File destino) throws IOException {
		InputStream in= new FileInputStream(arq);
		OutputStream out= new FileOutputStream(destino);
		byte [] aux= new byte[1024];
		int len;
		
		while((len=in.read(aux))>0) {
			out.write(aux, 0, len);
		}
		
		in.close();
		out.close();
		
	}
	
	public static void main(String[] args)  {
		File arq= new File("C:\\Users\\T-Gamer\\eclipse-workspace\\arquivo\\src\\teste.txt");
		File destino= new File("C:\\Users\\T-Gamer\\eclipse-workspace\\arquivo\\src\\teste2.txt");
		try {
			copy(arq, destino);
		} catch (IOException e) {
			System.err.println("Erro");

		}

	}

}
