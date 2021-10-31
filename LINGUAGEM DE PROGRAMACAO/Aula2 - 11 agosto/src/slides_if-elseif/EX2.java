import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite seu salário médio do último ano: ");
        double salarioMedio = in.nextDouble();
        double saldoMedio;
        if (salarioMedio <= 1000) {
            saldoMedio = (salarioMedio * 75) / 100; // ou saldoMedio = salarioMedio * 0.75;
        } else if (salarioMedio > 1000 && salarioMedio < 3000) {
            saldoMedio = salarioMedio;
        } else if (salarioMedio >= 3000 && salarioMedio < 5000) { // ou saldoMedio = salarioMedio * 1.5;
            saldoMedio = (salarioMedio * 150) / 100;
        } else {
            saldoMedio = (salarioMedio * 200) / 100; // ou saldoMedio = salarioMedio * 2;
        }
        System.out.println("O SALDO MÉDIO É: " + saldoMedio);
    }
}