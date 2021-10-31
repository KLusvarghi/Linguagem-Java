import java.util.Scanner;

// Uma loja de discos anota diariamente durante o mês de março a quantidade de discos vendidos.
// Desenvolva um programa em Java para determinar em que dia desse mês ocorreu a maior
// venda e qual foi a quantidade de discos vendida nesse dia.
public class Ex9 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int maiorValor = 0;
        int dia = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.printf("Digite o valor de vendas do %d dia: ", i);
            int valorDia = in.nextInt();
            if (valorDia > maiorValor) {
                maiorValor = valorDia;
                dia = i;
            }
        }
        System.out.printf("O dia com mais vendas foi o %dº dia com um total de %d vendas\n", dia, maiorValor);
    }
}
