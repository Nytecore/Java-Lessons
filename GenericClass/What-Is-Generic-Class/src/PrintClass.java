public class PrintClass <E> {

    /* Yukarıda class oluşumunun yanında bir "<E>" oluşturuldu. Bu ne demek?
    Ben sana farklı türlerden veri tipleri göndereceğim ve sen gönderdiğim
    veri tipini bu "<E>" yi kullanan her yere yaz. Nasıl ? ---->>
     */

    public void print(E[] dizi) {

        for (E e : dizi) {
            System.out.println(e);
        }
    }
}

    /*
    Yukarıda E ile yazılan her yere main classta ne gönderirsek o "E" o olacak.
    String gönderirsek String, Integer gönderirsek Integer gibi davranacaktır.
    Main classta bunu yapalım ----->>>
     */
