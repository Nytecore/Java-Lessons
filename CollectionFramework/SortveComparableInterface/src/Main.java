import java.util.*;

        /* Sort ve Comparable Interface Konusu : Bu Konuda Sort (Sıralama) ve Comparable
        (Karşılaştırma durumlarına bakacağız. Aşağıda yapılacak işlem şu olacan: Bir
        ArrayList oluşturulacak. Normalde String tipinde oluşturduğumuz ArrayListler
        üzerinde, sıralama yani küçükten büyüğe, büyükten küçüğe ya da alfabetik olarak
        gibi işlemleri rahatlıkla yaptırtabilirdik. Bu konuda biz ArrayList üzerinden
        bir obje oluşturacağız ve bu objeye değerler ekleyeceğiz. Yani sıralama işlemi
        String'de değil obje referansından yapılacak. Durum böyle olunca, normalde String
        veri tipinde sıralama yapmak için bizim ekstra bir işlem yaptırmamıza gerek yoktur.
        Çünkü String veri tipi oluşturulurken içerisinde "comparable" denilen metodu
        otomatik olarak implemente etmektedir. Bizim sıralama yapmak için bunun yazmamıza
        ayriyeten gerek olmaz. Fakat biz burda obje referansından sıralama yaptıracağımız
        için obje olarak kullanılacağımız durum hakkındaki işlemleri kendimiz yapmamız
        gerekir. Bunu da işte az önce adı geçen "comparableTo" metodu ile yaparız. Aşağı
        projede bu işlemlerin nasıl yapıldığını ve nasıl oluşturulduğunu görelim.... */

        /* (1) Öncelikle main classın haricinde aynı modülde bir class oluşturalım:
        Oluşturduğumuz class, sıralama yapılmasını isteyeceğimiz için String
        veri tipinde olduğu gibi öncelikle yazılan değerlerin karşılaştırılmasını
        gerektirir. String veri tipinde var olan işlemi burada biz yaptıracağız. Bu
        yüzden de "Comparable" sınfını burada implemente edeceğiz.                   */


class Player implements Comparable <Player> {
    private String isim;
    private int id;
        // (2) Özellikler eklendi.

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }
        // (3) Constructor'lar yazıldı.

    @Override
    public String toString() {
        return "--> ID : " + id + " || İsim : " + isim;
    }   // (4) Bastırmada görünecek olan işlemi yukarıda kodladık.

    @Override
    public int compareTo(Player player) {
        if (this.id < player.id) {
            return -1;

        } else if (this.id > player.id) {
            return 1;

        }
        return 0;

    }           /* (5) İşte Yukarıda da bu sıralama işlemini yaptırmamız için gerekli
                olan kodlama alanını yukarıda yazdık. "compareTo" metodu ile bunu
                karşılaştıracğız ve karşılaştırma sonucunda ne yapılacağını söyleyeceğiz.

                Biz burada keylerin karşılaştırmalarını yapacağız ve küçükten büyüğe
                sıralamak istiyoruz. Bunun için, sonradan oluşturulan id, this.id'den
                büyük ise pozitif değer dönecek. Değilse negatif dönecek ve eşitse de
                nötr değer dönecektir. Bunun işlemini yukarıdaki işlemde kodladık.*/

}

        // (6) Kodun çaıştırılacağı alan olan main class ve method oluşturuluyor:
public class Main {

    public static void main(String[] args) {

            /* (7) En üstte bahsettiğimiz gibi biz ArrayList içerisine <Player> sınıfından
            yaratıldığını söylüyoruz. Sıralamayı yaptırmak için bir işlem yaptıamamız gerekecek. */


            //String tipinde sıralama yapımı oluşumu :
        System.out.println("\nString veri tipinde standart alfabetik sıralama yapımı : \n");
        List<String> list = new ArrayList<String>();

        list.add("Java");
        list.add("C++");
        list.add("Python");
        list.add("Php");
        list.add("Go");

        Collections.sort(list);

        for (String s: list) {
            System.out.println(s);
        }

            // Oluşturulan objenin sıralama yapılması için oluşturulumu :
        List<Player> player_list = new ArrayList<Player>();

        player_list.add(new Player("Bora" , 5));
        player_list.add(new Player("Kaan" , 8));
        player_list.add(new Player("Salih" , 2));
        player_list.add(new Player("Bilal" , 4));
        player_list.add(new Player("Mesut" , 9));
        player_list.add(new Player("Koray" , 7));
        player_list.add(new Player("Mustafa" , 3));

            // (8) Yukarıda oluşturulan ArrayListten sınıf içerisine değerler eklendi.

        Collections.sort(player_list);
            // (9) Bu yazılan kod ile de sıralama işlemi yaptırtıldı.

        System.out.println("\nAşağıdaki sıralama, ArrayList içinde yapılıyor :\n");
        for (Player p : player_list) {
            System.out.println(p);
            // (10) Sonrasında da yazdırma işlemi yapıldı.
        }


            /* (11) Yukarıdaki yapılan işlemleri yine TreeSet içerisinde
            yapabilmemiz mümkündür. Normalde String veri tipinde yine
            kendi içerisinde compareTo metodu implemente edildiği için
            String tipinde ekstra bir şey yapmamıza gerek kalmaz fakat
            kendi oluşturduğumuz objeler arasında sıralama yaptırmak
            istediğimizde biz yine compareTo metodunu kendimiz el ile
            eklememiz gerekir bunun için de oluşturulan objenin classını
            Comparable sınıfından implement etmemiz gerekmektedir. Sonra
            compareTo metodu, obje ile yan yana kullanılabilecektir.  */

            // Yani normalde TreeSet yapısı zaten sıralama yapar, fakat obje için ekstra işlem gerektirir.

                // TreeSet sıralaması oluşturulumu:
            Set<Player> tSet = new TreeSet<Player>();

            tSet.add(new Player("Bora", 5));
            tSet.add(new Player("Kaan", 8));
            tSet.add(new Player("Salih", 2));
            tSet.add(new Player("Bilal", 4));
            tSet.add(new Player("Mesut", 9));
            tSet.add(new Player("Koray", 7));
            tSet.add(new Player("Mustafa", 3));


        System.out.println("\nAşağıdaki sıralama, TreeSet içinde yapılıyor :\n");
            for (Player p : tSet) {
                System.out.println(p);


            }
    }
}