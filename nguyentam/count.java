
package nguyentam;

import java.util.Scanner;
import java.util.Arrays;

public class count {

    public static void main(String[] args) {
        Scanner bt = new Scanner(System.in);
        System.out.println("Enter n ");
        int n = bt.nextInt();
        int[] number = new int[n];
        int count = 0;
        int dem = 0;

        for (int i = 0; i < n; i++) {
            System.out.print(" number [" + i + "]=");
            number[i] = bt.nextInt();
        }

        for (int i = 0; i < n; i++) {

            if (number[i] % 2 == 0) {
                count++;
            } else if (number[i] % 2 == 1) {
                dem++;
            }
        }

        System.out.println("so chan " + count);
        System.out.println("so le " + dem);

    }
}









