package proekt9;
import java.util.Scanner;

public class elka{
    public static void main(String[] args) {
        Scanner tastatura = new Scanner(System.in);
        System.out.print("Napisi ja goleminata na elkata: ");
        int visina = tastatura.nextInt();
        for (int i = 1; i <= visina; i++) {
            for (int j = visina - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i = 1; i <= visina / 2; i++) {
            System.out.print(" ");
            for (int j = visina - 3; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2; k++) {
                System.out.print("|");
            }
            System.out.println();
        }
    }
}
		  
