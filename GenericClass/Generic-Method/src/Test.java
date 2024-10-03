public class Test {

    public static void main(String[] args) {

        Sayisal sayisal1 = new Sayisal(30,40,20,30);
        Sayisal sayisal2 = new Sayisal(25,45,2,35);

        Sayisal birinci = birinci(sayisal1 , sayisal2);

        EsitAgirlik esitagirlik1 = new EsitAgirlik(30, 20, 40,2);
        EsitAgirlik esitagirlik2 = new EsitAgirlik(40, 10, 50, 0);

        EsitAgirlik birinci2 = birinci(esitagirlik1 , esitagirlik2);

        System.out.println("Sayısalda birinci olan öğrencinin puanı : " + birinci.puanHesapla());
        System.out.println("Eşit ağırlıkta birinci olan öğrencinin puanı : " + birinci2.puanHesapla());


    }

    public static <E extends Aday> E birinci(E e1 , E e2) {

        if (e1.puanHesapla() > e2.puanHesapla()) {
            return e1;

        } else {
            return e2;

        }
    }
}


/*
        Character[] char_dizi = {'J' , 'A' , 'V' , 'A'};
        Integer[] integer_dizi = {1,2,3,4};
        String[] string_dizi = {"Python" , "C++" , "JavaScript" , "C#" , "Kotlin"};

        Ogrenci[] ogrenci_dizi = {new Ogrenci("Bora"),new Ogrenci("Kaan"),new Ogrenci("Aydın")};


        System.out.println("**************");
        yazdir(char_dizi);
        System.out.println("**************");
        yazdir(integer_dizi);
        System.out.println("**************");
        yazdir(string_dizi);
        System.out.println("**************");
        yazdir(ogrenci_dizi);
        System.out.println("**************");


    }

    public static <E> void yazdir (E[] dizi) {

        for (E e : dizi) {
            System.out.println(e);
        }
        */
