
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivoTexto {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Uso incorreto!");
			System.exit(1);
		}
		File arquivo = new File(args[0]);
		try (FileReader fr = new FileReader(arquivo); BufferedReader br = new BufferedReader(fr)) {
			while (br.ready()) {
				int c = br.read();
				System.out.printf("%c", c);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo nao encontrado!");
		} catch (IOException e) {
			System.out.println("Erro de leitura/escrita");
		}
	}

}
