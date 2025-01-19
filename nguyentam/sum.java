
package nguyentam;
import java.util.Scanner;
import java.util.Arrays;

public class sum {
    public static void main(String[] args) {
        Scanner bt = new Scanner(System.in);
        System.out.println("Enter n ");
        int n = bt.nextInt();
        int[] number = new int[n];
        int s = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(" number [" + i + "]=");
            number[i] = bt.nextInt();
        }
        for (int i = 0; i < n; i++) {
            s= s + number [i];
        }
        System.out.println("sum = "+ s);
    }
}
