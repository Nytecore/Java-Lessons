public class Arabalar {     // Superclass

            // Arabaların genel özellikleri eklendi.
    private String marka;
    private String model;
    private String renk;
    private String motor;
    private String yakit;
    private int tekerlek_sayisi;
    private String klima;


            // Constructor oluşturuldu.
    public Arabalar (String marka, String model, String renk, String motor, String yakit, int tekerleks_sayisi, String klima) {
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.motor = motor;
        this.yakit = yakit;
        this.tekerlek_sayisi = tekerleks_sayisi;
        this.klima = klima;
    }



            // Getter & Setter oluşturuldu.
    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getYakit() {
        return yakit;
    }

    public void setYakit(String yakit) {
        this.yakit = yakit;
    }

    public int getTekerlek_sayisi() {
        return tekerlek_sayisi;
    }

    public void setTekerlek_sayisi(int tekerlek_sayisi) {
        this.tekerlek_sayisi = tekerlek_sayisi;
    }

    public String getKlima() {
        return klima;
    }

    public void setKlima(String klima) {
        this.klima = klima;
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


            // Bilgileri gösterilmesi istendi.
    public void bilgileriGoster () {
        System.out.println("Marka : " + this.marka);
        System.out.println("Model : " + this.model);
        System.out.println("Renk : " + this.renk);
        System.out.println("Motor : " + this.motor);
        System.out.println("Yakıt Tipi : " + this.yakit);
        System.out.println("Tekerlek Sayısı : " + this.tekerlek_sayisi);
        System.out.println("Klima : " + this.klima);
    }
}