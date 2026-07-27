import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = Character.toUpperCase(s.charAt(0)) + s.substring(1);
        System.out.println(ans);
    }
}