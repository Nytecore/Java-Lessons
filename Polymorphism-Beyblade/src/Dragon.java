public class Dragon extends Beyblade{       // Subclass

            // Create a features
    private String kutsalCanavar;
    private String gizliYetenek;

            // Create constructor
    public Dragon(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar, String gizliYetenek) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;

    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal canavar adı : " + kutsalCanavar);
        System.out.println("Gizli Yetenek : " + gizliYetenek);

    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci() + kutsalCanavar +"ı ortaya çıkarıyor...");
        System.out.println(getBeybladeci() + "ın hamlesi : Hayalet Kasırgası");

    }
}
