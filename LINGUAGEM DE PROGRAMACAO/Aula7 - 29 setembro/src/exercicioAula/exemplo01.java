import java.util.Scanner;

public class exemplo01 {
    // Escreva um programa que dada uma string, escreva-a de trás para frente
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um nome: ");
        String palavra = in.next();
        // String reverso = " ";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            // reverso += palavra.charAt(i);
            System.out.print(palavra.charAt(i));
        }
        // System.out.println(reverso);
    }
}
