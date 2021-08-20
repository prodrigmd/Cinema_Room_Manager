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
        int count = 1;
        int sequence = 1;
        for (int i = 1; i < n; i++) {
            if (list[i] > list[i - 1]) {
                count++;
                if (count > sequence) {
                    sequence = count;
                }
            } else {
                count = 1;
            }
        }
        System.out.println(sequence);
    }
}