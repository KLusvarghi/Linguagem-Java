public class AppendStringBuffer {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Fatec"); // tem que ser declarado assim a stringBuffer, ela permite que
                                                      // altere o valor original dela, diferente da STRING
        str.append(" Praia Grande ");
        str.append(2021);
        char array[] = "Aula de Strings ".toCharArray();
        str.append(array, 7, 9); // ele faz um append a partir da posição 7, que é o espaço e pegas 9 caracteres
                                 // a apartir da posição 7
        str.append(array, 6, 8);// ele faz um append a partir da posição 6, que é o espaço e pegas 8 caracteres
                                // a apartir da posição 6
        str.append("Buffer");
        System.out.println(str);
    }
}
