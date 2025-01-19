
package nguyentam;

import java.util.Scanner;
import java.util.Arrays;
public class pimre {
    public static void main(String[] args) {
        Scanner bt = new Scanner(System.in);
        System.out.println("Enter n ");
        int n = bt.nextInt();
        int[] number = new int[n];
       
        for (int i = 0; i < n; i++) {
            System.out.print(" number [" + i + "]=");
            number[i] = bt.nextInt();
        }
        for (int i = 2; i <= 100; i++) {
            boolean prime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prime = false;
break;
                }
            }

            if (prime && i < n ) {
                System.out.println(" res = " + number[i]);
            }
        }
    }
}
