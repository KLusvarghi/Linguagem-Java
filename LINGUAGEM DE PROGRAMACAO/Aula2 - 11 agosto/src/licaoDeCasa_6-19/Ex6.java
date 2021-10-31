
/*  A prefeitura de Santos abriu uma linha de crédito para funcionários estatutários.
 O valor máximo da prestação não poderá ultrapassar 30% do salário bruto. Fazer um programa que
permita entrar com o salário bruto, o valor do empréstimo e o número de parcelas e informar
o valor da parcela, se o empréstimo pode ou não ser concedido e caso o não possa ser
concedido, informar o valor máximo da parcela
*/
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o salário bruto: R$");
        double salarioBruto = in.nextDouble();
        System.out.print("Digite o valor do empréstimo: R$");
        double emprestimo = in.nextDouble();
        System.out.print("Digite o número de parcelas: ");
        double parcelas = in.nextDouble();

        double prestacao = emprestimo / parcelas;
        double trintaPorcento = salarioBruto * 0.30;
        if (prestacao <= trintaPorcento) {
            System.out.println("EMPRESTIMO CONCEDIDO!");
        } else {
            System.out.printf("O emprestimo nao pode ser concedido.\nO valor maximo da parcela é de R$ %.2f\n",
                    trintaPorcento);
        }
    }
}
