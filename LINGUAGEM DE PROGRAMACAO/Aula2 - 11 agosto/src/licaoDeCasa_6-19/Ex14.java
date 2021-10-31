
/*
Um comerciante comprou um produto e quer vendê-lo com um lucro de 45% se o valor da
compra for menor que R$ 20,00; caso contrário, o lucro será de 30%. Desenvolva um
programa que dado o valor do produto, imprimir o valor de venda.
*/
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o valor do seu produto: ");
        float produto = in.nextFloat();

        if (produto < 20) {
            produto = produto + (produto * 0.45f);
            System.out.println("A venda do produto com 45% em cima será de: " + produto);
        } else {
            produto = produto + (produto * 0.30f);
            System.out.println("A venda do produto com 30% em cima será de: " + produto);
        }
    }
}
