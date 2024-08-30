public class Araba {

    private String renk;
    private int kapilar;
    private int tekerlekler;
    private String motor;
    private String marka;
    private String model;
    private String paket;
    private double kilometre;

    public void setRenk (String renk){
        this.renk = renk;
    }

    public String getRenk () {
        return this.renk;
    }

    public int getKapilar() {
        return kapilar;
    }

    public void setKapilar(int kapilar) {
        if (kapilar < 0) {
            System.out.println("Kapı Sayısı sıfırdan küçük olamaz!");

        } else {
            this.kapilar = kapilar;
        }
    }

    public int getTekerlekler() {
        return tekerlekler;
    }

    public void setTekerlekler(int tekerlekler) {
        this.tekerlekler = tekerlekler;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPaket() {
        return paket;
    }

    public void setPaket(String paket) {
        this.paket = paket;
    }

    public double getKilometre() {
        return kilometre;
    }

    public void setKilometre(double kilometre) {
        this.kilometre = kilometre;
    }
}
