
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ex04ArquivosTexto {
	private static final String DELIMITER = ";";
	private static final String CSV_FILENAME = "imoveis.csv";

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int op = -1;
		do {
			try {
				System.out.println("\nIMOBILIARIA\n");
				System.out.println("<1> Listar Imoveis");
				System.out.println("<2> Mostrar Detalhe do Imovel");
				System.out.println("<3> Inserir Novo Imovel");
				System.out.println("<4> Remover Imovel");
				System.out.println("<0> Sair");
				System.out.print("Opcao: ");
				op = in.nextInt();
				switch (op) {
				case 1:
					listarImoveis();
					break;
				case 2:
					System.out.print("Numero de referencia: ");
					mostrarDetalheImovel(in.next());
					break;
				case 3:
					inserirNovoImovel();
					break;
				case 4:
					System.out.print("Numero de referencia: ");
					removerImovel(in.next());
					break;
				case 0:
					break;
				default:
					System.out.printf("Opcao invalida (%d)!\n", op);
				}
			} catch (FileNotFoundException e) {
				System.out.println("Arquivo nao encontrado: " + e.getMessage());
			} catch (NoSuchElementException  e) {
				System.out.println("Erro de entrada de dados: " + e.getMessage());
				in.nextLine();
			} catch (IOException e) {
				System.out.println("Erro de leitura/escrita: " + e.getMessage());
			}
		} while (op != 0);
	}

	private static void removerImovel(String ref) throws FileNotFoundException, IOException {
		List<String[]> records = new ArrayList<>();
		boolean achei = false;
		try (BufferedReader br = new BufferedReader(new FileReader(CSV_FILENAME))) {
			String line;
			br.readLine();
			while ((line = br.readLine()) != null) {
				String[] values = line.split(DELIMITER);
				if (!ref.equals(values[0])) {
					records.add(values);
				}
				else {
					achei = true;
				}
			}
		}		
		if (!achei) {
			System.out.println("Erro: nao ha' nenhum imovel com essa referencia (" + ref + ")");
		}
		else {
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(CSV_FILENAME))) {
				bw.write("Referência;Tipo;Quartos;Bairro;Valor");
				bw.newLine();
				for (String[] linha : records) {
					bw.write(linha[0] + ";" + linha[1] + ";" + linha[2] + ";" + linha[3] + ";" + Float.parseFloat(linha[4]));
					bw.newLine();
				}
			}
		}
	}

	private static void inserirNovoImovel() throws IOException, NoSuchElementException {
		Scanner in = new Scanner(System.in);
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(CSV_FILENAME, true))) {
			System.out.println("\nNovo Imovel");
			System.out.print("Ref.: ");
			int ref = in.nextInt();
			System.out.print("Tipo: ");
			in.nextLine();
			String tipo = in.nextLine();
			System.out.print("No. de quartos: ");
			int quartos = in.nextInt();
			System.out.print("Bairro: ");
			in.nextLine();
			String bairro = in.nextLine();
			System.out.print("Valor: R$ ");
			float valor = in.nextFloat();
			bw.write(ref + ";" + tipo + ";" + quartos + ";" + bairro + ";" + valor);
			bw.newLine();
			System.out.println("\nImovel cadastrado com sucesso");
		}
	}

	private static void mostrarDetalheImovel(String ref) throws FileNotFoundException, IOException, NumberFormatException {
		try (BufferedReader br = new BufferedReader(new FileReader(CSV_FILENAME))) {
			boolean achei = false;
			String line;
			br.readLine();
			System.out.println("\nDetalhe do Imovel de Ref. " + ref);
			while ((line = br.readLine()) != null) {
				String[] values = line.split(DELIMITER);
				if (ref.equals(values[0])) {
					System.out.printf("Ref.: %3d\nTipo: %s\nQuartos: %d\nBairro: %s\nValor: R$ %10.2f\n", 
							Integer.parseInt(values[0]), values[1], Integer.parseInt(values[2]), 
							values[3], Float.parseFloat(values[4]));
					achei = true;
					break;
				}
			}
			if (!achei) {
				System.out.println("Erro: nao ha' nenhum imovel com essa referencia (" + ref + ")");
			}
		}
	}

	private static void listarImoveis() throws FileNotFoundException, IOException, NumberFormatException {
		try (BufferedReader br = new BufferedReader(new FileReader(CSV_FILENAME))) {
			String line;
			br.readLine();
			System.out.println("\nListagem dos Imoveis");
			System.out.println("--------------------");
			System.out.println("Ref.       Valor");
			System.out.println("--------------------");
			while ((line = br.readLine()) != null) {
				String[] values = line.split(DELIMITER);
				System.out.printf("%3d  R$ %10.2f\n", Integer.parseInt(values[0]), Float.parseFloat(values[4]));
			}
			System.out.println("--------------------");
		}
	}

}
