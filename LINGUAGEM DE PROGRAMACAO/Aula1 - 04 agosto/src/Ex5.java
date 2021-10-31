
/*
Todo restaurante, embora por lei não possa obrigar o cliente a pagar, cobra 10% para o garçom.
Fazer um programa em Java que leia o valor gasto com despesas realizadas em um restaurantee imprima o valor total da gorjeta.
*/
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o valor das despesas gastas: ");
        double despesa = in.nextDouble();
        double dezPorcento = (despesa * 10) / 100; // ou despesa * 0.10
        System.out.printf("A gorjetado do garsom será de %.2f", dezPorcento);
    }

}
