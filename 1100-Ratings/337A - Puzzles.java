import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i + n - 1 < m; i++) {
            int difference = arr[i + n - 1] - arr[i];
            answer = Math.min(answer, difference);
        }
        System.out.println(answer);
    }
}
