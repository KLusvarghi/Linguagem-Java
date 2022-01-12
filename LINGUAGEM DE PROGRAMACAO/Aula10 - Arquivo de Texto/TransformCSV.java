
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TransformCSV {
	public static final String DELIMITER = "\t";
	public static final String NEW_DELIMITER = ";";

	public static void main(String[] args) {
		List<String[]> records = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		        String[] values = line.split(DELIMITER);
		        records.add(values);
		    }
		    try (BufferedWriter bw = new BufferedWriter(new FileWriter(args[0]+ "_new"))) {
		    	int i;
		    	for (String[] values : records) {
		    		for (i = 0; i < values.length - 1; i++) {
		    			bw.write(values[i]);
		    			bw.write(NEW_DELIMITER);
		    		}
		    		bw.write(values[i]);
		    		bw.newLine();
		    	}
		    }
		    catch (IOException e) {
		    	System.out.println("Erro de leitura/escrita: " + e.getMessage());
		    }
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Uso incorreto!");
		} catch (IOException e) {
			System.out.println("Erro de leitura/escrita: " + e.getMessage());
		}		
	}

}
