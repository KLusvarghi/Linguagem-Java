import java.util.Scanner;
// .Escreva uma programa em Java que use 
// um método que recebe um valor inteiro 
// positivo como parâmetro e devolve 
// verdadeiro se o número for par, ou falso se 
// o número for ímpar
public class exemp02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = in.nextInt();

        System.out.println();
        System.out.print(impPar(num));
        System.out.println();


        if (impPar(num)) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
        in.close();
    }

    public static boolean impPar(int num) {
        /*
        if (x % 2 == 0) {
            return true;
        }
        return false;
        */
		return (num % 2 == 0);
    }

}
