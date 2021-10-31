import java.util.Scanner;

public class ex09 {

    // https://www.urionlinejudge.com.br/judge/pt/problems/view/1871
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite a quantidade de operações: ");
        int quantidade = in.nextInt();
        StringBuffer[] vetor = new StringBuffer[quantidade];
        System.out.println();
        for (int y = 0; y < quantidade; y++) {
            System.out.print("Digite dois números sem o algarismo '0': ");
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            int soma = num1 + num2;
            StringBuffer somaString = new StringBuffer(Integer.toString(soma));

            int num0 = somaString.indexOf("0");
            // System.out.println(num0);
            // System.out.println(soma);
            if (num0 >= 0) {
                somaString = somaString.deleteCharAt(num0);
                // System.out.println(somaString);
                vetor[y] = somaString;
            } else {
                vetor[y] = new StringBuffer(Integer.toString(soma));
            }
        }
        System.out.println();
        for (int x = 0; x < quantidade; x++) {
            System.out.println(vetor[x]);
        }
    }
}
