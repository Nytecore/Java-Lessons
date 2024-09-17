import java.util.Scanner;

public class Lesson {

    public static void main(String[] args) {


        int[] array = {1,2,3,4,5,6};        // ---> Tek boyutlu array oluşturduk

        int [][] array2 = new int[2][2];    // ---> 2 satır 2 sütunluk çok boyutlu array oluşturduk. 4 değer taşıyacak.

        array2[0][0] = 10;                  // ---> array2'nin 0. satır 0. sütununa "10" değeri verildi.
        array2[0][1] = 20;                  // ---> array2'nin 0. satır 1. sütununa "20" değeri verildi.
        array2[1][0] = 30;                  // ---> array2'nin 1. satır 0. sütununa "30" değeri verildi.
        array2[1][1] = 40;                  // ---> array2'nin 1. satır 1. sütununa "40" değeri verildi.

        // matris olarak gösterimi de şu şekilde olur ==

            //         ----------
            //         | 10  20 |
            //         | 30  40 |
            //         ----------

        // System.out.println(array2[0][0]);   ---> Bu şekilde çıktı alındığında "10" olarak çıktı verecektir.
        // System.out.println(array2[0][1]);   ---> Bu şekilde çıktı alındığında "20" olarak çıktı verecektir.
        // System.out.println(array2[1][0]);   ---> Bu şekilde çıktı alındığında "30" olarak çıktı verecektir.
        // System.out.println(array2[1][1]);   ---> Bu şekilde çıktı alındığında "40" olarak çıktı verecektir.

        // Aynı zamanda aşağıdaki şekilde değer verme işlemi de yapılabilmektedir.


        int[][] array3 = {{10,20},{30,40}};     // 2 satır ve 2 sütunluk array oluşturuldu.


        // System.out.println(array2[0][0]);   ---> Bu şekilde çıktı alındığında "10" olarak çıktı verecektir.
        // System.out.println(array2[0][1]);   ---> Bu şekilde çıktı alındığında "20" olarak çıktı verecektir.
        // System.out.println(array2[1][0]);   ---> Bu şekilde çıktı alındığında "30" olarak çıktı verecektir.
        // System.out.println(array2[1][1]);   ---> Bu şekilde çıktı alındığında "40" olarak çıktı verecektir.

        // Aynı zamanda matris değerleri kullanıcıdan da aldırılabilmektedir :

        int[][] array4 = new int[2][2];         // 2 satır ve 2 sütunluk array oluşturuldu.

        Scanner scanner = new Scanner (System.in);

        for (int i = 0; i < 2; i++ ) {          // For döngüsü i = 0, ve 2ye kadar artacak ( Array [2][2] olduğundan )

            for (int j = 0; j < 2; j++) {       // Bir for döngüsü daha aynı şekilde. ( iç içe for döngüsü )

                array4[i][j] = scanner.nextInt();       // Burada atamaları kullanıcı yapacak.

            }
        }

        System.out.println("******************");


        for (int i = 0; i < 2; i++ ) {          // Yine br for döngüsü ve yine aynı işlem dönecek.

            for (int j = 0; j < 2; j++) {       // Yine bir for döngüsü daha ( iç içe for döngüsü )

                System.out.print(array4[i][j] + " ");   // Bu sefer de atananlar bastırılacak. (print)  (BURASI)

            }
            System.out.println(" ");        // (BURASI)
        }

        // ** İşaretlenen alanlardaki " " + " " alanları, çıktının matris şeklinde çıkması için yazıldı  **












    }

}
