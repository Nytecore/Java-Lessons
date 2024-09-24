public class Main {


    /*
    int     ---->       Integer
    char    ---->       Character
    double  ---->       Double
    boolean ---->       Boolean
    float   ---->       Float
    byte    ---->       Byte
    short   ---->       Short
    long    ---->       Long
     */

    /*
    String veri tipinde bir arraylist class oluşturulmak istendiğinde;
    " ArrayList <String> arraylist = new ArrayList <String>(); " şeklinde
    yapıyoruz. Fakat biz ilkel veri tiplerinden bir arraylist oluşturmak
    istersek, ilkel veri tipleri olduğundan jva buna izin vermiyor. Bunun
    için ilkel veri tiplerini reaper classa çevirmemiz gerekiyor. O zaman
    da yukarıda yer alan veri tiplerini yukarıdakine karşılık gelenler
    şeklinde reaper classa dönüştürebiliriz yani :

    YANLIŞ : ArrayList <int> arraylist = new ArrayList <int>();
    DOĞRU  : ArrayList <Integer> arraylist = new ArrayList <Integer> ();

    Autoboxing ve Unboxing kavramları:

    Normalde;

    for (int i = 0; i < 0; i++) {
        arraylist.add(Integer.valueOf(i*4));    // Autoboxing
    }


    for (int i = 0; i < arraylist.size(); i++) {
        arraylist.get(i).intValue());           // Unboxing
    }


        Autoboxing: Otomatik olarak "i" değerini bir integer kutu içerisine alıyoruz.
        Unboxing:   Burada da az önceki gibi kutuya aldığımız değeri kutudan çıkarmış oluyoruz.

        ***** FAKAT *****

        Java bu işlemleri zaten arkaplanda bizler için yapabiliyor. Bizim bu işlemleri
        yapmamız için o kodları uzun uzun yazmamıza gerek kalmaz. Bunun için direkt şu
        şekilde yaparsak yukarıdakine karşılık gelecektir..:

        for (int i = 0; i < 0; i++) {
            arraylist.add(i*4);             // Autoboxing ---> Yukarıdaki işlemin aynısı. Kısa hali.
        }

        for (int i = 0; i < arraylist.size(); i++) {
            arraylist.get(i);               // Unboxing   ---> Yukarıdaki işlemin aynısı kısa hali.
     */
}
