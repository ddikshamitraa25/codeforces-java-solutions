import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int normal = n * a;
        int special = (n / m) * b + (n % m) * a;
        int allSpecial = ((n + m - 1) / m) * b;
        int answer = Math.min(normal, Math.min(special, allSpecial));
        System.out.println(answer);
    }
}