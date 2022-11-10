import java.util.Scanner;

public class BedenKitleEndeksi {
public BedenKitleEndeksi() {

}
    public void indeksHesapla() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("kilonuzu girin");
        int kilo = scanner.nextInt();
        System.out.println("boyunuzu girin: örnek 1,72");
        double boy = scanner.nextDouble();

        double bke = (kilo / (boy * boy));

        System.out.println("vücut kitle endeksiniz : " + bke);

    }

}


