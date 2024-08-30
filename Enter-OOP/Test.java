public class Test {

    public static void main(String[] args) {

        Araba araba1 = new Araba();

        araba1.setRenk("Kırmızı");
        araba1.setKapilar(4);
        araba1.setTekerlekler(4);
        araba1.setMarka("Skoda");
        araba1.setModel("Octavia");
        araba1.setMotor("1.6 TDI 105 HP");
        araba1.setPaket("Optimal");
        araba1.setKilometre(207.565);

        System.out.println("\nArabanın özellikleri şunlardır : ");
        System.out.println("\nMarka: " + araba1.getMarka());
        System.out.println("Model: " + araba1.getModel());
        System.out.println("Paket : " + araba1.getPaket());
        System.out.println("Motor: " + araba1.getMotor());
        System.out.println("Kilometre: "+ araba1.getKilometre() + " k.m.");
        System.out.println("Tekerlek Sayısı: " + araba1.getTekerlekler());
        System.out.println("Kapı Sayısı: " + araba1.getKapilar());
        System.out.println("Renk: " + araba1.getRenk());

    }
}
