public class Main {

    public static void ucuncu_fonksiyon() {
        //try {
            int i = 12 / 0; // -----> Arithmetic Exception

        //} catch (ArithmeticException e) {
            // System.out.println("Bir sayı sıfıra bölünemez.");

    }

    public static void ikinci_fonksiyon() {
        // try {
            ucuncu_fonksiyon();
        // } catch (ArithmeticException e) {
           // System.out.println("Bir sayı sıfıra bölünemez.");

    }

    public static void birinci_fonksiyon() {
        // try {
        ikinci_fonksiyon();
        // } catch (ArithmeticException e) {
        // System.out.println("Bir sayı sıfıra bölünemez.");
    }

    public static void main(String[] args) {
        try {
            birinci_fonksiyon();
        } catch (ArithmeticException e) {
            System.out.println("Bir sayı sıfıra bölünemez.");
        }
    }
}
