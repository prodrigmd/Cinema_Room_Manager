import java.util.Scanner;

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
        boolean findIt = false;

        for (int i = 0; i < n - 1; i++) {
            if (m1 == list[i] && m2 == list[i + 1]) {
                findIt = true;
            } else if (m2 == list[i] && m1 == list[i + 1]) {
                findIt = true;
            }
        }
        System.out.println(findIt);
    }
}