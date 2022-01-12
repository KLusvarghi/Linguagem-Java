
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex01ArquivosTexto {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Uso incorreto!");
			System.exit(1);
		}
		File arquivo1 = new File(args[0]);
		File arquivo2 = new File(args[1]);
		try (FileReader rf = new FileReader(arquivo1);
				BufferedReader br = new BufferedReader(rf);
				FileWriter rw = new FileWriter(arquivo2);
				BufferedWriter bw = new BufferedWriter(rw)) {
			String line;
			while ((line = br.readLine()) != null) {
				bw.write(line.toUpperCase());
				bw.newLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
		} catch (IOException e) {
			System.out.println("Erro de escrita/leitura");
		}
	}

}
