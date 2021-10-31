
/* caso queria usar uma variavel no tipo int e outro do tipo string, terá que fazer a converão do int para o string
    porque disso? porque para salvar a mensagem digitada do usuraio terá que usa " int num = in.nextInt(); " e na string " string nome = in.nextLine"
    porem isso dará conflito caso queria exibir uma responstas com os dois na mesma frase, isso dará conflito, então tem que converter.
    
    E para isso usamos uma formula para cada tipo de variavel:
        int -> Interger -> Interger.parserInt(string)
        float -> Float -> Float.parserFloat(string)
        double -> Double -> Double.parserDouble(string)
    */
import java.util.Scanner;

public class parserInt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Qual o seu Elo? ");
        String elo = in.nextLine();

        System.out.println("Qual o seu tier? ");
        String valor = in.nextLine();
        int tier = Integer.parseInt(valor); // usado para caso queira fazer alguma operação matemática com o numero, por
                                            // que caso
                                            // imprima fazendo uma operação ele irá apenas concatenar, caso seja adição
                                            // a operação

        System.out.println("valor = " + (tier + 1));

    }
}
