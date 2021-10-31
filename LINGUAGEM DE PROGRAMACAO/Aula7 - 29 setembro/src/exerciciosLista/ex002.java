import java.util.Scanner;

public class ex002 {

    // Escreva um programa que receba uma string do teclado e informe quantas letras
    // maiúsculasela possui

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = in.next();

        int cont = 0;
        // System.out.println(Character.isUpperCase(palavra.charAt(0)));
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) >= 'A' && palavra.charAt(i) <= 'Z') {
                cont++;
            }
        }
        System.out.printf("Existem %d letras maiúsculas.\n", cont);
    }
}
