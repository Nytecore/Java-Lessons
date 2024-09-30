public class Matematik {        // (1) Inner Class oluşturuldu.

    private static double PI = Math.PI;  // (2) Inner classda bir özellik eklendi
                                         // ( Pi sayısı PI' referansı olarak atandı)

    // ---------------------------------------------- N O T ---------------------------------------------------- //
    //                                                                                                           //
    //  private double PI = Math.PI;    --> Bu şekilde yazarsak "statik_daire_alan" metodumuz içindeki işlemde   //
    //                                  yer alan ("PI", hata verecekti. Sebebi ise, static olmayan bir classdan  //
    //                                  static olan bir classa referans vermeye çalışmamızdır. Bunu yapamayız.   //
    //                                                                                                           //
    // --------------------------------------------------------------------------------------------------------- //

    public static class Alan {          // (3) Burada Inner Class içinde  iç içer olan bir static class oluşturuldu.

        public void daire_alan (int yaricap) {     // (4) Burada static classa bağlı olan bir metod oluşturuldu.
                    // (4) Bu metodda "yaricap" değer girilecek ve dairenin yarı çağı hesaplanacaktır.

            System.out.println("Dairenin Alanı : " + (PI * yaricap * yaricap));  // Yapılacak işlemler ( Pi * r2 )
        }

        public static void statik_daire_alan (int yaricap) {    // (5) Burada da aynı işlemi yapacak "static" bir
                                                                // (5) metod oluşturuldu.

            System.out.println("Dairenin Alanı : " + (PI * yaricap * yaricap));     // Yapılacak işlemler ( Pi * r2 )
        }
    }
}
          // --------------------------------------------- K O N U -------------------------------------- //
          //                                                                                              //
          //   ---> Burada durum şudur, normalde static olmayan inner class içerisinde yine aynı          //
          //   şekilde kodlar classlarda iç içe yazıldığı için kodlama bir nevi aynı olacaktı.            //
          //   Fakat asıl değişiklik main classta olacak. Orada yapılan çağırma işlemleri                 //
          //   static olmayan inner classdan farklı olacak. İşte static inner class bu şekildedir.        //
          //                                                                                              //
          // -------------------------------------------------------------------------------------------- //


