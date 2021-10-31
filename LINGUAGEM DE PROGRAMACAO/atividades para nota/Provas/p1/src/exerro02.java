import java.util.Scanner;

public class exerro02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String tira;
        int n = in.nextInt(); // o número de termos da expressão
        int resul = 0;
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            vetor[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int lastnum = vetor[i] % 10;
            int calculador = lastnum;
            tira = Integer.toString(lastnum);
            String vet = Integer.toString(vetor[i]);
            resul = vet.indexOf("tira");

            for (int x = 0; x < calculador; x++) {

            }
        }

    }
}
