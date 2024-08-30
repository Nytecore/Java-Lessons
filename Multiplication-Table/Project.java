public class Project {
    public static void main(String[] args) {
        // iç içe for döngüsü kullanarak bir çarpım tablosu oluşturalım.

        for (int i = 1 ; i <= 10 ; i++) {
            System.out.println("**********************************");
            for (int j = 1 ; j <= 10; j++) {
                System.out.println( i + "x" + j + "=" + (i*j));
            }
            System.out.println("**********************************");
        }

    }
}


    /*
    Yukarıda iç içe for döngüsü kullanılarak bir çarpım tablosu oluşturuldu
    Oluşturduğumuz çarpım tablosunda ilk önce bir for döngüsü açıldı ve
    "i = 1" şeklinde bir değişken ve bir değer atandı. Sonrasında i'yi 10'a
    kadar saydırdık. ( i < 10; i++) bu döngünün altında yine bir for döngüsü
    açtık ve burada da "j = 1" adında bir değişken ve değer ataması yaptık.
    Burada da yine j, 10'dan küçük ise 10'a kadar say işlemi gerçekleştirttik.
    (j < 10; j++) Çalışma prensibi şu şekilde, öncelikle yukarıdaki for döngüsü
    çalışacak, i, 1 olduktan sonra döngü aşağı inecek ve j, 10'a kadar sayacak.
    Sonrasında döngü en başa dönecek (j görevini tamamlayacak (j<10)). i, 2'nin
    görevi daha bitmedi, 2 olacak ve tekrar alttaki j döngüsü devreye girerek
    10'a kadar gidecek. Bu, iki sayı da 10 olana kadar devam edecek. Bu arada da
    içerideki for döngüsüne bir işlem yaptırdık. Her gidip gelen bir adımda
    i ile j birbirleriyle çarpılsın ve sonuç gösterilsin dedik ve çarpım tablomuz
    oluşturulmuş oldu.
    */
