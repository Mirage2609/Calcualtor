import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int total = 0;
        int jumlahRisoles = input.nextInt();
        

        while(jumlahRisoles != 0){
            total += jumlahRisoles;
            jumlahRisoles = input.nextInt();
        }
        System.out.println(total);
    }
    
}
