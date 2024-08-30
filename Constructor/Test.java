public class Test {

    public static void main(String[] args) {



        Account account1 = new Account();
        Account account2 = new Account("Ahmet Can", "ahmet@hotmail.com", "0531 234 56 78");
        Account account3 = new Account("180 033 564", 2500, "Mahmut TUNCER");
        Account account4 = new Account("154 655 779", 2500, "Yıldız TİLBE", "tilbe@tilbe.com", "0535 888 55 44");


        System.out.println("1 Numaralı hesabın ad/soyad bilgileri : " + account1.getIsim());
        System.out.println("2 Numaralı hesabın E-mail bilgileri   : " + account2.getEmail());
        System.out.println("3 Numaralı hesabın bakiye bilgileri   : " + account3.getBakiye());
        System.out.println("4 numaralı hesabın telefon bilgisi    : " + account4.getTelefonNo());

        System.out.println("\n*****************************");
        System.out.println("1 Numaralı Hesabın Bigileri");
        System.out.println("*****************************");
        account1.bilgileriGoster();
        System.out.println("\n*****************************");
        System.out.println("2 Numaralı Hesabın Bigileri");
        System.out.println("*****************************");
        account2.bilgileriGoster();
        System.out.println("\n*****************************");
        System.out.println("3 Numaralı Hesabın Bigileri");
        System.out.println("*****************************");
        account3.bilgileriGoster();
        System.out.println("\n*****************************");
        System.out.println("4 Numaralı Hesabın Bigileri");
        System.out.println("*****************************");
        account4.bilgileriGoster();




    }
}




