import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = scanner.nextInt();
        }
        int m1 = scanner.nextInt();
        int m2 = scanner.nextInt();
        boolean next = false;

        for (int i = 0; i < n - 1; i++) {
            if (list[i] == m1 && list[i + 1] == m2) {
                next = true;
            } else if (list[i] == m2 && list[i + 1] == m1) {
                next = true;
            }
        }
        System.out.println(!next);
    }
}