import java.util.Scanner;

public class Main {


    /*          -----------   NOT   ---------------
    Burada yapılacak işlem şu olacak: Öncelikle bir işlemler paneli açılacak. Kullanıcı
    Burada yapmak istediği işlemleri seçecek. Yanlış bir tuşlama yaparsa, buna yönelik
    bir mesaj ile karşılaşacak. Kare alanı hesaplaması yapılacak ise Kare adlı Class'ın
    içinde oluşturulan metod ve özellikler buraya çağrılacak, Üçgen için ve Daire için
    yine aynı durumlar geçerli olacaktır. Kullanıcı "q" tuşuna basarsa programdan çıkı-
    lacaktır. Yine Yapılacak olan işlemler içerisinde de daire'nin yarıçapı, üçgenin ke-
    narları ve kare'nin kenarının bilgileri yine kullanıcıdan scanner ile alınacaktır.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

            // (18) İşlemler panelinin görüntülenmesi aşağıda yaratılacak:
        String islemler = "\n\t------- İşlemler -------\n"
                + "1- Kare Alanı Hesapla\n"
                + "2- Üçgen Alanı Hesapla\n"
                + "3- Daire Alanı Hesapla\n"
                + "'q'- Çıkış";

            // (19) While/True döngüsü oluşturulacak ve içeride işlemler yaptırılacaktır.
        while (true) {

            System.out.println(islemler);
            System.out.print("\nHangi şeklin alanını hesaplamak istiyorsunuz : ");
            String sekil_turu = scanner.nextLine();
            Sekil sekil = null;

                /*                  ---- NOT ----
                Öncelikle işlemler döngü içerisinde ilk önce her zaman bastırılacaktır, sonrasında
                kullanıcıdan geri dönüş alınarak ona göre işlem yaptırılacaktır. Eksra olarak burda
                "Sekil sekil = null;" şeklinde bir kod yazıldı. Bu, Şekil abstract classından ileride
                bir obje oluşturulacak anlamındadır. Yani burda aslında "Polymorphism" yapılacaktır.
                Yani; sekil = Kare olursa, Sekil -Kare- gibi davranacak, sekil = Daire olursa, Sekil
                -Daire- gibi davranacaktır.
                 */

                    // (20) Koşullar oluşturuluyor ....

            if (sekil_turu.equals("q")) {
                System.out.println("Programdan çıkılıyor...");
                break;

                    // (21) Kullanıcı "q" tuşlaması yaparsa programdan çıkış yapılacaktır.

            } else if (sekil_turu.equals("1")) {
                System.out.print("Karenin Kenarı : ");
                int kenar = scanner.nextInt();
                scanner.nextLine();

                sekil = new Kare("Kare" , kenar);
                sekil.alanHesapla();

                    // (22) Burada kullanıcı 1'e basması durumunda Kare'den istenen yapılacak.
                        // (22) "sekil = new Kare" durumu ile Polymorphism yapılacak ve Sekil -Kare- gibi davranacaktır.
                            // (22) Bu sayede de abstract classtan direkt olarak alamadığımız objeyi, ona bağlı olan,
                                // (22) Kare classından alabilmiş olacağız ve çağrım yapabileceğiz.

            } else if (sekil_turu.equals("2")) {
                System.out.print("Üçgenin 1. kenarı : ");
                int kenar1 = scanner.nextInt();
                System.out.print("Üçgenin 2. kenarı : ");
                int kenar2 = scanner.nextInt();
                System.out.print("Üçgenin 3. kenarı : ");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();

                sekil = new Ucgen("Üçgen" , kenar1 , kenar2 , kenar3);
                sekil.alanHesapla();

            } else if (sekil_turu.equals("3")) {
                System.out.print("Dairenin Yarıçapı : ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();

                sekil = new Daire("Daire" , yaricap);
                sekil.alanHesapla();

            } else {
                System.out.println("Geçersiz bir işlem yaptınız...");
            }
        }
    }
}
