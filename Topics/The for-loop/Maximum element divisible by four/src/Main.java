import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num;
        int numMax4 = 0;
        for (int i = 0; i < n; i++) {
            if (n > 1000) {
                break;
            }
            num = scanner.nextInt();
            if (num % 4 == 0 && num > numMax4 && num <= 30_000) {
                numMax4 = num;
            }
        }
        System.out.println(numMax4);
    }
}