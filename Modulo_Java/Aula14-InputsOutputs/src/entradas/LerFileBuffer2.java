package entradas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerFileBuffer2 {

		public static void main(String[] args) throws IOException {
			
			FileReader in = new FileReader("./src/arquivo.txt");
			BufferedReader br = new BufferedReader (in);
			String text = br.readLine();
			while (text != null)
			{
				System.out.println(text);
				text=br.readLine();
			}
			in.close();
		
		}
}
