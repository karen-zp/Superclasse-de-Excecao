public class TesteExcecoes {
    public static void main(String[] args) {
        try {
            throw new ExceptionC("Lançada ExceptionC");
        } catch (ExceptionA e) {
            System.out.println("Capturada por ExceptionA: " + e.getMessage());
        }

        try {
            throw new ExceptionB("Lançada ExceptionB");
        } catch (ExceptionA e) {
            System.out.println("Capturada por ExceptionA: " + e.getMessage());
        }

        try {
            throw new ExceptionA("Lançada ExceptionA");
        } catch (ExceptionA e) {
            System.out.println("Capturada por ExceptionA: " + e.getMessage());
        }
    }
}
