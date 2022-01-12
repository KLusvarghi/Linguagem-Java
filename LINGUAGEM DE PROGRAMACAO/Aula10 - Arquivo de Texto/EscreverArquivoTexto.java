
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscreverArquivoTexto {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Uso incorreto!");
			System.exit(1);
		}		
		try (Scanner in = new Scanner(System.in);
			FileWriter fw = new FileWriter(args[0]);
			BufferedWriter bw = new BufferedWriter(fw)) {
			String str = null;
			while (!(str = in.nextLine()).isEmpty()) {
				bw.write(str);
				bw.newLine();
			}
		} catch (IOException e) {
			System.out.println("Erro de leitura/escrita");
		} 
	}

}
