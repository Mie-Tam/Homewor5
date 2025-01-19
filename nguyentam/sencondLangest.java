
package nguyentam;
import java.util.Scanner;
import java.util.Arrays;


public class sencondLangest {

    public static void main(String[] args) {
        Scanner bt = new Scanner(System.in);
        System.out.println("Enter n ");
        int n = bt.nextInt();
        int[] number = new int[n];
        int max = number[0];

        for (int i = 0; i < n; i++) {
            System.out.print(" number [" + i + "]=");
            number[i] = bt.nextInt();
        }

        int sencond = number[1];
        if (sencond > max) {
            int temple = max;
            max = sencond;
            sencond = temple;
        }
        for (int i = 2; i < n; i++) {

            if (number[i] > max) {
                sencond = max;
                max = number[i];
            } else if (number[i] > sencond && number[i] != max) {
                sencond = number[i];
            }

        }

        System.out.println(max + "");
        System.out.println(sencond + "");

    }
}
