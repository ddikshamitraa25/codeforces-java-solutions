import java.util.*;
public class Main {
    static int[] tree;
    static int[] arr;
    static void build(int node, int left, int right, boolean or) {
        if (left == right) {
            tree[node] = arr[left];
            return;
        }
        int mid = (left + right) / 2;
        build(node * 2, left, mid, !or);
        build(node * 2 + 1, mid + 1, right, !or);
        if (or) {
            tree[node] = tree[node * 2] | tree[node * 2 + 1];
        } else {
            tree[node] = tree[node * 2] ^ tree[node * 2 + 1];
        }
    }
    static void update(int node, int left, int right,
                       int pos, int value, boolean or) {
        if (left == right) {
            tree[node] = value;
            return;
        }
        int mid = (left + right) / 2;
        if (pos <= mid) {
            update(node * 2, left, mid, pos, value, !or);
        } else {
            update(node * 2 + 1, mid + 1, right, pos, value, !or);
        }
        if (or) {
            tree[node] = tree[node * 2] | tree[node * 2 + 1];
        } else {
            tree[node] = tree[node * 2] ^ tree[node * 2 + 1];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int size = 1 << n;
        arr = new int[size];
        tree = new int[4 * size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        boolean rootOr = (n % 2 == 1);
        build(1, 0, size - 1, rootOr);
        while (m-- > 0) {
            int p = sc.nextInt();
            int b = sc.nextInt();
            update(1, 0, size - 1, p - 1, b, rootOr);
            System.out.println(tree[1]);
        }
        sc.close();
    }
}