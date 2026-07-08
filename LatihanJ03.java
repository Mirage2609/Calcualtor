import java.util.Scanner;

public class LatihanJ03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bilangan = input.nextInt();
        int bilanganAwal = bilangan;   // simpan nilai asli
        int totalAkhir = 0;

        while (bilangan > 0) {
            int digit = bilangan % 10;   // ambil digit terakhir

            int faktorial = 1;
            int i = 1;
            while (i <= digit) {
                faktorial *= i;
                i++;
            }

            totalAkhir += faktorial;
            bilangan = bilangan / 10;    // buang digit terakhir
        }

        if (totalAkhir == bilanganAwal) {
            System.out.println("YA");
        } else {
            System.out.println("BUKAN");
        }
    }
}
