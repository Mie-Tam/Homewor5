
package nguyentam;
import java.util.Scanner;
import java.util.Arrays;

public class daoNguoc {

    public static void main(String[] args) {
        Scanner bt = new Scanner(System.in);
        System.out.println("enter n ");
        int n = bt.nextInt();
        int temple ;
        int[] number = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("number [" + i + "]=");
            number[i] = bt.nextInt();
        }
        
        for (int i = 0; i < n/2; i++) {
            temple = number[i];
            number[i]= number[n - 1 - i];
            number[n - 1 - i]= temple;
            }
        for ( int i  = 0 ; i < n ; i ++){
            System.out.println(number [i]+" ");

        }
    }
}
    

