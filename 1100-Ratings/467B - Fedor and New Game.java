import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] players = new int[m];
        for (int i = 0; i < m; i++) {
            players[i] = sc.nextInt();
        }
        int fedor = sc.nextInt();
        int count = 0;
        for (int i = 0; i < m; i++) {
            int difference = players[i] ^ fedor;
            if (Integer.bitCount(difference) <= k) {
                count++;
            }
        }
        System.out.println(count);
    }
}
