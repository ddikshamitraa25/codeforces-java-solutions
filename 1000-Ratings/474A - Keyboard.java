import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char dir = sc.next().charAt(0);
        String s = sc.next();
        String keyboard = "qwertyuiopasdfghjkl;zxcvbnm,./";
        for (char c : s.toCharArray()) {
            int pos = keyboard.indexOf(c);
            if (dir == 'R') {
                System.out.print(keyboard.charAt(pos - 1));
            } else {
                System.out.print(keyboard.charAt(pos + 1));
            }
        }
        System.out.println();
    }
}
