public class Test {

    public static void main(String[] args) {

        Resolution resolution = new Resolution(1920,1080);
        Monitor monitor = new Monitor("VG27AQML1A","ASUS" , "27 inch" , resolution);

        Kasa kasa = new Kasa("ASUS" , "ROG Helios" , "Temperli Cam");

        Anakart anakart = new Anakart("X670 Crosshair HERO" , "ASUS" , 4 , "Windows 11");

        Bilgisayar pc = new Bilgisayar(monitor , kasa , anakart);

        pc.getKasa().bilgisayari_ac();
        pc.getMonitor().monitoru_kapat();

        pc.getAnakart().isletim_sistemi_yukle("macOS");

    }
}
