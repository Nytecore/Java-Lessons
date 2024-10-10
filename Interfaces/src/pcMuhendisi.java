public class pcMuhendisi implements IMuhendis{

    private boolean askerlik;
    private boolean adli_sicil;

    public pcMuhendisi(boolean askerlik, boolean adli_sicil) {
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }

    @Override
    public void askerlik_durumu_sorgula() {

        if (askerlik) {
            System.out.println("Askerliğimi tamamladım...");
        } else {
            System.out.println("Askerliğimi tamamlamadım...");
        }

    }

    @Override
    public String mezuniyet_ortalamasi(double derece) {
        return "Mezuniyet Ortalamam : " + derece;
    }

    @Override
    public void adli_sicil_sorgula() {

        if (adli_sicil) {
            System.out.println("Adli sicil kaydım bulunuyor.");
        } else {
            System.out.println("Adli sicil kaydım bulunmuyor.");
        }

    }

    @Override
    public void is_tecrubesi(String[] array) {

        System.out.println("Bilgisayar mühendisi olarak şu şirketlerde çalıştım...");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}