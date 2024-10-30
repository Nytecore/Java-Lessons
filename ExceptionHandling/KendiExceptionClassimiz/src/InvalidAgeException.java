public class InvalidAgeException extends ArithmeticException {
            //(1) Kendi exception classımızı oluşturuyoruz ve Artithmetic Exception'dan
                //(1) extend ediyoruz.

    public InvalidAgeException (String message) {
        super(message);
            //(2) InvalidAgeEcception classımıza Constructor oluşturuyoruz.
                //(2) İçerisine de message stringi gönderiyoruz.

    }
    @Override
    public void printStackTrace() {
        System.out.println("Bu bir Invalid age hatasıdır...");
            //(3) Override method --> printStackTrace() yaparak verdiği mesajı override ediyoruz.
                //(3) Hata mesajını da "Bu bir InvalidAge hatasıdır..." mesajı verdiriyoruz.

        // -------->> Main Classa gidelim ve bunu kullanalım...

    }
}
