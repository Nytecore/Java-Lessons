import java.util.Scanner;

public class Main {

            //(4) Main class içerisinde mekan_kontrol referansında bir metod oluşturalım.
                //(4) Buradaki işlem, program scanner ile bizden yaş isteyecek ve eğer yaş
                    //(4) < 18 olursa, "InvalidAgeException" classında yaptığımız exception
                        //(4) fırlatılacak. > 18 olursa, "mekana hoşgeldiniz" bastırılacak.

    public static void mekan_kontrol (int yas) {
        if (yas < 18) {
            throw new InvalidAgeException("Invalid Age");

        } else {
            System.out.println("Mekana hoşgeldiniz...");

        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.print("Lütfen yaşınızı giriniz : ");
        int yas = scanner.nextInt();

            /* NOT : Bu exception'ımız, unchecked exception olduğu içinaşağıdaki satırda
            (mekan_kontrol(yas);) java bunu farketmedi. Runtime Exception olduğundan.
            Burada exception farkedilmediğinden bizim bunu kendimiz öngörerek handle
            etmemiz gerekiyor. Önemli olan, yanlış girilen bilgide yanlışlığı programcıya
            vurgulamak için exception verdirmek değildir. Exception alınan bir kodlamada
            exceptipon alınan yere kadar yazılan kodlar çalışır fakat exception satırından
            sonrasındaki kodlama alanı yazılmaz orada kod çalışmayı durdurur. Bizim amacımız
            kodlama çalışmayı durdurmasın, çalışmaya devam etmesini sağlamaktır. Bunun
            için de bu satırı önceden öngörerek el ile handling yapmamız gerekiyor ve bunun
            için de try - catch durumlarına girmemiz gerekiyor. Kodlamanın durmaması gerek. */

        try {
            mekan_kontrol(yas);

        } catch (InvalidAgeException e) {
            e.printStackTrace();

            //(5) Yukarıdaki gibi try - catch bloğu ile exceptionu manuel olarak
                //(5) Önlemiş olduk ve orada e.printStackTrace() mtodu ile de yine
                    //(5) kendiyazmış olduğumuz exception classının hata mesajını
                        //(5) bastırmış olduk. Durum tamamıyla kontrolümüz altında.

        }
    }
}
