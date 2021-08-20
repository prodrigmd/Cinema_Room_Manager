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
        int max = 0;
        for (int i = list.length - 1; i > 0; i--) {
            int max1 = list[i] * list[i - 1];
            if (max1 > max) {
                max = max1;
            }
        }
        System.out.println(max);
    }
}