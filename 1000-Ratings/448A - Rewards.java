import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int b3 = sc.nextInt();
        int n = sc.nextInt();
        int cups = a1 + a2 + a3;
        int medals = b1 + b2 + b3;
        int cupShelves = (cups + 4) / 5;
        int medalShelves = (medals + 9) / 10;
        if (cupShelves + medalShelves <= n) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}