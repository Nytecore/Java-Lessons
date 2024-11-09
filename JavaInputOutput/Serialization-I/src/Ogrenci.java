import java.io.Serializable;

public class Ogrenci implements Serializable {

    // (NOT ------->>>>)
    private static final long SerialVersionUID = 1000;

        /* Yukarıdaki gibi bir şey yaptığımızda, biz şu anki classımıza bir SerialVersionUID
        ataması yaptık ve eğer her hangi bir değişiklik yaparsak, buSerialVersionUID'yi değiştirmek,
        java'ya "bu classı artık değiştir" demenin bir yolu olacaktır. Oraya atanan "1000" değeri
        önemli değildir. İstediğimizi yazabiliriz fakat değişiklik yaptığımızda onun da değişmesi
        gerekecektir.   */


    /*  Burada bir Ogrenci.java classı oluşturuldu. Biz buradan üretilen bir
    objeyi direkt olarak serileştirme işlemi yapacağız..

        Bunun için, eğer biz bir serileştirme işlemi yapacaksak, işlemi yapa-
    cağımız classı mutlaka ve mutlaka "Serializable" interface'ini implemente
    edecek şekilde yazmamış gerekmektedir.*/

    private String isim;
    private String bolum;
    private int id;

    // Sonradan değiştirilecek alan:
    private String dersler;
    // Biz burada değişiklik yaptığımız için bizim güvenlik açısından yukarıdaki "SerialVersionUID" yi de
        // Değiştirmemiz gerekmektedir. Yoksa hata verecektir. IOException oluşacaktır yani bize
            // "sen SerialVersionUID = 100 şeklinde bir şey yazmışsın, sonra classında bir değişiklik
                // yapmışsın ama SerialVersionUID'yi değiştirmemişsin" diyecek.

    public Ogrenci(String isim, String bolum, int id) {
        this.isim = isim;
        this.bolum = bolum;
        this.id = id;
    }

    @Override
    public String toString() {
        String bilgiler = "Öğrenci İsmi: " + isim +
                          "\nÖğrenci Numarası: " + id +
                          "\nÖğrenci Bölüm: " + bolum + "\n";

        return bilgiler;
    }
}

        /* NOT: SON OLARAK BAŞKA BİR KONU DAHA VAR...
        Örneğin bizim 2 adet makinamız olsun, (PC) birincisinde Ogrenci.java yukarıdaki gibi
        yazılmış olsun ve diğer makinada Ogrenci.java'ya ekstra bir özellik daha eklenmiş olsun.
        2 Classın versiyonu farklı olduğu için bizim bunları ekstra olarak söylememiz gerekmekte.

        Yani eğer biz classı değiştireceksek bunun belli bir versiyon kontrolünü de değiştirmemiz
        gerekir. Yani eğer bir classı Version1 olarak yazdıysak ve daha sonra bu classı değştirdi-
        ğimiz zaman onu da Version2 olarak yazmalıyız ki onu java otomatik olarak algılasın ve bize
        bir hata olduğunu belirtsin. Eğer böyle bir şey yapmazsak, herhangi bir hata olmadan biz
        objeyi okuruz ve başımıza önemli bir projelerde kötü sonuçlarla karşılaşabiliriz. Çünkü
        2 class da farklı class olmuş olur. O yüzden eğer bir classa bir versiyn kontrol atamak
        istiyorsak şöyle yapmamız gerekmektedir. Bizim bir tane "SerialVersionUID" diye bir
        özelliğimiz var. Bu, o classın o anki versiyonunu javaya söylemek için oluşturulan bir
        değişken olur. Peki bu nasıl yapılır ----->> (Ogrenci classı içindeki NOT'a BAK)
         */
