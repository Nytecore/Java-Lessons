import java.util.ArrayList;
import java.util.Iterator;



public class Radyo implements Iterable<String> {

    @Override
    public Iterator<String> iterator() {

        // return kanallar_listesi.iterator();

        return new RadyoIterator();           //   ---->> Implementasyon
            // (7) Kendi iterable classımızı bu şekilde oluşturmuş oluyoruz.
                // (7) Bu sayede Radyo ve bu gibi classların üzerinde forEach döngüsü kullanabilir,
                    // (7) ve iterator oluşturabiliriz.
    }

    private ArrayList<String> kanallar_listesi = new ArrayList<String>();

    public class RadyoIterator implements Iterator<String> {
                // (3) Burada kendi iterator classımızı nasıl oluştururuz onu yapacağız.

        private int index = 0;
                // (4) index kanallar listesinde gezinecek ve her next dediğimizde bu indeksimiz 1 artacak.


        @Override
        public boolean hasNext() {
            // (5) Yukarıdaki metodla başka gidilecek bir yer var mı ona bakıyoruz.
                // (5) normal .hasNext() mwtounun yaptığı işi manuel olarak biz yaptırıyoruz.

            if (index < kanallar_listesi.size()) {
                return true;

            } else {
                return false;

            }
        }

        @Override
        public String next() {
            String deger = kanallar_listesi.get(index);
            index ++;

            return deger;
                // (6) Aynı şekilde normal .next() metodunun yaptığı işi manuel olarak biz burada yaptırtmış oluyoruz.
                    // (6) Sonrasını implementasyon içinde yazıyoruz.
        }
    }

    public Radyo (String[] kanallar) {

        for (String kanal : kanallar) {
            kanallar_listesi.add(kanal);
        }
    }
}
