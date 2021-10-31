/*
Um comerciante calcula o valor de venda, tendo em vista a tabela a seguir:Valor da Compra Valor da Venda
Valor < R$ 10,00 Lucro de 70%
R$ 10,00 ≤ Valor < R$ 30,00 Lucro de 50%
R$ 30,00 ≤ Valor < R$ 50,00 Lucro de 40%
Valor ≥ R$ 50,00 Lucro de 30%
Criar um programa que possa entrar com o valor da compra e imprimir o valor da venda
*/

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o valor da venda: ");
        double venda = in.nextDouble();

        if (venda < 10) {
            System.out.println("Com o lucro a venda sairá R$" + (venda = venda + (venda * 0.70)));
        } else if (venda <= 10 && venda < 30) {
            System.out.println("Com o lucro a venda sairá R$" + (venda = venda + (venda * 0.50)));
        } else if (venda <= 30 && venda < 50) {
            System.out.println("Com o lucro a venda sairá R$" + (venda = venda + (venda * 0.40)));
        } else {
            System.out.println("Com o lucro a venda sairá R$" + (venda = venda + (venda * 0.30)));
        }
    }
}
