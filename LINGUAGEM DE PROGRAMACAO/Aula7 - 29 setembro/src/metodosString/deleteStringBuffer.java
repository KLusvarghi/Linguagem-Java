public class deleteStringBuffer {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Fatec Praia Grande");
        str.delete(7, 11); // apenas EXCLUI os caracteres nas posições desejadas, 7 até o 10 no exemplo
        str.delete(9, str.length()); // e aqui da posição 9 até a posição final
        str.deleteCharAt(7); // deletando o espaço que ficaria entre P" "G; e ficando PG junto
        System.out.println(str);
    }
}
