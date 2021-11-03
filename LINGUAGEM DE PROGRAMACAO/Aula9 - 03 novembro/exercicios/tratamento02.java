import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class tratamento02 {
    public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Uso: java CopiaArquivoExcecao <arq1> <arq2>");
			return;
		}
		File arqEntrada = new File(args[0]);
		File arqSaida = new File(args[1]);
		FileReader leitor = null;
		FileWriter escritor = null;
		try {
			leitor = new FileReader(arqEntrada);
			escritor = new FileWriter(arqSaida);
			int c;
			while ((c = leitor.read()) != -1) {
				escritor.write(c);
			}
		} catch (FileNotFoundException e) {
			System.out.println("O arquivo não foi encontrado");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				leitor.close();
				escritor.close();
			} catch (IOException | NullPointerException e) {
				System.out.println("Nao foi possível fechar os arquivos");
			}
		}
	}
}
