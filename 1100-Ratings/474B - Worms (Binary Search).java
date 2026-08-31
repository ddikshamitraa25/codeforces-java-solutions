import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prefix = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int worms = sc.nextInt();
            sum += worms;
            prefix[i] = sum;
        }
        int m = sc.nextInt();
        while (m-- > 0) {
            int q = sc.nextInt();
            int left = 0;
            int right = n - 1;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (prefix[mid] >= q) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            System.out.println(left + 1);
        }
    }
}