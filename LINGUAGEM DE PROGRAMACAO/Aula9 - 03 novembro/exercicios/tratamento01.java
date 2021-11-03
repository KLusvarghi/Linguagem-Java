public class tratamento01 {
    public static void main(String[] args) {
        try {
            int i = Integer.parseInt(args[0]);
            System.out.println("i = " + i);
        } // catch (ArrayIndexOutOfBoundsException e){
        //     System.out.println("Você não passou argumentos para o programa!");
        // } catch(NumberFormatException e){
        //     System.out.println("O valor digitado não pode ser convertido para inteiro!");
        // }

        catch(ArrayIndexOutOfBoundsException | NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
}
