public class Drayga extends Beyblade{       // Subclass

            // Create a feature.
    private String kutsalCanavar;

            // Constructor
    public Drayga(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;

    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal canavar adı : " + kutsalCanavar);

    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci() + kutsalCanavar +"ı ortaya çıkarıyor...");
        System.out.println(getBeybladeci() + "ın hamlesi : Kaplan Pençesi. ");

    }
}
