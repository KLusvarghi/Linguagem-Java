import java.util.Scanner;

// Escreva um programa em Java contendo um método que receba dois valores, sendo um dos valores o preço antigo de um produto e o outro o preço atual. O método deverá calcular e retornar o percentual de acréscimo entre esses preços.

public class ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o preço atual e o antigo do produtos:");
        float atual = in.nextFloat(), antigo = in.nextFloat();
        calcular(atual, antigo);
        System.out.printf("Percentual de acréscimo: %.2f %%\n", calcular(atual, antigo));
    }

    public static float calcular(float at, float an) {
        float resul = ((at - an) / an) * 100;
        return resul;
    }
}
