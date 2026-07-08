import java.util.Scanner;

class TahunKabisat {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("## Progam Java Cek Tahun Kabisat ##");
        System.out.println("====================================");
        System.out.println();

        int year;
        char repeat;

        do {
            System.out.print("Masukkan Tahun: ");
            year = input.nextInt();

            if (year % 400 == 0) {
                System.out.println(year + " adalah tahun kabisat");
            } else if (year % 100 == 0) {
                System.out.println(year + " bukan tahun kabisat");
            } else if (year % 4 == 0) {
                System.out.println(year + " adalah tahun kabisat");
            } else {
                System.out.println(year + " bukan tahun kabisat");
            }

            System.out.println("Lanjut (y/n)");
            repeat = input.next().charAt(0);

        } while (repeat == 'y' || repeat == 'Y');

        input.close();
    }
}