public class comparaStrings {
    public static void main(String[] args) {
        String str1 = new String("Fatec");
        String str2 = "Fatec";
        String str3 = "fatecc";
        System.out.println("str1: " + str1 + '\n' + "str2: " + str2 + '\n' + "str3: " + str3);
        System.out.println("str1 == str2: " + (str1 == str2)); // sempre que for comparar com "==" ele dará errado pq
                                                               // não é recomendado, "==" é recomendado apenas com
                                                               // numeros
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // .equals() ele compara se a string é EXATAMNETE
                                                                       // IGUAL a que esta dentro de parentes, levandio
                                                                       // em CONTA letras miusculas e minusculas
        System.out.println("str1.equals(str3): " + str1.equals(str3));
        System.out.println("str1.equalsIgnoreCase(str3): " + str1.equalsIgnoreCase(str3)); // ele irá comparar se é
                                                                                           // igual, não leva em conta
                                                                                           // letras em maiusculos ou
                                                                                           // minusculos, só repara se
                                                                                           // tem os mesmo caracteres
        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2)); // devolve um valor, se ele é igua ele
                                                                             // devolve 0
        System.out.println("str1.compareTo(str3): " + str1.compareTo(str3)); // devolve um valor, se o PRIMEIRO é MENOR
                                                                             // que o segundo ele irá devolver um número
                                                                             // MENOR doq 0; <0
        System.out.println("str3.compareTo(str2): " + str3.compareTo(str2));// devolve um valor, se o PRIMEIRO é MAIOR
                                                                            // que o segundo ele irá devolver um número
                                                                            // MAIOR doq 0; > 0
        System.out.println("str3.compareToIgnoreCase(str2): " + str3.compareToIgnoreCase(str2)); // ele devolve NUMERO,
                                                                                                 // não leva em conta
                                                                                                 // letras MAIUSCULAS OU
                                                                                                 // MINUSCULAS, apenas
                                                                                                 // se é igual
    }
}
