import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean inWord = false;
        for (int i = 0; i < s.length(); i++) {
            if (i + 2 < s.length() &&
                s.charAt(i) == 'W' &&
                s.charAt(i + 1) == 'U' &&
                s.charAt(i + 2) == 'B') {
                if (inWord) {
                    System.out.print(" ");
                    inWord = false;
                }
                i += 2; 
            }
            else {
                System.out.print(s.charAt(i));
                inWord = true;
            }
        }
    }
}