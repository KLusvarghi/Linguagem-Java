import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class switchCase3 {
    private static int showConfirmDialog;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String origem = "";
        String personagem = "";
        String nomeimagem = "";
        System.out.println("Digite o nome de um personagem do Dagolball: ");
        personagem = in.next();
        personagem = personagem.toLowerCase();

        switch (personagem) {
            case "goku":
                origem = "Planeta Sayajin";
                nomeimagem = "goku-icone";
                break;
            case "piccolo":
                origem = "Planeta Sayajin";
                nomeimagem = "piccolo-icone";
                break;
            case "vegeta":
                origem = "Planeta Sayajin";
                nomeimagem = "vegeta-icone";
                break;
            case "bulma":
                origem = "Planeta terra";
                nomeimagem = "bulma-icone";
                break;
            case "kuririn":
                origem = "Planeta terra";
                nomeimagem = "kuririn-icone";
                break;
            default:
                origem = "Desconhecido";
                nomeimagem = "default";
                break;
        }
        // String caminhoImagem = String.format("C:/Users/Cesar-NB02/Documents/PROJETO
        // JAVA/STUDING/switchCase/src/imagem/%s.png", nomeimagem"); --- este é o
        // caminho da imagem

        String caminhoImagem = String.format(
                // tendo que colocar "\\" ou apenas "/".

                "C:\\Users\\Cesar-NB02\\Documents\\PROJETO JAVA\\STUDING\\switchCase\\src\\imagem\\%s.png", nomeimagem);
        ImageIcon icone = new ImageIcon(caminhoImagem); // criando um novo objeto/classe para importar a imagem, chamado
                                                        // "ImageIcon"

        String informacaoPersonagem = String.format("Personagem: %s\nOrigem: %s", personagem, origem);

        JOptionPane.showConfirmDialog(null, informacaoPersonagem, "switchCase", JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, icone);
    }
}
