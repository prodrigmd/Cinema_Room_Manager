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
        int num = scanner.nextInt();
        int count = 0;
        for (int x : list) {
            if (x == num) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}