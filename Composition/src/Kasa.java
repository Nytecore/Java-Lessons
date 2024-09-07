public class Kasa {

    private String model;

    private String uretici;

    private String malzeme;

    public Kasa(String uretici, String model, String malzeme) {
        this.setUretici(uretici);
        this.setModel(model);
        this.setMalzeme(malzeme);
    }

    public void bilgisayari_ac () {

        System.out.println("Bilgisayar açılıyor....");
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public String getMalzeme() {
        return malzeme;
    }

    public void setMalzeme(String malzeme) {
        this.malzeme = malzeme;
    }
}
