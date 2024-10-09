public class FinalTest {

    // public final int obje_sayisi = 4;   -->  Final anahtar kelimesi içeren bir özellik oluşturalım;
            // Final anahtar kelimesi burada bir kez atandı. Zaten ya değeri verirken
                // Ya da constructor içerisinde bu değer oluşturulabilir ve değiştirilemez.

    // public final int obje_sayisi;    ---> Ya da bu şekilde final içeren bir özellik oluşturalım.
            // Bu özelliğe de constructor içerisinde değer verelim....      ---->>>

    public FinalTest() {

        // obje_sayisi = 5;     ----> Constructor içerisinde tekrar değer veremeyiz. Yukarda değer verildi.
        // Zaten değer vermiştin tekrar değer veremezsin gibi bir açıklama ile bir hata verir.

        // obje_sayisi = 4;     --->  İşte bu şekilde, yukarda oluşturulan özelliğe burada da değer verilebilir.


        /* Özet olarak biz "final" anahtar kelimesi kullanarak özellik oluşturacaksak,
        bu özelliğe sadece oluştururken ya da constructor içerisinde değer ataması
        yapabiliriz. Başka bir yerde değer ataması yapamayız ve önceden yaptığımız
        değer atamasını daha sonradan başka bir yerde tekrardan değiştiremeyiz.. */

    }

    public static void main(String[] args) {

        System.out.println("\nDatabase ismi : " + Database.databaseName);
        System.out.println("Database kullanıcı adı : " + Database.userName);
        System.out.println("Database şifresi : " + Database.password);

            // Burada direkt olarak özelliklere erişerek, onları yazdırdık.
                // Bu özellikler her yerden erişilebilir ve tekrar değiştirilemez.

        // İşte bu şekilde "final" anahtar kelimesi kullanarak kodumuzu daha güvenli şekilde yazabiliriz.
    }
}
