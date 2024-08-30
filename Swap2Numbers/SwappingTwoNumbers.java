import java.util.Scanner;

public class SwappingTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int birinci_sayi;
        System.out.print("Birinci Sayıyı Giriniz : ");
        birinci_sayi = scanner.nextInt();


        int ikinci_sayi;
        System.out.print("İkinci Sayıyı Giriniz : ");
        ikinci_sayi = scanner.nextInt();


        int gecici = birinci_sayi;
        birinci_sayi = ikinci_sayi;
        ikinci_sayi = gecici;


        System.out.println("Değişen birinci sayı : " + birinci_sayi);
        System.out.println("Değişen ikinci sayı : " + ikinci_sayi);


    }
}
