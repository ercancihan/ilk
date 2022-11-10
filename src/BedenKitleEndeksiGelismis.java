import java.util.Scanner;

public class BedenKitleEndeksiGelismis {

    public void bedenkitleendeksigelismis (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("kilonuzu giriniz : ");
        int kilo = scanner.nextInt();

        System.out.println("boyunuzu giriniz (örnek 1,83)");
        double boy = scanner.nextDouble();
        {

            double bki = (kilo / (boy * boy));

            if (bki < 18.5) {

                System.out.println("zayif");
            } else if (bki >= 18.5 && bki < 25) {

                System.out.println("normal");
            } else if (bki >= 25 && bki < 30) {
                System.out.println("kilolu");
            } else {
                System.out.println("obez");
            }


        }
    }


}
