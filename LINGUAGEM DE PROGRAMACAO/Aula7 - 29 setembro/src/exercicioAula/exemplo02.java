import java.util.Scanner;

public class exemplo02 {
    // Escreva um programa que dadas duas strings, exiba-as em ordem alfabética
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite duas letras: ");
        String letra1 = in.next();
        String letra2 = in.next();
        System.out.println();
        int resposta = letra1.compareTo(letra2);
        if (resposta == 0) {
            System.out.println("São identicas\n");
            System.out.printf("%s \n%s", letra1, letra2);
        } else if (resposta < 0) {
            System.out.printf("%s \n%s", letra1, letra2);
        } else {
            System.out.printf("%s \n%s", letra2, letra1);
        }
        System.out.println();
    }
}
