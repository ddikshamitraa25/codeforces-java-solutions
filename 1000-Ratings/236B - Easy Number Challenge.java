import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = a * b * c;
        int[] divisors = new int[max + 1];
        for (int i = 1; i <= max; i++) {
            for (int j = i; j <= max; j += i) {
                divisors[j]++;
            }
        }
        long sum = 0;
        int MOD = 1073741824;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                for (int k = 1; k <= c; k++) {
                    sum += divisors[i * j * k];
                    sum %= MOD;
                }
            }
        }
        System.out.println(sum);
    }
}