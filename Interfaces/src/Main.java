public class Main {

    public static void main(String[] args) {

        // IMuhendis muhendis1 = new IMuhendis();       ----> Interface'den obje oluşturulamaz. Onun yerine :

        IMuhendis muhendis1 = new pcMuhendisi(false,false);   // Class obje olarak alınır.
        MakineMuhendisi muhendis2 = new MakineMuhendisi(true, false); // Diğer class obje olarak alındı.

        String[] pcTecrube = {"Vestel","Havelsan","TurkSAT"};     // Interface için oluşturulan arrayler atandı.
        String[] makTecrube = {};                                 // Tecrübesiz makina mühendisi.
        String[] makReferans = {"Mustafa Murat Coşkun" , "Bora Yıldırım"};  // Makina Mühendisi referansları.


        System.out.println("\n  ---------- BİLGİSAYAR MÜHENDİSİNİN BAŞVURUSU ----------");
        muhendis1.askerlik_durumu_sorgula();
        muhendis1.adli_sicil_sorgula();
        System.out.println(muhendis1.mezuniyet_ortalamasi(3.43));
        muhendis1.is_tecrubesi(pcTecrube);

        System.out.println("\n  ---------- MAKİNA MÜHENDİSİNİN BAŞVURUSU ----------");
        muhendis2.askerlik_durumu_sorgula();
        muhendis2.adli_sicil_sorgula();
        System.out.println(muhendis2.mezuniyet_ortalamasi(2.31));
        muhendis2.is_tecrubesi(makTecrube);
        muhendis2.referans_getir(makReferans);      // ------------->>>
            /*
            Not: "((MakineMuhendisi)muhendis2)" bu şekilde de yapılabilir ;
            ya da başta obje oluştururken oraya "IMuhendis" yazılacağına,
            "MakinaMuhendisi" yani direkt class'ın adı yazılarak obje yine
            oluşturulabilir. Öyle olunca dönüşüme gerek kalmaz yani direkt
            olarak "muhendis2.referans_getir(makReferans);" şeklinde yazılır.
            Ama ekstradan neden tür dönüşümü yapalım? Onun yerine daha
            güvenli olarak sade hali ile yazmak daha mantıklı olur.
             */

        System.out.println(" ");        // Boş bir satır..
        muhendis2.calis();

    }
}