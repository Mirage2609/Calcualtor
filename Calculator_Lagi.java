import java.util.Scanner;

public class Calculator_Lagi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char repeat;

        do {
            System.out.println("==== OPERASI MATEMATIKA ====");
            System.out.println("[1] Penjumlahan");
            System.out.println("[2] Pengurangan");
            System.out.println("[3] Perkalian");
            System.out.println("[4] Pembagian");
            System.out.println("[5] Akar Kuadrat");

            System.out.print("Pilih Operasi: ");
            int operasi = sc.nextInt();

            double hasil = 0;

            if (operasi == 5) {
                System.out.print("Masukkan Angka Pertama: ");
                double angka = sc.nextDouble();

                if (angka >= 0) {
                    hasil = Math.sqrt(angka);
                    System.out.println("Hasil: " + hasil);
                } else {
                    System.out.println("Operasi Akar Kuadrat tidak boleh kurang dari 0");
                }
            } else {
                System.out.print("Masukkan Angka Pertama: ");
                double angka1 = sc.nextInt();

                System.out.print("Masukkan Angka Kedua: ");
                double angka2 = sc.nextInt();

                switch (operasi) {
                    case 1:
                        hasil = angka1 + angka2;
                        break;
                    case 2:
                        hasil = angka1 - angka2;
                        break;
                    case 3:
                        hasil = angka1 * angka2;
                        break;
                    case 4:
                        if (angka2 != 0) {
                            hasil = angka1 / angka2;
                        } else {
                            System.out.println("Pembagi tidak boleh angka 0");
                        }
                        break;
                    default:
                        System.out.println("Tidak ada operasi yang dipilih!!");
                        break;
                }
                System.out.println("Hasil: " + hasil);
            }

            System.out.print("Lanjut? (y/n): ");
            repeat = sc.next().charAt(0);

        } while (repeat == 'y' || repeat == 'Y');

        sc.close();
    }
}