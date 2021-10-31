import java.util.Scanner;

public class exemp002 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = in.nextInt();

        String resul = impPar(num);
        System.out.println(resul);
        in.close();
    }

    public static String impPar(int num) {
        
        String resul;
        if (num % 2 == 0) {
            resul = "Par";
        }else{
            resul = "Ímpar";
        }
        return resul;

        // if (num % 2 == 0) {
        //     String resul = "Par";
        //     return resul;
        // }
        // String resul = "Ímpar";
        // return resul;
    }
}
