import java.util.Scanner;

public class Latihan2{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();
        int terbalik = 0;

        while(angka != 0){
            int digit = angka % 10;
            terbalik = terbalik * 10 + digit;
            angka = angka / 10;
        }
        System.out.println(terbalik);
    }
}
