
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {
	public static final String DELIMITER = "\t";
	public static void main(String[] args) {
		String pasta = "C:\\Users\\kaual\\Desktop\\Comandos\\sla.txt";
		List<String[]> records = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(pasta))) {
		    String line;
		    br.readLine();  // linha de cabeçalho
		    while ((line = br.readLine()) != null) {
		        String[] values = line.split(DELIMITER);
		        records.add(values);
		    }
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Uso incorreto!");
		} catch (IOException e) {
			System.out.println("Erro de leitura/escrita: " + e.getMessage());
		}
		
		for (String[] linha : records) {
			for (String s : linha) {
				System.out.print(s + ",");
			}
			System.out.println();
		}
		
	}

}
