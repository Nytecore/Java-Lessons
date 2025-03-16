import java.io.*;

public class Main {



    public static void bufferedOku() {


        try {

            File dosya = new File("C://Users//Bora//Desktop//Builds.txt");
            FileReader fr = new FileReader(dosya);
            BufferedReader okuyucu = new BufferedReader(fr);
            StringBuilder sb = new StringBuilder();

            String satir = "";

            while ((satir = okuyucu.readLine()) != null){
                sb.append(satir + "\n");
            }
            okuyucu.close();

            System.out.println(sb.toString());


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }



    public static void main(String[] args) {

        bufferedOku();



    }
}
