import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n = scanner.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = scanner.nextInt();
        }
        int[] list2 = new int[n];
        for (int i = n - 1; i > 0; i--) {
            list2[i] = list[(i - 1) % n];
        }
        list2[0] = list[n - 1];
        for (int num : list2) {
            System.out.print(num + " ");
        }
    }
}