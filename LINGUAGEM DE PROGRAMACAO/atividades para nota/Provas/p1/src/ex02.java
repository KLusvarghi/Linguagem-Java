import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int soma = 0;
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int numInteiro = in.nextInt();
            int num = numInteiro / 10; // pega os primeiros nuemros - o ultimo
            int ultimo = numInteiro % 10; // pega o ultimo numero
            int nPotencia = 1;
            for (int j = 0; j < ultimo; j++) {
                nPotencia = nPotencia * num;
            }
            soma += nPotencia;
        }
        System.out.println("\n" + soma);
    }
}