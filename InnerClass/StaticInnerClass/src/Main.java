public class Main {

    public static void main(String[] args) {

        // -----------------------------------------------  K O N U  ---------------------------------------------- //
        //                                                                                                          //
        //  Normalde inner olmayan bir classdan obje oluştururken aşağıdaki gibi bir obje oluşumu yapılırdı :       //
        //  "Matematik.Alan alan = new Matematik().new Alan();" ---> sonrasında da çağrım yapılabilirdi.            //
        //  Burada classlar static olduğunda obje oluşturma işlemi aşağıdaki şekilde yapılacaktır :                 //
        //  Matematik.Alan alan = new Matematik.Alan(); ---> Bu direkt olarak staticten bir obje oluşumu yapar.     //
        //  Hatta yine class içerisinde yer alan metod da static olursa aşağıdaki gibi obje olulturabiliriz :       //
        //  "Matemarik.Alan.statik_daire_alan();" ---> Bu şekilde oluşturulan bir kodlamada şunu söylemiş oluruz:   //
        //  "Matematik classı altında class olan Alan classının içindeki statik_daire_alan metoduna direkt eriş"    //
        //  static inner class farkı işte bu objelşeri yaratırken sağladığı kolaylık sayesinde ortaya çıkmaktadır.  //
        //                                                                                                          //
        // -------------------------------------------------------------------------------------------------------- //


        Matematik.Alan alan = new Matematik.Alan();

        alan.daire_alan(5);

        Matematik.Alan.statik_daire_alan(6);

    }
}
