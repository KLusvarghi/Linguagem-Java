import java.util.Scanner;

public class ex0005 {

    // Escreva um programa que dados um inteiro n e um caractere ch, solicite que o
    // usuário informe n palavras que começam com a letra ch. Se o usuário informar
    // alguma palavra que não comece com a letra ch, o programa deve exibir uma
    // mensagem informando que a palavra não começa com a letra ch. No final o
    // programa deve exibir as n palavras digitadas pelo usuário que começam com a
    // letra ch.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite uma quantidade de palavras: ");
        int num = in.nextInt();

        String[] vetor = new String[num];
        System.out.println();
        for (int x = 0; x < num; x++) {
            System.out.printf("Digite a %dº palavra: ", x + 1);
            String palavra = in.next();
            int ch = palavra.indexOf("ch", 0);
            if (ch == 0) {
                vetor[x] = palavra;
            } else {
                System.out.println("A palavra não começa com a letra ch.\n");
            }
        }
        System.out.println();
        for (String y : vetor) {
            if (y != null) {
                System.out.println(y);
            }
        }

    }
}
