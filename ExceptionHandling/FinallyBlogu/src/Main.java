public class Main {
    public static void main(String[] args) {

        try {
            String s = null;
            System.out.println(s.hashCode());
                    // Yukarıdaki satırda NullPointerException hatası fırlatılacak.

        } catch (NullPointerException e) {
            System.out.println("Null referans hatası.");
                    // Yukarıdaki satırda da o hata yakalanmış olacak.

        } finally {
            System.out.println("Finally bloğu çalışıyor.");
                    // Buradakiler de mutlaka her finally bloğunda olduğu gibi burada da çalışacak.
                // Finally bloğu her durumda çalışacaktır. Hatayı yakalasak da yakalamasak da ya da
            // Hata olmayıp, try bloğunu çalıştırsak da finally her durumda istisnasız çalışır.
        }
    }
}
