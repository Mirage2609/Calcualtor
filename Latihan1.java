import java.util.Scanner;

public class Latihan1{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int Namoeba = input.nextInt();
        int jumlahAmoeba = 30;
        int waktu = 0;

        do { 
            jumlahAmoeba *= 2;
            waktu += 15;
        } while(jumlahAmoeba < Namoeba);
        System.out.println(waktu);
    }
}