
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LerEscreverArquivoTexto {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Uso incorreto!");
			System.exit(1);
		}
		File arquivo = new File(args[0]);
		try (FileReader fr = new FileReader(arquivo); BufferedReader br = new BufferedReader(fr)) {
			while (br.ready()) {
				String s = br.readLine();
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não criado");					
		} catch (IOException e) {
			System.out.println("Erro de leitura");
		}
		try (Scanner in = new Scanner(System.in);
				FileWriter fw = new FileWriter(arquivo, true);
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
