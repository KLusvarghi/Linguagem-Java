import javax.swing.JOptionPane;

public class classMath {
    public static void main(String[] args) throws Exception {
        int numero1 = 50;
        int numero2 = 6;

        // esse double é um "cache" forçando o numero em double, pq sem elea conta dará
        // "2", por causa que os numeros são em "int"
        // ou volocar o numero com "5.0 ou 2.0"
        double resultado = (double) 5 / 2;
        int resto = 11 % 2;
        int multiplo = numero1 % 10; // se der "0" é pq é multiplo
        JOptionPane.showMessageDialog(null, resultado, "class math", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, resto, "class math", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, resto, "multiplo", JOptionPane.INFORMATION_MESSAGE);

        int i = 0;
        int contador = 0;
        int subitracao = 0;
        int multiplicação = 1;
        for (i = 0; i <= 4; i++) {
            JOptionPane.showMessageDialog(null, contador, "multiplo", JOptionPane.INFORMATION_MESSAGE);
            contador += 3; // é a mesma coisa se digitasse contador = contador + 3
            JOptionPane.showMessageDialog(null, subitracao, "multiplo", JOptionPane.INFORMATION_MESSAGE);
            subitracao -= 3; // é a mesma coisa se digitasse contador = contador - 3 //da pa colocar contador
                             // --; seria a o inverso de contador ++;
            JOptionPane.showMessageDialog(null, multiplicação, "multiplo", JOptionPane.INFORMATION_MESSAGE);
            multiplicação *= 3; // é a mesma coisa se digitasse contador = contador *3
        }

        int num1 = -5;
        int num2 = 55;

        int valorMaior = Math.max(num1, num2);
        double valorMenor = Math.min(num1, num2); // descobrir o menor numero
        double arredondarCima = Math.ceil(10.83); // arredondando o numero pra cima
        int absoluto = Math.abs(num1); // ele retorna numero absoluto, se é negativo, vira positivo
        int elevado = (int) Math.pow(num2, 2); // vai fazer o numero elevado a quando vc preferir - tendo que fazer o
                                               // "cache" pq mathPow da em double

        JOptionPane.showMessageDialog(null, valorMaior);
        JOptionPane.showMessageDialog(null, valorMenor);
        JOptionPane.showMessageDialog(null, arredondarCima);
        JOptionPane.showMessageDialog(null, absoluto);
        JOptionPane.showMessageDialog(null, elevado);

    }
}
