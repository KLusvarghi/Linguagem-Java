import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int lado1, lado2, lado3;
        System.out.println("Digite três valores inteiros: ");
        lado1 = in.nextInt();
        lado2 = in.nextInt();
        lado3 = in.nextInt();
        if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("Este é um triângulo EQUILÁTERO");
        }

        else if (lado1 == lado2 && lado1 != lado3 || lado2 == lado3 && lado2 != lado1
                || lado1 == lado3 && lado1 != lado2) {
            System.out.println("Este é um triângulo ISÓSCELES");
        } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
            System.out.println("Este é um triângulo ESCALENO");
        } else {
            System.out.println("VALOR INVÁLIDO");
        }
    }
}
