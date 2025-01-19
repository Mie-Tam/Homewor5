
package nguyentam;
import java.util.Scanner;
import java.util.Arrays;

public class soft {

    public static void main(String[] args) {
        Scanner bt = new Scanner(System.in);
        System.out.println("Enter n ");
        int n = bt.nextInt();
        int[] number = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(" number [" + i + "]=");
            number[i] = bt.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (number[i] > number[j]) {
                    int temple = number[i];
                    number[i] = number[j];
                    number[j] = temple;

                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(number[i] + "");
        }
    }
}
