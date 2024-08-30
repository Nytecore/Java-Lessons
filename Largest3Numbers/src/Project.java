import java.util.Scanner;

public class Project {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        // Kullanıcıdan alınan 3 farklı sayıdan en büyük olan sayıyı bulalım:

        System.out.print("\nBirinci Sayıyı Giriniz : ");
        int a = scanner.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        int b = scanner.nextInt();
        System.out.print("Üçüncü Sayıyı Giriniz : ");
        int c = scanner.nextInt();

        if ( a > c && a > b ){
            System.out.println("\t\tGirilen en büyük sayı : " + a);
        }

        else if (b > c && b > a ) {
            System.out.println("\t\tGirilen En Büyük Sayı : " + b);
        }

        else {
            System.out.println("\t\tGirilen En Büyük Sayı : " + c);
        }


        System.out.print("\nBir Sayı Daha Giriniz : ");
        int d = scanner.nextInt();
        System.out.print("Bir Sayı Daha Giriniz : ");
        int e = scanner.nextInt();
        System.out.print("Son Sayıyı Giriniz : ");
        int f = scanner.nextInt();

        int min = 0;

        if ( d < e && d < f ) {

            min = d;
        }

        else if ( e < f && e < d) {

            min = e;
        }

        else {

            min = f;
        }

        System.out.println("\t\tGirilen En Küçük Sayı : " + min);
    }


}
