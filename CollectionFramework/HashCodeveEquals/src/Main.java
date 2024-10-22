import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

    // (1) Bir class oluşturalım, içerisine iki değer oluşturalım.
    class Player {
        private String isim;
        private int id;

        // (2) Constructor oluşturduk.
        public Player(String isim, int id) {
            this.isim = isim;
            this.id = id;
        }
        // (3) Override methods --> Object --> toString oluşturduk.
        @Override
        public String toString() {
            return "|||| ID: " + id + " Name: " + isim + " ||||";
        }

        //***********************************************************************************************

        @Override
        public boolean equals(Object object) {
            if (this == object) return true;
            if (object == null || getClass() != object.getClass()) return false;
            Player player = (Player) object;
            return id == player.id && Objects.equals(isim, player.isim);
        }

        @Override
        public int hashCode() {
            return Objects.hash(isim, id);
        }

        /* (7) İşte burada yapılan işlem, HashCode / equals işlemidir. Main metodda anlatılan
        durumu bu kodlama ile yaparız. Bu kodlamayı bizim yazmamıza gerek yoktur. IDE, Gerenate
        fonksiyonu ile bizim için tek tuş ile bu kodu üretir. Bu kodlama sayesinde kontrol yapılır
        ve aynı olan değerlerden biri çıkarılarak teke düşürülür. İşte bu işlem  HASHCODE ve EQUALS
        işlemidir.                                                                          */

        //***********************************************************************************************
    }

public class Main {

    public static void main(String[] args) {

        /*      ---- AÇIKLAMA ----
        Hash ya da Map objesi oluşturulurken normalde bir değer ya da key, bir kez
        depolanabilirdi. Class oluşturarak referansı ile set veya map sınıfı objesi
        oluşturulduğunda değerleri ve keyleri aynı ise, bu durumda birden çok kez
        depolanabilir. Eğer biz objedeki değerlerin de birden fazla depolanmasını
        istemiyorsak java'da ona göre bir işlem yaptırtmamız gerekmektedir. Javada
        HashCode ve equals diye kavramlar vardır. Bu kavramlar, class oluşumu ile
        yaratılan set veya map sınfından objelşerin value ve keylerinin kontrolünü
        yapar. İki durum da aynı ise birini depolar, iyi durum farklı ise de her
        ikisini de depolar. Bunu aşağıdaki şekilde örneklendrelim...           */


        Set<Player> hashset = new HashSet<Player>();
                    // (4) HashSet sınıfından "hashset" referansında bir set oluşturuldu.
                        // Bu sete dönen değer olarak Player sınıfı gönderildi.

        Player player1 = new Player("Bora" , 5);
        Player player2 = new Player("Murat" , 2);
        Player player3 = new Player("Mustafa" , 8);
        Player player4 = new Player("Bora" , 5);

            // (5) Burada Player sınıfından objeler üretildi. Atamalar yapıldı.
                // Dikkat edilirse burada Bora değerinde ve 5 id'si ile 2 adey aynı obje var.
                    // Bu objeler yazdırıldığında ikisi de yazdırılır. Biz onların kontrol ettirip
                        // Aynı olanları 1 kere yazdır demek için bir işlem yapmalıyız.
                            // İşte bu işlemler HashCode ve equals işlemleridir.

        hashset.add(player1);
        hashset.add(player2);
        hashset.add(player3);
        hashset.add(player4);

        for (Player p : hashset) {
            System.out.println(p);
        }

        /* (6) Buradaki bastırma işleminde "İsim: Bora - ID: 5" değeri 2 kez bastırıldığını
        görürüz. anlatıldığı üzere, burada bu işlemin olmasının sebebi, java normalde
        kendisi aynı değer ya da keyden başka var mı diye kontrol yapıyor fakat, aynı
        class içindeki değerlere yapıyor. Farklı classdan oluşturulan Set sınıfı,
        main class içerisine farklı objeler ile gelebiliyor. Bu durumda bellekte farklı
        yerleri işaret ettikleriş için aslında java oradaki kontrolu yapmıyor fakat
        o kontrolü biz yapabiliyoruz. Aynı değerden ya da keyden iki adet var mı bunu
        kontrol et ve varsa birini bastır ya da kullan diyebiliyoruz. Bunu da bu konuda
        adı geçen HashCode ve Equals metodları ile yapıyoruz. Bunun örneğini yapalım --->>
         */


        // Bu işlemler, özelliklerin oluşuğ çağırdığı yerde yani Player sınıfında yapılacaktır.


    }
}
