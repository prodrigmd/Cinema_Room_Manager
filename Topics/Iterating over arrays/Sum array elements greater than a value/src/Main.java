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
        int max = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (list[i] > max) {
                sum += list[i];
            }
        }
        System.out.println(sum);
    }
}