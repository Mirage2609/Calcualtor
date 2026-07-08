import java.util.Scanner;

public class LatihanJ02 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int risoles = input.nextInt();
        int total = 0;
        int count = 0;

        while(risoles != 0){
            total += risoles;
            count++;
            risoles = input.nextInt();
        }
        double rata_Rata = (double) total / count;
        System.out.printf("%.2f", rata_Rata);
    }
    
}
