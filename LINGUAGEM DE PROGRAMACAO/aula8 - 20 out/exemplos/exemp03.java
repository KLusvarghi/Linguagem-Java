import java.util.Scanner;
// Escreva um programa em Java contendo 
// um método que recebe dois números 
// positivos como parâmetros e retorne a 
// soma dos números inteiros existentes 
// entre eles (inclusive).

public class exemp03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
   
        System.out.print("Informe 2 numeros inteiros: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        
        System.out.printf("Soma dos valores entre %d e %d: %d\n", num1, num2, somarValores(num1, num2));
        in.close();
    }

    public static int somarValores(int a, int b){

        int somador = 0;

        if(a > b){
            int aux = b;
            b = a;
            a = aux;
        }
        for (int y = a; y <= b; y++){
            somador += y;
        }
        return somador;

    }
}
