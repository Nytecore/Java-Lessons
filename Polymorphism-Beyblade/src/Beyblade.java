public class Beyblade {         // Superclass

            // Features.
    private String beybladeci;
    private int donusHizi;
    private int saldiriGucu;

            // Constructor
    public Beyblade(String beybladeci, int donusHizi, int saldiriGucu) {
        this.beybladeci = beybladeci;
        this.donusHizi = donusHizi;
        this.saldiriGucu = saldiriGucu;
    }

            // Getter & Setter
    public String getBeybladeci() {
        return beybladeci;
    }

            // Getter & Setter
    public void setBeybladeci(String beybladeci) {
        this.beybladeci = beybladeci;
    }

            // Getter & Setter
    public int getDonusHizi() {
        return donusHizi;
    }

            // Getter & Setter
    public void setDonusHizi(int donusHizi) {
        this.donusHizi = donusHizi;
    }

            // Getter & Setter
    public int getSaldiriGucu() {
        return saldiriGucu;
    }

            // Getter & Setter
    public void setSaldiriGucu(int saldiriGucu) {
        this.saldiriGucu = saldiriGucu;
    }

            // Attack method creating.
    public void saldir() {
        System.out.println(beybladeci + " " + saldiriGucu + " ve " + donusHizi + " ile saldırıyor...");

    }

            // View the secret beast method creating.
    public void kutsalCanavarOrtayaCikar () {
        System.out.println("Bu beyblade'in kutsal canavarı yok.");

    }
            // Show information method creating.
    public void bilgileriGoster () {
        System.out.println("Beyblade'ci adı : " + beybladeci);
        System.out.println("Beyblade dönüş hızı : " + donusHizi);
        System.out.println("Beyblade saldırı gücü : " + saldiriGucu);

    }
}
