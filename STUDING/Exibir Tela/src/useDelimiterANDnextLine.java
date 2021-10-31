import java.util.Scanner;

public class useDelimiterANDnextLine {
    public static void main(String[] args) throws Exception {

        // objeto leitor para ler valores digitados pelo teclado
        Scanner in = new Scanner(System.in);

        // ele configura e define os separadores, que são os dentro dos [], que neste
        // caso é \r e \n que são espaços, e o + é caso tenha mais separadores
        // in.useDelimiter("[\r\n]+"); //podendo usar o "nextLine" pra facilitar

        System.out.print("Digite seu nome completo: ");
        String nome = in.nextLine(); // bastante usado em strings o "nextLine"
        System.out.println("O nome completo é: " + nome);
    }
}
