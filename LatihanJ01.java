import java.util.Scanner;

public class LatihanJ01 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double jRadioaktif = input.nextDouble();
        int jumlahHari = input.nextInt();

        while(jumlahHari > 0){
            jRadioaktif = jRadioaktif / 2;
            jumlahHari -= 10;
        }
        System.out.printf("%.3f", jRadioaktif);
    }
}
