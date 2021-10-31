public class insertStringBuffer {
    public static void main(String[] args) {
        StringBuffer strBuffer = new StringBuffer(" StringBuffer");
        String str = "Fatec Praia Grande ";
        strBuffer.insert(0, str); // INSERT ele permite escolher aonde se quer acrescentar/modificar o
                                  // StringBuffer
        strBuffer.insert(str.length(), 2021);
        strBuffer.insert(5, " -");
        System.out.println(strBuffer);
    }
}
