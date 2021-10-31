import java.util.Scanner;

import javax.swing.JOptionPane;

public class vetoresComWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] opcoes = new String[] { "Filme Homem-aranha", "Filme Homem de ferro", "Filme Vingadores", "sair" };
        int opcaoEscolha = 0;

        while (opcaoEscolha != 3) {
            opcaoEscolha = JOptionPane.showOptionDialog(null, "O que voce deseja asssitir?", "netflix",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, 0);
            System.out.println("Opção escolhida" + opcaoEscolha);

            if (opcaoEscolha != 3) {
                String mensagem = "Você assistiu " + opcoes[opcaoEscolha];
                JOptionPane.showMessageDialog(null, mensagem, JOptionPane.INITIAL_VALUE_PROPERTY, opcaoEscolha);
            }
        }

    }
}
