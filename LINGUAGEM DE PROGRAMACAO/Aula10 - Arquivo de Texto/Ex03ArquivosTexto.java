/*
 * 3. Escreva um programa que recebe dois valores via argumentos do método main(). O primeiro
 * é uma string e o segundo o nome de um arquivo do tipo texto. O programa deve percorrer o
 * arquivo imprimindo no vídeo todas as linhas que contêm a string (comportamento
 * semelhante ao comando grep do Linux).
 */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex03ArquivosTexto {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Erro de sintaxe!");
			System.out.println("Para executar faca:");
			System.out.println("java NomeDaClasse <string> <arquivo>");
			return;			
		}
		try (BufferedReader br = new BufferedReader(new FileReader(args[1]))) {
			String linha;
			while ((linha = br.readLine()) != null) {
				if (linha.indexOf(args[0]) != -1) {
					System.out.println(linha);
				}
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
