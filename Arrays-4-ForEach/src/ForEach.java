public class ForEach {

    public static void main(String[] args) {
        System.out.println(" ");

        // Bu derste genellikle arraylarda kullanılan forEach döngüsünün kullanımını göreceğiz.

            // Bir array tanımlayalım :
        String[] array = {"Domates" , "Biber" , "Patlıcan" , "Patates" , "Limon"};


            // Bu arrayi bastırmak için şu satırlar yazılır:
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

            /* FAKAT orada yazılan "for (int i = 0; i < array.length; i++)"
            yerine daha efektif, daha kısa ve daha kolay yazılan bir kod olan
            şu ifade yazılabilir : "for ( String a : array)" sadece bu satır ile
            aynı işlemi yaptırabiliriz.. Deneyelim :
             */


        System.out.println("\n---------- ForEach ile yazalım ---------\n");
        String[] array2 = {"Kiraz" , "Şeftali" , "Muz" , "Çilek" , "Kivi"};
        for (String a : array2) {
            System.out.println(a);
        }


            /* Aynı zamanda şöyle bir kullanım da mümkündür. Bu module içerisinde
            "Deneme" adında başka bir class oluşturduk. İçerisine "String isim;"
            adında bir özellik ekledik, ve altında bir constructor oluşturup onun
            da altında bir metod oluşturduk. Bu metod yazdırmamızı sağlayacak.
            Burada da o classdan objeler oluşturalım ve objelere değerler vererek
            objeyi ve metodu çağırıp kodlamamıza bakalım :
             */

        System.out.println("\n---------- ForEach Objeler Kullanımı ---------\n");

        Deneme[] array3 = {new Deneme("Mustafa"), new Deneme("Kemal") , new Deneme("ATATÜRK")};

        for (Deneme d : array3) {
            d.yaz();
        }

    }
}
