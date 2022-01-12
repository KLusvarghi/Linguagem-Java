package br.fatec.p2;

import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import br.fatec.arquivos.AppendingObjectOutputStream;

public class Paciente implements Serializable {
	String cpf;
	String nome;
	int peso;

	public static void main(String[] args) {
		//gerarDados();
		try (ObjectInputStream input = new ObjectInputStream(Files.newInputStream(Paths.get("pacientes.dat")));
				BufferedWriter bw = new BufferedWriter(new FileWriter("pacientes.csv"))) {
			while (true) {
				Paciente p = (Paciente) input.readObject();
				bw.write(p.cpf + ";" + p.nome + ";" + p.peso);
				bw.newLine();
			}
		} catch (EOFException e) {
			System.out.println("Arquivo CSV gerado");
		} catch (ClassNotFoundException e) {
			System.out.println("Tipo de objeto invalido!");
		} catch (IOException e) {
			System.out.println("Erro de leitura no arquivo");
		}
	}

	private static void gerarDados() {

		char outro;
		Scanner in = new Scanner(System.in);
		do {
			Paciente p = new Paciente();
			try {
				System.out.print("CPF: ");
				p.cpf = in.nextLine();
				System.out.print("Nome: ");
				p.nome = in.nextLine();
				System.out.print("Peso (Kg): ");
				p.peso = in.nextInt();
				Path path = Paths.get("pacientes.dat");
				if (Files.exists(path)) {
					try (FileOutputStream fos = new FileOutputStream("pacientes.dat", true);
							AppendingObjectOutputStream output = new AppendingObjectOutputStream(fos)) {
						output.writeObject(p);
					} catch (FileNotFoundException e) {
						System.out.println("Nao foi possível abrir o arquivo " + path.getFileName() + "!");
					} catch (IOException e) {
						System.out.println("Erro de escrita no arquivo " + path.getFileName() + "!");
					}
				} else {
					try (ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(path))) {
						output.writeObject(p);
					} catch (IOException e) {
						System.out.println("Erro de escrita no arquivo " + path.getFileName() + "!");
					}
				}
			} catch (InvalidPathException e) {
				System.out.println("Nao foi possivel encontrar o arquivo " + e.getMessage());
			}
			System.out.print("\nDeseja cadastrar outro (S/N)? ");
			outro = in.next().toUpperCase().charAt(0);
			in.nextLine();
		} while (outro == 'S');
	}

}
