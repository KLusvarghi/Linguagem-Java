/*
 * 2. Escreva um programa para criptografar e descriptografar um arquivo do tipo texto usando a
 * cifra de César (https://pt.wikipedia.org/wiki/Cifra_de_César). O programa deve receber
 * como argumentos do método da main() o nome do arquivo a ser criptografado ou
 * descriptografado, -c (criptografar) ou -d (descriptografar), a chave (rotação) e o nome do
 * arquivo que será gerado pela criptografia ou descriptografia.
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex02ArquivosTexto {

	public static void main(String[] args) {
		if (args.length != 4) {
			System.out.println("Erro de sintaxe!");
			System.out.println("Para executar faca:");
			System.out.println("java NomeDaClasse <arquivo-entrada> <-c|-d> <chave> <arquivo-saida>");
			return;
		}
		try (BufferedReader br = new BufferedReader(new FileReader(args[0]));
			 BufferedWriter bw = new BufferedWriter(new FileWriter(args[3]))) {
			int chave = Integer.parseInt(args[2]);
			if (args[1].equals("-d")) {
				chave = -chave;
			}
			int b;
			while (br.ready()) {
				b = br.read();
				b += chave;
				bw.write(b);
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("Erro: a chave de rotacao deve ser um numero inteiro");
		}

	}

}
