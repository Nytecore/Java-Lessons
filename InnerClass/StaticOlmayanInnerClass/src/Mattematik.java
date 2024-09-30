import java.util.Scanner;

public class Mattematik {       // (1) Öncelikle bir Inner Class oluşturalım.

    private double PI = Math.PI;    // (2) içerisine bir özellik ataması yapalım.

    public class Factorial {    // (3) Daha sonra InnerClass içerisine bir class daha oluşturalım
            // NOT : İç içe class olmuş oldu.

        public void faktoriyel() {  // (4) Bu class içerisine bir metod yazalım:
            // NOT : Bu metod faktöriyel hesaplama yapacak.

            Scanner scanner = new Scanner(System.in);

            System.out.print("Faktöriyel hesaplama için bir sayı giriniz : ");
            int sayi = scanner.nextInt();

            int faktor = 1;

            for (int i = 2; i <= sayi; i++) {
                faktor *= i;
            }
            System.out.println("Faktöriyel : " + faktor);
        }
    }

    public class Asal {         // (5) Yine InnerClass içerisine bir class daha oluşturalım.

        public boolean asalMi (int sayi) {  // (6) Bir metod oluşturalım
            // Bu classta bu metod sayesinde girilen sayının asal olup olmadığı hesaplanacaktır.

            int i = 2;

            while (i < sayi) {

                if (sayi % i == 0) {
                    return false;
                }
                i++;
            }
            return true;
        }
    }

    public class Alan {         // (7) InnerClass içinde yine bir class daha oluşturduk.

        public class DaireAlan {    // (8) InnerClass içinde ayrıca Alan Classının da içinde bir class daha oluşturalım.
                // NOT : Bu class ile iç içe iç class oluşturmuş olduk. ( InnerClass - Alan - DaireAlan)

            public void daire_alan (int yaricap) {  // (8) Dairenin alanının hesaplamasını yapacak bir metod oluşturalım.

                System.out.println("Dairenin alanı : " + (yaricap * yaricap * PI));

        }

        }
    }
}


            // OLUŞUMLAR TAMAMLANDI. ŞİMDİ DE BURADAKİ OLUŞUMLARI MAİN CLASSDA ÇAĞIRARAK KULLANMAYI GÖRELİM ----