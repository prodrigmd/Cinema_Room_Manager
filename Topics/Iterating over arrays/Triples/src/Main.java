import  java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (list[i] == list[i - 1] + 1 && list[i] == list[i - 2] + 2) {
                count++;
            }
        }
        System.out.println(count);
    }
}