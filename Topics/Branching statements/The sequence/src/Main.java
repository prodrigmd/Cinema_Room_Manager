import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        boolean stopIt = false;
        int j = 0;

        for (int i = 1; !stopIt; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(i + " ");
                j++;
                if (j == n) {
                    stopIt = true;
                    break;
                }
            }
        }
    }
}