import java.util.Scanner;

public class Main {

    private static Card[][] cards = new Card[4][4];


   // 2 Boyutlu arrayler ile hafıza oyunu:


    public static void main(String[] args) {



        cards[0][0] = new Card ('E');
        cards[0][1] = new Card ('A');
        cards[0][2] = new Card ('B');
        cards[0][3] = new Card ('F');
        cards[1][0] = new Card ('G');
        cards[1][1] = new Card ('A');
        cards[1][2] = new Card ('D');
        cards[1][3] = new Card ('H');
        cards[2][0] = new Card ('F');
        cards[2][1] = new Card ('C');
        cards[2][2] = new Card ('D');
        cards[2][3] = new Card ('H');
        cards[3][0] = new Card ('E');
        cards[3][1] = new Card ('G');
        cards[3][2] = new Card ('B');
        cards[3][3] = new Card ('C');

        System.out.println(" ");

        while (isTheGameOver() == false) {

            gameBoard();
            System.out.println(" ");
            tahminEt();
        }

    }

    public static void tahminEt () {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\n1. Tahmininiz --> (Tahmininizi boşluklu olarak giriniz) : ");
        int i1 = scanner.nextInt();
        int j1 = scanner.nextInt();

        cards[i1][j1].setTahmin(true);
        gameBoard();

        System.out.print("2. Tahmininiz --> (Tahmininizi tahmini boşluklu olarak giriniz) : ");
        int i2 = scanner.nextInt();
        int j2 = scanner.nextInt();

        if (cards[i1][j1].getDeger() == cards[i2][j2].getDeger()) {
            System.out.println("\nDoğru tahmin, tebrikler!");
            cards[i2][j2].setTahmin(true);

        } else {
            System.out.println("\nYanlış tahmin...");
            cards[i1][j1].setTahmin(false);
        }

    }

    public static boolean isTheGameOver () {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (cards[i][j].isTahmin() == false) {
                    return false;
                }
            }
        }
        return true;

    }

    public static void gameBoard () {

        for (int i = 0; i < 4; i++) {

            System.out.println("-------------------");

            for (int j = 0; j < 4; j++) {

                if (cards[i][j].isTahmin()) {
                    System.out.print(" |" + cards[i][j].getDeger() + " |" );

                } else {
                    System.out.print(" | | ");

                }
            }
            System.out.println(" ");

        }
        System.out.println("-------------------");

    }
}
