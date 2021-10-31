
/*
Escreva um programa em Java que dado o nome de uma pessoa e seu sexo (M ou F), exiba a
seguinte mensagem no vídeo: "Muito obrigado, Sr. <nome-da-pessoa>!" se sexo = M, ou
"Muito obrigado, Sra. <nome-da-pessoa>!" se sexo = F. Use o operador condicional ternário.
*/
import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = in.next();
        System.out.println("Digite seu sexo [M/F]");
        String sexo = in.next();
        char sexoChar = sexo.toUpperCase().charAt(0);
        System.out.printf("Muito obrigado, " + (sexoChar == 'F' ? "Sra. " : "Sr. ") + nome);
    }
}
