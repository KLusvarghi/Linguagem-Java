import java.util.Scanner;

public class estruturaWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numero = 0;
        while (numero != 6) {
            System.out.println("Digite um numero: ");
            numero = in.nextInt();
            System.out.println("Digitou o número " + numero);
        }
        System.out.println("Digitou o número 6!!!");
    }
}
