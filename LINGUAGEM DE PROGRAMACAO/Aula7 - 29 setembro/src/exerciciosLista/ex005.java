import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, cont = 0;
        char letra;
        System.out.print("Informe o numero de strings: ");
        n = in.nextInt();
        in.nextLine();
        System.out.print("Informe uma letra: ");
        letra = in.next().toLowerCase().charAt(0);
        in.nextLine();
        System.out.printf("Informe %d palavras que comecem com a letra %c\n", n, letra);
        String[] palavras = new String[n];
        while (cont < n) {
            palavras[cont] = in.nextLine().toLowerCase();
            if (palavras[cont].charAt(0) != letra) {
                System.out.printf("Esta palavra nao comeca com a letra %c\n", letra);
            } else {
                cont++;
            }
        }
        System.out.println("Palavras aceitas:");
        for (int i = 0; i < n; i++) {
            System.out.println(palavras[i]);
        }
    }
}
