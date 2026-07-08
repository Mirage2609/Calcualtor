import java.util.Scanner;

public class LatihanFor_Rekursif01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka = input.nextInt();

        for(int i = 1; i <= angka; i++){
            if(i % 2 == 0){
                System.out.println(i + " Genap");
            }else{
                System.out.println(i + " Ganjil");
            }
        }
    }
}
